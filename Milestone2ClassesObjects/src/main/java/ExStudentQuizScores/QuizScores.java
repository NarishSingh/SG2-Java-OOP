/*
use UserIO implemented class
-store quiz data in HashMap -> student name as key, ArrayList of ints for 
quizzes
-design a UI -> view list, add/remove student, view list of quiz scores, view 
avg scor for one student
-calculate the avg quiz score for class
-list students w highest quiz score
-list students w lowest quiz score
 */
package ExStudentQuizScores;

import java.util.*;

public class QuizScores {

    public static void main(String[] args) {
        boolean appRunning = true;
        UserIOImpl io = new UserIOImpl();
        Map<String, List<Integer>> course = new HashMap<>();
        Set<String> studentList = course.keySet();

        //course management UI
        System.out.println("Welcome to the course manager.");
        System.out.println("1 | View Student List");
        System.out.println("2 | Add Student");
        System.out.println("3 | Remove Student");
        System.out.println("4 | View Student Quiz Scores");
        System.out.println("5 | View Student's Average Score");
        System.out.println("6 | View Course Average");
        System.out.println("7 | View Top Student");
        System.out.println("8 | View Lowest Scoring Student");
        System.out.println("9 | Exit Program");

        do {
            int ui = io.readInt("Choose from the above menu: ", 1, 9);
            switch (ui) {
                case 1: { //view list
                    for (String s : studentList) {
                        System.out.println(s);
                    }
                    break;
                }
                case 2: { //add
                    List<Integer> quizList = new ArrayList<>();
                    boolean adding = true;

                    String name = io.readString("Enter student's full name: ");
                    System.out.print("Enter Quiz Scores (1-100%), Enter 0 to stop entry:");
                    while (adding) {
                        int quizScore = io.readInt("", 0, 100);
                        if (quizScore == 0) {
                            adding = false;
                        } else {
                            quizList.add(quizScore);
                        }
                    }

                    course.put(name, quizList);
                    break;
                }
                case 3: { //remove
                    String name = io.readString("Enter student's full name: ");
                    course.remove(name);
                    break;
                }
                case 4: { //all quizzes for student
                    String name = io.readString("Enter student's full name: ");
                    List<Integer> studentQuizList = course.get(name); //get a student's ArrayList
                    for (Integer q : studentQuizList) {
                        System.out.println(q);
                    }
                    break;
                }
                case 5: { //avg score for student
                    double studentQuizSum = 0; //so avg calculates to double
                    int studentQuizCount = 0;

                    String name = io.readString("Enter student's full name: ");
                    List<Integer> studentQuizList = course.get(name);
                    for (Integer q : studentQuizList) {
                        studentQuizSum += q;
                        studentQuizCount++;
                    }

                    double studentAvg = studentQuizSum / studentQuizCount;
                    System.out.println("Student Average = " + studentAvg + "%");
                    break;
                }
                case 6: { //course avg
                    double courseQuizSum = 0; //so avg calculates to double
                    int courseQuizCount = 0;

                    for (String s : studentList) {
                        double studentQuizSum = 0;
                        int studentQuizCount = 0;

                        //get singular student total
                        List<Integer> studentQuizList = course.get(s);
                        for (Integer q : studentQuizList) {
                            studentQuizSum += q;
                            studentQuizCount++;
                        }

                        //add student totals to course totals
                        courseQuizSum += studentQuizSum;
                        courseQuizCount += studentQuizCount;
                    }

                    double courseAvg = courseQuizSum / courseQuizCount;
                    System.out.println("Class Average = " + courseAvg + "%");
                    break;
                }
                case 7: { //top student
                    String bestStudent = "";
                    int bestInClass = 0;

                    for (String s : studentList) {
                        int studentBestScore = 0;

                        //find a student's best score
                        List<Integer> studentQuizList = course.get(s);
                        for (Integer q : studentQuizList) {
                            if (q > studentBestScore) {
                                studentBestScore = q;
                            }
                        }

                        //if best score so far, store student's name and set new bestInClass
                        if (studentBestScore > bestInClass) {
                            bestStudent = s;
                            bestInClass = studentBestScore;
                        }
                    }

                    System.out.println("Top Student = " + bestStudent);
                    break;
                }
                case 8: { //class dunce
                    String worstStudent = "";
                    int worstInClass = 100;

                    for (String s : studentList) {
                        int studentWorstScore = 100;

                        //find a student's worst score
                        List<Integer> studentQuizList = course.get(s);
                        for (Integer q : studentQuizList) {
                            if (q < studentWorstScore) {
                                studentWorstScore = q;
                            }
                        }

                        //if worst score so far, store student's name and set new worstInClass
                        if (studentWorstScore < worstInClass) {
                            worstStudent = s;
                            worstInClass = studentWorstScore;
                        }
                    }

                    System.out.println("Worst Student = " + worstStudent);
                    break;
                }
                default: {
                    System.out.println("Exiting App...");
                    appRunning = false;
                }
            }

            System.out.println("-------");
        } while (appRunning);
    }

}
