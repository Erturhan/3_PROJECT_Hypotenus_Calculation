import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        double edge1 ;
        double edge2 ;
        double edge3 ;
        double angleRadyan ;
        double angleDerece;

        System.out.print("Please , write the first side of the trigangle :");
        edge1 = scan.nextDouble();
        System.out.print("Please , write the second side of the trigangle :");
        edge2 = scan.nextDouble();
        System.out.print("Please , write the angle :");
        angleDerece = scan.nextDouble();
        angleRadyan = ( angleDerece * Math.PI) / 180 ;

        double angle = Math.cos(angleRadyan);

        edge3 = Math.sqrt((Math.pow(edge1,2))+(Math.pow(edge2,2))-2 * edge2 *edge1 * angle );

        System.out.println("The length of the third edge : " + edge3);

    }
}