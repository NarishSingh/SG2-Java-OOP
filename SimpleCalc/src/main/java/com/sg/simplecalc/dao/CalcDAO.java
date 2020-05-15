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
    Calculation logCalc(String ID, Calculation calc) throws CalcDAOException;
}
