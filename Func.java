import java.util.Scanner;

import javax.print.DocFlavor.READER;

public class Func {

    public static void printWord(int a){
        System.out.print("Sanket");
        System.out.print(" VinodKumar");
        System.out.print(" Chaudhay");
        // System.out.println(a);
    }

    public static void cal(int a, int b){
        int sum =0;
       
        sum =a+b;
        System.out.println("Sum is :"+sum);

    }

    public static void sawp(int a ,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
       
        System.out.println(b);
    }
    public static int product(int a ,int b){
        int pro = a*b;
        return pro;
    }

    public static int fact(int a){
        int f =1; 
         for (int i =1; i<=a; i++){
            f =f*i;
         }
         return f;

    }

    public static int bino(int n, int r){
        int a = fact(n);
        int b =fact(r);
        int c = fact(n-r);
        int total = a/(b*c);

        return total;
    }

    public static void primeno(int n)
    { 
        if (n==2)
        {
            System.out.println("prime "+n);
            
            
        }
        for(int i =2; i<=n-1; i++){
            if (n%i==0){
                System.out.println("not Prime ");
                break;
            }
        }
    }

    public static void ex(int n ){

        for(int i =2 ; i<=n; i++){
            primeno(i);
        }

    }
    public static void main(String args[]){
        // printWord(5);
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a");
        // int a = sc.nextInt();
        // System.out.println("Enter b");
        // int b =sc.nextInt();

        
        // int res = product(a,b);
        // System.out.println("The Product Is : "+res);
        // sawp(a, b);
        // cal(a,b);
        // System.out.println(fact(4))
        // System.out.println(bino(5,2));


        // primeno(9);
        ex(10);

    }

}