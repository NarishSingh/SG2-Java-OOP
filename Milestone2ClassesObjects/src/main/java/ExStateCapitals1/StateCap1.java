package ExStateCapitals1;

import java.util.HashMap;
import java.util.Set;

public class StateCap1 {

    public static void main(String[] args) {
        //hashmap
        HashMap<String, String> StateCapitals = new HashMap<>();

        StateCapitals.put("Alabama", "Montgomery");
        StateCapitals.put("Alaska", "Juneau");
        StateCapitals.put("Arizona", "Phoenix");
        StateCapitals.put("Arkansas", "Little Rock");
        StateCapitals.put("California", "Sacramento");
        StateCapitals.put("Colorado", "Denver");
        StateCapitals.put("Delaware", "Dover");
        StateCapitals.put("Florida", "Tallahassee");
        StateCapitals.put("Georgia", "Atlanta");
        StateCapitals.put("Hawaii", "Honolulu");
        StateCapitals.put("Idaho", "Boise");
        StateCapitals.put("Illinois", "Springfield");
        StateCapitals.put("Indiana", "Indianapolis");
        StateCapitals.put("Iowa", "Des Moines");
        StateCapitals.put("Kansas", "Topeka");
        StateCapitals.put("Kentucky", "Frankfurt");
        StateCapitals.put("Louisiana", "Baton Rouge");
        StateCapitals.put("Maine", "Augusta");
        StateCapitals.put("Maryland", "Annapolis");
        StateCapitals.put("Massachusetts", "Boston");
        StateCapitals.put("Michigan", "Lansing");
        StateCapitals.put("Minnesota", "Saint Paul");
        StateCapitals.put("Mississippi", "Jackson");
        StateCapitals.put("Missouri", "Jefferson City");
        StateCapitals.put("Montana", "Helena");
        StateCapitals.put("Nebraska", "Lincoln");
        StateCapitals.put("Nevada", "Carson City");
        StateCapitals.put("Concord", "New Hampshire");
        StateCapitals.put("New Jersey", "Trenton");
        StateCapitals.put("New Mexico", "Santa Fe");
        StateCapitals.put("New York", "Albany");
        StateCapitals.put("North Carolina", "Raleigh");
        StateCapitals.put("North Dakota", "Bismarck");
        StateCapitals.put("Ohio", "Columbus");
        StateCapitals.put("Oklahoma", "Oklahoma City");
        StateCapitals.put("Oregon", "Salem");
        StateCapitals.put("Pennsylvania", "Harrisburg");
        StateCapitals.put("Rhode Island", "Providence");
        StateCapitals.put("South Carolina", "Columbia");
        StateCapitals.put("South Dakota", "Pierre");
        StateCapitals.put("Tennessee", "Nashville");
        StateCapitals.put("Texas", "Austin");
        StateCapitals.put("Utah", "Salt Lake City");
        StateCapitals.put("Vermont", "Montpellier");
        StateCapitals.put("Virginia", "Richmond");
        StateCapitals.put("Washington", "Olympia");
        StateCapitals.put("West Virgina", "Charleston");
        StateCapitals.put("Wisconsin", "Madison");
        StateCapitals.put("Wyoming", "Cheyenne");

        //print
        Set<String> StateCapSet = StateCapitals.keySet(); //get keys

        System.out.println("States:");
        for (String s : StateCapSet) {
            System.out.println(s);
        }

        System.out.println("-------");
        System.out.println("State Capitals:");
        for (String s : StateCapSet) {
            System.out.println(StateCapitals.get(s));
        }

        System.out.println("-------");
        for (String s : StateCapSet) {
            System.out.println("The Capital of " + s + " is " + StateCapitals.get(s));
        }
    }

}
