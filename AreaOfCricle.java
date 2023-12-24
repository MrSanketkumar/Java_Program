import java.util.Scanner;

public class AreaOfCricle {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner( System.in)) {
            System.out.println("Enter the Radius Of the Cricle :");
            float r=sc.nextInt();
            float area =3.14f*(r*r);
            System.out.println("The area Of Cricle is "+area);
        }


       }
    
}
