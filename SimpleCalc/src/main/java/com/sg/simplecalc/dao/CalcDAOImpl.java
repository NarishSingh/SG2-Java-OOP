package com.sg.simplecalc.dao;

import com.sg.simplecalc.dto.Calculation;
import java.util.*;
import java.io.*;

public class CalcDAOImpl implements CalcDAO {

    private Map<Long, Calculation> log = new HashMap<>();
    private static final String CALC_LOG_FILE = "CalculationLog.txt";
    private static final String DELIMITER = "::";

    @Override
    public Calculation logCalc(String ID, Calculation calc) throws CalcDAOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*Data (Un)marshalling*/
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

    private String marshallCalc(Calculation calc) {
        String calcAsText = calc.getTimestampID() + DELIMITER;
        calcAsText += calc.getFirstNum() + DELIMITER;
        calcAsText += calc.getOperation() + DELIMITER;
        calcAsText += calc.getSecondNum() + DELIMITER;
        calcAsText += calc.getResult();

        return calcAsText;
    }

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

    private void loadLog() throws CalcDAOException {
        Scanner sc;
        
        try {
            sc=new Scanner(new BufferedReader(new FileReader(CALC_LOG_FILE)));
        } catch (FileNotFoundException e) {
            throw new CalcDAOException("Couldn't load file to memory.", e);
        }
        
        String currentLine;
        Calculation currentCalc;
        
        while (sc.hasNextLine()) {
            currentLine=sc.nextLine();
            currentCalc=unmarshallCalc(currentLine);
            
            log.put(currentCalc.getTimestampID(), currentCalc);
        }
        
        sc.close();
    }
}
