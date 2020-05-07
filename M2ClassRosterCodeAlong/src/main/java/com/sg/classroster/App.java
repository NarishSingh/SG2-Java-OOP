/*
rules:
1. The Controller is the "brains of the operation." It knows what needs to be done, when it needs to be done, and what component can do it. It acts like a general contractor, directing work but never doing the work itself.
2. The View (and any helper classes) is responsible for all user interaction. No other component is allowed to interact with the user.
3.The DAO is responsible for the persistence and retrieval of Student data.
4. The DTO is the container for Student data. The DAO and DTO comprise the Model.
5. All components (Model, View, and Controller) can use DTOs.
6. The Controller can talk with both the View and the DAO.
7. The DAO cannot access the View.
8. The View cannot access the DAO.
 */
package com.sg.classroster;

public class App {

    public static void main(String[] args) {
        ClassRosterController controller = new ClassRosterController();

        controller.run();
    }

}
