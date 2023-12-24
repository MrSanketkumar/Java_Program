import java.util.Scanner;

// import javax.swing.text.html.parser.Element;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //   IF-ELSE ........................

        // System.out.println("Enter Age :");
        // int age =sc.nextInt();
        // if (age>=18 && age<=100){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }

        

        // System.out.println("Enter The NO :");
        // int num= sc.nextInt();
        // if (num%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("ODD");
        // }

        //   ELSE-IF..........................

        // System.out.println("Enter Your INCOME :");
        // int inc=sc.nextInt();
        // if (inc < 5){
        //     System.out.println("NO TAX");
        // }else if (inc >=5 && inc <=10){
        //     System.out.println("10% TAX");
        // }else {
        //     System.out.println("50% TAX");
        // }
        // System.out.println("Enter NUM1");
        // int num1=sc.nextInt();
        // System.out.println("Enter NUM2");
        // int num2 =sc.nextInt();
        // System.out.println("Enter NUM3");
        // int num3 =sc.nextInt();

        // if ((num1>=num2) && (num1>=num3)){
        //     System.out.println("NUM1 IS GREATER");
            
        // }
        // else if (num2>=num3)
        // {
        //     System.out.println("NUM2 IS GREATER");
        // }
        // else
        // {
        //     System.out.println("NUM3 IS GREATER");
        // }

        //   TERNARY OPERATOR............................


        // System.out.println("Enter Ur Marks :");
        // int mrk=sc.nextInt();
        // String res = (mrk>=33)?"PASS":"FAIL";
        // System.out.println(res);


        //   SWITCH....................................

        System.out.println("\nWELCOME CALCULATOR....");
        System.out.println("\nENTER THE NUMBER A:");
        int a =sc.nextInt();
        System.out.println("\nENTER THE NUMBER B:");
        int b =sc.nextInt();

        System.out.println("\nEnter The Operation U Want TO PERFORM :");
        String s = sc.next();

        switch(s){
            case "+" : 
            System.out.println("THE ANS : "+a+b);
            break;
            case "-" :
             System.out.println("THE ANS : "+(a-b));
            break;
            case "*" :
             System.out.println("THE ANS : "+a*b);
            break;
            case "/" :
             System.out.println("THE ANS : "+(a/b));
            break;
            case "%" :
             System.out.println("THE ANS : "+a%b);
            break;
            default: 
            System.out.println("Wrong");

        }

    }
    
}
