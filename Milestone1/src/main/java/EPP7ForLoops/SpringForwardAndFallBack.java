package EPP7ForLoops;

public class SpringForwardAndFallBack {

    public static void main(String[] args) {
        //range 0-9
        System.out.println("It's Spring...!");
        for (int i = 1; i <= 10; i++) { //initialization changed to 1, termination changed to use <=
            System.out.print(i + ", ");
        }

        //range 10-1
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }

}
