package EPP7ForLoops;

public class ForAndTwentyBlackbirds {

    public static void main(String[] args) {
        int blackbirdsInPie = 0;
        for (int i = 0; i < 24; i++) {
            System.out.println("Blackbird #" + (i + 1) + " goes into the pie!"); //added 1 and encased i so it can display in a readable way
            blackbirdsInPie++;
        }

        System.out.println("There are " + blackbirdsInPie + " birds in there!");
        System.out.println("Why are there birds inside of a pie?");
    }

}
