/*
Basic arithmetic calculator
 */
package ExSimpleCalculatorInterfaceRefactor;

public class Calculator2 {

    public static void main(String[] args) {
        boolean calculating = true;
        UserIOImpl io = new UserIOImpl();

        System.out.println("Welcome to the console based calculator!");
        System.out.println("Select Operation:");

        while (calculating) {
            Calculations2 c = new Calculations2();

            System.out.println("1 | Addition");
            System.out.println("2 | Subtraction");
            System.out.println("3 | Multiplication");
            System.out.println("4 | Division");
            System.out.println("5 | Exit");
            int choice = io.readInt("Enter choice", 1, 5);
            System.out.println();
            calculating = c.calculate(choice);

            System.out.println("-------");
        }
    }

}
