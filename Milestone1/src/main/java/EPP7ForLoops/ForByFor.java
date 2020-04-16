/**
 * Change to match image
 */
package EPP7ForLoops;

public class ForByFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
                System.out.print("|");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) { //rows
            System.out.print("|"); //leftmost |'s

            for (int j = 0; j < 3; j++) { //columns

                for (int k = 0; k < 3; k++) { //bricks
                    if ((i == 0 || i == 2) && (j == 0 || j == 2)) {
                        System.out.print("*");

                    } else if (i==1 && (j==0||j==2)) {
                        System.out.print("$");
                    } else if ((i==0||i==2) && j==1) {
                        System.out.print("@");
                    } else if (i==1 && j==1) {
                        System.out.print("#");
                    }
                }

                System.out.print("|"); //3 right |'s
            }
            System.out.println(""); //newline
        }
    }

}
