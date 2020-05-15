/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.simplecalc.dao;

import com.sg.simplecalc.dto.Calculation;
import java.util.*;
import java.io.*;

public class CalcDAOImpl implements CalcDAO {

    private Map<String, Calculation> log=new HashMap<>();
    private static final String CALC_LOG="";
    private static final String DELIMITER = "::";
    
    @Override
    public Calculation logCalc(String ID, Calculation calc) throws CalcDAOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /*Data (Un)marshalling*/
    private Calculation unmarshallCalc(String calcAsText){
        String[] calcTokens=calcAsText.split(DELIMITER);
        
        long calcID=Long.parseLong(calcTokens[0]);
        Calculation calcFromLog=new Calculation(calcID);
        
        calcFromLog.setFirstNum(Double.parseDouble(calcTokens[1]));
        calcFromLog.setOperation(calcTokens[2]);
        calcFromLog.setSecondNum(Double.parseDouble(calcTokens[3]));
        calcFromLog.setResult(Double.parseDouble(calcTokens[4]));
        
        return calcFromLog;
    }
    
    private String marshallCalc(Calculation calc){
        String calcAsText=calc.getTimestampID()+DELIMITER;
        calcAsText +=calc.getFirstNum()+DELIMITER;
        calcAsText +=calc.getOperation()+DELIMITER;
        calcAsText +=calc.getSecondNum()+DELIMITER;
        calcAsText +=calc.getResult();
        
        return calcAsText;
    }
    
    
}
