/*
Stretch Goal V2

DVD Library Entension : Loan Process
The idea is to extend your existing DVD Library project to allow a few more
opperations by the user. NOTE: You should probably do this work in a separate
repo or branch, as to not break your current finished assignment. Here are the
additional requirements:
1. Implement a Service layer. This will have an interface and a single
implementation. This service will now have access to your DAO(s) and your
controller will have access to your Service.
2. Implement a User object. This will include a DTO, DAO, and access to the DAO
will be in your new service layer. You will also need controller and view
functionality that will allow your CRUD functionality for the User class.
3. Allow the user of the application to check out and check in DVD's from to and
from a User. This may mean changes to your DTO's. Your functionality that checks
to see if the book is already loaned or if it is available will be done within
your service.
4. Before implementing any of these new features, build out your new updated UML
and use it to design and construct the new features. Plan, then build.
If you have any questions, feel free to reach out, but understand that this is a
stretch assignment. It is not entended to be graded, but to allow you a bit more

 */
package com.sg.m2dvdlibrary;

import com.sg.m2dvdlibrary.controller.DVDLibraryController;
import com.sg.m2dvdlibrary.service.ServiceDAO;
import com.sg.m2dvdlibrary.service.ServiceDAOImpl;
import com.sg.m2dvdlibrary.ui.DVDLibraryView;
import com.sg.m2dvdlibrary.ui.UserIO;
import com.sg.m2dvdlibrary.ui.UserIOImpl;

public class App {

    public static void main(String[] args) {
        UserIO io = new UserIOImpl();
        DVDLibraryView v = new DVDLibraryView(io);
//        DVDLibraryDAO dao = new DVDLibraryDAOImpl();
        ServiceDAO serv=new ServiceDAOImpl();
        DVDLibraryController c = new DVDLibraryController(serv, v);

        c.run();
    }

}
