/** CA1 - Window Master
 * Take window height and width
 * calculate area, perimeter
 * Calculate cost based on $3.50/ft^2 of glass window, $2.25/ft of trim
 */
package CodeAlong1WindowMaster;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        float height;
        float width;
        String stringHeight;
        String stringWidth;
        float area;
        float cost;
        float perimeter;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter window height:");
        stringHeight=input.nextLine();
        height=Float.parseFloat(stringHeight);
        System.out.println("Please enter window width:");
        stringWidth=input.nextLine();
        width=Float.parseFloat(stringWidth);
        
        area=height*width;
        perimeter=2*(height+width);
        
        cost=((3.50f*area)+(2.25f*perimeter)); //normally read as double, "f" ensures its float literal
        
        System.out.println("Window height = " + height + "ft");
        System.out.println("Window width = " + width + "ft");
        System.out.println("Window area = " + area + "ft");
        System.out.println("Window perimeter = " + perimeter + "ft");
        System.out.println("Total cost = $" + cost);
    }
}
