/*
-Create HashMap to hold names of staes and their capitals
--State name key, capital value
-load with StateCapitals.txt
-print how many pairs are in map
-print all names
-make small knowledge game, print random capital and ask for its state
-challenge - prompt for how many states to guess, +1 for correct, -1 for wrong,
print total score at end
 */
package ExStateCapitals2;

import java.io.*;
import java.util.*;

public class StateCapitals2 {

    public static void main(String[] args) throws IOException {
        /*Unmarshall StateCapitals.txt*/
        //HashMap
        Map<String, String> statesCaps = new HashMap<>();

        //read doc and store to HashMap
        Scanner read = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
//        read.useDelimiter("::");

        while (read.hasNextLine()) {
            /*
            String line = read.nextLine();
            System.out.println(line);

            String StateText = read.next();
            String CapitalText = read.next();
             */

            String currentLine = read.nextLine(); //one entire line at a time
            String[] tokens = currentLine.split("::"); //split along the delimiter
            statesCaps.put(tokens[0], tokens[1]); //enter into HashMap
        }

        /*print to console*/
        Set<String> stateList = statesCaps.keySet(); //State name keys
        System.out.println("The US has " + stateList.size() + " states");

        System.out.println("\nCapital List:");
        for (String s : stateList) {
            System.out.println(s + "'s capital is " + statesCaps.get(s));
        }

        /*quiz game*/
        //dump keys and values to arrays
        Object[] stateNames = statesCaps.keySet().toArray();
        Object[] capNames = statesCaps.values().toArray();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int correct = 0;
        int wrong = 0;

        System.out.println("\nQuiz Time!!!");
        System.out.print("Enter number of states to guess: ");
        int q = Integer.parseInt(input.nextLine());
        if (q < 0) {
            throw new IllegalArgumentException("Invalid question number...");
        }

        for (int i = 0; i < q; i++) {
            int randomState = rand.nextInt(50);

            System.out.print("Enter the capital of " + stateNames[randomState] + ": ");
            String answer = input.nextLine();

            if (answer.equals(capNames[randomState])) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong!");
                wrong++;
            }
        }
        
        System.out.println("\nCorrect = " + correct + " | Wrong = " + wrong);
    }

}
