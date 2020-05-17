package com.sg.simplecalc.dao;

import com.sg.simplecalc.dto.Calculation;
import java.util.*;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public interface CalcDAO {

    /**
     * Perform the operation with fields stored in the Calculation object and
     * then store the result
     *
     * @param calc {Calculation} partially filled obj
     * @return {Calculation} the same obj fed in as an obj with all fields now
     *         filled
     */
    Calculation performCalc(Calculation calc);

    /**
     * Log a completed calculation to CALC_LOG_FILE and returns the obj
     *
     * @param ID   {long} timestamp
     * @param calc {Calculation} obj to be logged
     * @return {Calculation} the calculation obj successfully logged, null
     *         otherwise
     * @throws CalcDAOException if unable to load or write to the log file
     */
    Calculation logCalc(long ID, Calculation calc) throws CalcDAOException;

    /**
     * Read in user's log from file
     *
     * @return {List} all calculation objects
     * @throws CalcDAOException if cannot read from file
     */
    List<Calculation> getLog() throws CalcDAOException;

    /**
     * Get calculation object from a valid timestamp
     *
     * @param timestampID {long} the timestamp of the calculation
     * @return {Calculation} the obj
     * @throws CalcDAOException if cannot read from log
     */
    Calculation getCalc(long timestampID) throws CalcDAOException;

    /**
     * Clears calculation log
     *
     * @throws CalcDAOException if cannot read in or write to log file
     */
    void clearLog() throws CalcDAOException;

}
