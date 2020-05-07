/*
This interface defines the methods that must be implemented by any class that 
wants to play the role of DAO in the application. You could imagine, however, an 
implementation that 
only stored student data in memory or one that stored student data in a database.
Each class would be different but all would implement that same interface, 
ensuring that they are all well encapsulated. Note that the ClassRosterController 
only uses this interface to reference the DAO — it is completely unaware of the 
implementation details.

-for impl file
This is the text file-specific implementation of the ClassRosterDao interface.
 */
package com.sg.classroster.dao;

public interface ClassRosterDao {
    //TODO MAKE IMPLEMENTATION FILE
}
