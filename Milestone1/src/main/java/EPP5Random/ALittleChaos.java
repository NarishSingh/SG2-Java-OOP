package EPP5Random;

import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Random integer: " + rand.nextInt());
        System.out.println("Random double: " + rand.nextDouble());
        System.out.println("Random boolean: " + rand.nextBoolean());

        int num = rand.nextInt(100);

        System.out.println("Stored randomized result: " + num);
        System.out.println("We can repeat it: " + num + ", " + num);

        System.out.println("Let's just generate new ones:");
        System.out.print(rand.nextInt(101) + ", ");
        System.out.print(rand.nextInt(101) + ", ");
        System.out.print(rand.nextInt(101) + ", ");
        System.out.print(rand.nextInt(101) + ", ");
        System.out.print(rand.nextInt(101) + ", ");
        System.out.println(rand.nextInt(101));

        System.out.println((rand.nextInt(51) + 50)); //this will generate a number from 51-100

        /*
        Trial 1:
        Random integer: 1659308587
        Random double: 0.8811513030455855
        Random boolean: true
        Stored randomized result: 97
        We can repeat it: 97, 97
        Let's just generate new ones:
        28, 38, 96, 65, 87, 50
        71
        
        Trial 2:
        Random integer: -1419468145
        Random double: 0.029909019261332492
        Random boolean: true
        Stored randomized result: 71
        We can repeat it: 71, 71
        Let's just generate new ones:
        70, 64, 47, 51, 66, 24
        75
        
        Trial 3:
        Random integer: -206796473
        Random double: 0.1353735056319616
        Random boolean: false
        Stored randomized result: 2
        We can repeat it: 2, 2
        Let's just generate new ones:
        51, 29, 61, 36, 78, 85
        53
         */
    }

}
