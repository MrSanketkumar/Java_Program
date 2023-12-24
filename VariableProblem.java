import java.util.Scanner;

public class VariableProblem {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Price Of Pencil ");
                float a=sc.nextFloat();
                System.out.println("Enter Price Of Pen");
                float b=sc.nextFloat();
                System.out.println("Enter Price Of Eraser");
                float c=sc.nextFloat();


                double sum =(a+b+c);
                double ab=sum/100*18;
                double tl=sum+ab;
                System.out.println("The Cost Of Item 1 :" +a+
                "\nThe Cost Of Item 2 :"+b+
                "\nThe Cost OF Item 3 :" +c+
                "\nThe Total Cost Is :" +sum+
                "\nThe GST 18% :" +ab+
                "\nSo Total Is :"+ tl);
                // System.out.println(ab);
        }

    //     int avg=(a+b+c)/3;
    //     System.out.println("The Avg Of Three Nmuber is  " +avg);


    // System.out.println("Enter Side A");
    // int b=sc.nextInt();
    // System.out.println("Enter Side B");
    // int c=sc.nextInt();

    // int area =b*c;
    // System.out.println("The Area of Square is "+ area);


    
    
    }
    
}
