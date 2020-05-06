/*
-unmarshal StateCapitals2.txt for a HashMap
--key = String for state name
--value = capital obj
-print how many loaded into HM
-print all
-prompt user for pop limit -> print all states over limit
-prompt user for area limit in mi^2 -> print all states over limit
 */
package ExStateCapitals3;

import java.io.*;
import java.util.*;

public class StateCap3 {

    public static void main(String[] args) throws IOException {
        Map<String, Capital> stateCapsInfo = new HashMap<>();

        Scanner read = new Scanner(new BufferedReader(new FileReader("StateCapitals2.txt")));
        
        while (read.hasNextLine()) {
            String currentLine=read.nextLine();
            String[] token=currentLine.split("::");
            stateCapsInfo.put(token[0], new Capital(token[1], Integer.parseInt(token[2]), Double.parseDouble(token[3])));
        }
        
        Set<String> stateInfoList = stateCapsInfo.keySet();
        System.out.println("The US has " + stateInfoList.size() + " states");

        System.out.println("\nCapital List:");
        for (String s : stateInfoList) {
            System.out.println(s + "'s capital is " + stateCapsInfo.get(s));
        }
        
        //TODO finish the pop/area limit prompt
    }

}
