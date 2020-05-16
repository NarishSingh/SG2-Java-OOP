/*
Simple Calculator MVC
-take 2 numbers
-perform arithmetic calculation and return result
-log calculation, can print log
 */
package com.sg.simplecalc;

import com.sg.simplecalc.controller.CalcController;
import com.sg.simplecalc.dao.CalcDAO;
import com.sg.simplecalc.dao.CalcDAOImpl;
import com.sg.simplecalc.ui.CalcView;
import com.sg.simplecalc.ui.UserIO;
import com.sg.simplecalc.ui.UserIOImpl;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public class App {

    public static void main(String[] args) {
        UserIO io = new UserIOImpl();
        CalcView v = new CalcView(io);
        CalcDAO dao = new CalcDAOImpl();
        CalcController c = new CalcController(dao, v);

        c.run();
    }

}
