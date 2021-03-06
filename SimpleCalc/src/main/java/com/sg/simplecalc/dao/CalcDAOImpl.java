package com.sg.simplecalc.dao;

import com.sg.simplecalc.dto.Calculation;
import java.util.*;
import java.io.*;

public class CalcDAOImpl implements CalcDAO {

    private Map<Long, Calculation> log = new HashMap<>();
    private static final String CALC_LOG_FILE = "CalculationLog.txt";
    private static final String DELIMITER = "::";

    @Override
    public Calculation performCalc(Calculation calc) {
        String operation = calc.getOperation();

        switch (operation) {
            case "+": {
                calc.setResult(calc.getFirstNum() + calc.getSecondNum());
                break;
            }
            case "-": {
                calc.setResult(calc.getFirstNum() - calc.getSecondNum());
                break;
            }
            case "*": {
                calc.setResult(calc.getFirstNum() * calc.getSecondNum());
                break;
            }
            case "/": {
                if (calc.getSecondNum() == 0) {
                    throw new IllegalArgumentException("Cannot divide by 0");
                } else {
                    calc.setResult(calc.getFirstNum() / calc.getSecondNum());
                }

                break;
            }
            case "%": {
                if (calc.getSecondNum() == 0) {
                    throw new IllegalArgumentException("Cannot divide by 0");
                } else {
                    calc.setResult(calc.getFirstNum() % calc.getSecondNum());
                }

                break;
            }
            case "^": {
                calc.setResult(Math.pow(calc.getFirstNum(), calc.getSecondNum()));
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown Command.");
            }
        }

        return calc;
    }

    @Override
    public Calculation logCalc(long ID, Calculation calc) throws CalcDAOException {
        loadLog();

        Calculation newCalc = log.put(ID, calc);
        writeLog();

        return newCalc;
    }

    @Override
    public List<Calculation> getLog() throws CalcDAOException {
        loadLog();
        return new ArrayList(log.values());
    }

    @Override
    public Calculation getCalc(long timestampID) throws CalcDAOException {
        loadLog();
        return log.get(timestampID);
    }

    @Override
    public void clearLog() throws CalcDAOException {
        loadLog();
        log.clear();
        writeLog();
    }

    /*Data (Un)marshalling*/
    /**
     * Unmarshall a line of text and construct Calculation obj from it
     *
     * @param calcAsText {String} a line of text in the log file
     * @return {Calculation} obj with all fields filled in
     */
    private Calculation unmarshallCalc(String calcAsText) {
        String[] calcTokens = calcAsText.split(DELIMITER);

        long calcID = Long.parseLong(calcTokens[0]);
        Calculation calcFromLog = new Calculation(calcID);

        calcFromLog.setFirstNum(Double.parseDouble(calcTokens[1]));
        calcFromLog.setOperation(calcTokens[2]);
        calcFromLog.setSecondNum(Double.parseDouble(calcTokens[3]));
        calcFromLog.setResult(Double.parseDouble(calcTokens[4]));

        return calcFromLog;
    }

    /**
     * Marshall a Calculation obj to delimited line of text for log file
     *
     * @param calc {Calculation} obj to be marshalled
     * @return {String} a delimited String containing all fields for a
     *         Calculation obj
     */
    private String marshallCalc(Calculation calc) {
        String calcAsText = calc.getTimestampID() + DELIMITER;
        calcAsText += calc.getFirstNum() + DELIMITER;
        calcAsText += calc.getOperation() + DELIMITER;
        calcAsText += calc.getSecondNum() + DELIMITER;
        calcAsText += calc.getResult();

        return calcAsText;
    }

    /**
     * Marshall all Calculation obj's to log file
     *
     * @throws CalcDAOException if log cannot be written to
     */
    private void writeLog() throws CalcDAOException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(CALC_LOG_FILE));
        } catch (IOException e) {
            throw new CalcDAOException("Could not update log.", e);
        }

        String calcAsText;
        List<Calculation> calcLog = new ArrayList(log.values());

        for (Calculation currentCalc : calcLog) {
            calcAsText = marshallCalc(currentCalc);
            out.println(calcAsText);
            out.flush();
        }

        out.close();
    }

    /**
     * Unmarshall delimited lines of text and unload Calculation obj's to
     * HashMap
     *
     * @throws CalcDAOException if log cannot be read from
     */
    private void loadLog() throws CalcDAOException {
        Scanner sc;

        try {
            sc = new Scanner(new BufferedReader(new FileReader(CALC_LOG_FILE)));
        } catch (FileNotFoundException e) {
            throw new CalcDAOException("Couldn't load file to memory.", e);
        }

        String currentLine;
        Calculation currentCalc;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentCalc = unmarshallCalc(currentLine);

            log.put(currentCalc.getTimestampID(), currentCalc);
        }

        sc.close();
    }
}
