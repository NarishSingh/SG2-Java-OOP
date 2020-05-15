package com.sg.simplecalc.dao;

import com.sg.simplecalc.dto.Calculation;
import java.util.*;
import java.io.*;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public interface CalcDAO {
    //TODO make impl
    //TODO make javadoc
    
    Calculation performCalc(Calculation calc) throws CalcDAOException;
    
    Calculation logCalc(long ID, Calculation calc) throws CalcDAOException;

    List<Calculation> getLog() throws CalcDAOException;

    Calculation getCalc(long timestampID) throws CalcDAOException;

    List<Calculation> clearLog() throws CalcDAOException;
    
}
