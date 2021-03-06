package ExSimpleCalculatorInterfaceRefactor;

public class Calculations2 {

    /*fields*/
    private double firstNum;
    private double secondNum;

    /*ctor*/
    public Calculations2() {

    }

    /*getter/setters*/
    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    /*behaviors*/
    /**
     * add two numbers
     *
     * @return {double} sum of user inputs
     */
    public double addInputs() {
        return getFirstNum() + getSecondNum();
    }

    /**
     * subtract two numbers in order
     *
     * @return {double} difference of user inputs
     */
    public double subtractInputs() {
        return getFirstNum() - getSecondNum();
    }

    /**
     * multiple two numbers
     *
     * @return {double} product of user inputs
     */
    public double multiplyInputs() {
        return getFirstNum() * getSecondNum();
    }

    /**
     * divide two numbers
     *
     * @return {double} quotient of user inputs in order
     */
    public double divideInputs() {
        return getFirstNum() / getSecondNum();
    }

    /**
     * get user inputs and set them to firstNum and secondNum Refactored to
     * utilize UserIO implemented class
     */
    public void userNums() {
        UserIOImpl io = new UserIOImpl();
        double a = io.readDouble("Enter first number: ");
        setFirstNum(a);

        double b = io.readDouble("Enter second number: ");
        setSecondNum(b);
    }

    /**
     * print calculation results and control the main while loop
     *
     * @param operation {int} 1-5 - the user choice with 1-4 corresponding to
     *                  math operations and 5 or anything else exiting the main
     *                  while loop and program
     * @return {boolean} true - if an operation is perform, false - if user
     *         wants to exit
     */
    public boolean calculate(int operation) {
        switch (operation) {
            case 1: {
                userNums();
                System.out.println(addInputs());
                return true;
            }
            case 2: {
                userNums();
                System.out.println(subtractInputs());
                return true;
            }
            case 3: {
                userNums();
                System.out.println(multiplyInputs());
                return true;
            }
            case 4: {
                userNums();
                System.out.println(divideInputs());
                return true;
            }
            default: {
                return false;
            }
        }
    }
}
