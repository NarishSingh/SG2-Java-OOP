package ExStudentQuizScores;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    /**
     * Print a message
     *
     * @param message {String} message to be printed to console
     */
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    /**
     * Print a prompt and read line
     *
     * @param prompt {String} prompt to be printed to console
     * @return {String} user's String
     */
    @Override
    public String readString(String prompt) {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        String userInput = input.nextLine();
        
        return userInput;
    }

    /**
     * Print a prompt and read in an integer
     *
     * @param prompt {String} prompt to be printed to console
     * @return {int} user's integer
     */
    @Override
    public int readInt(String prompt) {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        int userInput = input.nextInt();
        
        return userInput;
    }

    /**
     * Print a prompt and read in an integer, accepting only if it is within
     * specified range
     *
     * @param prompt {String} prompt to be printed to console
     * @param min    {int} minimum integer for acceptable inputs
     * @param max    {int} maximum integer for acceptable inputs
     * @return {int} user's integer in range
     */
    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.println(prompt);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        do {
            System.out.print("Enter integer: ");
            userInput = input.nextInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    /**
     * Print a prompt and read in a double
     *
     * @param prompt {String} prompt to be printed to console
     * @return {double} user's double
     */
    @Override
    public double readDouble(String prompt) {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        double userInput = input.nextDouble();
        
        return userInput;
    }

    /**
     * Print a prompt and read in a double, accepting only if it is within
     * specified range
     *
     * @param prompt {String} prompt to be printed to console
     * @param min    {double} minimum double for acceptable inputs
     * @param max    {double} maximum double for acceptable inputs
     * @return {double} user's double in range
     */
    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner input = new Scanner(System.in);
        double userInput;

        System.out.println(prompt);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        do {
            System.out.print("Enter double: ");
            userInput = input.nextDouble();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    /**
     * Print a prompt and read in a float
     *
     * @param prompt {String} prompt to be printed to console
     * @return {float} user's float
     */
    @Override
    public float readFloat(String prompt) {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        float userInput = input.nextFloat();
        
        return userInput;
    }

    /**
     * Print a prompt and read in a float, accepting only if it is within
     * specified range
     *
     * @param prompt {String} prompt to be printed to console
     * @param min    {float} minimum float for acceptable inputs
     * @param max    {float} maximum float for acceptable inputs
     * @return {float} user's float in range
     */
    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner input = new Scanner(System.in);
        float userInput;

        System.out.println(prompt);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        do {
            System.out.print("Enter float: ");
            userInput = input.nextFloat();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    /**
     * Print a prompt and read in a long
     *
     * @param prompt {String} prompt to be printed to console
     * @return {long} user's long
     */
    @Override
    public long readLong(String prompt) {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        long userInput = input.nextLong();
        
        return userInput;
    }

    /**
     * Print a prompt and read in a long, accepting only if it is within
     * specified range
     *
     * @param prompt {String} prompt to be printed to console
     * @param min    {long} minimum long for acceptable inputs
     * @param max    {long} maximum long for acceptable inputs
     * @return {long} user's long in range
     */
    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner input = new Scanner(System.in);
        long userInput;

        System.out.println(prompt);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        do {
            System.out.print("Enter long: ");
            userInput = input.nextLong();
        } while (userInput < min || userInput > max);

        return userInput;
    }

}
