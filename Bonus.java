import java.security.Principal;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.text.BreakIterator;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Bonus {
   
   
   
public static void pr(int n ){

    for (int i = 1 ; i<=n;i++){
        for(int j = 1 ; j<=n-i; j++)
        {
            System.out.print(" ");
        }
        for(int s =i ; s >=1 ; s--){
            System.out.print(s);
        }
        for(int a=2; a<=i; a++){
            System.out.print(a);
        }
        System.out.println();
        
    }
}

public static int sum(int a ){
    int res= 0;
    if ( a == 0){
        return 0;
    }
    else{
        res = a+sum(a-1);

    }
    return res;
}

public static void pattern(int n ) {
      for( int  i=n; i>=1; i--){
            for( int j = n ; j>i; j--){
                System.out.print(" ");
            }
            for( int a =1 ; a<=i; a++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
}

public static void binTodec(int n ){
    int pow = 0;
    int dec = 0;

    while (n>0) {
        int las =n % 10;
        dec = dec +(las *(int) Math.pow(2, pow));
        pow++;
        n= n/10;
    }
    System.out.println(dec);

}

public static void isEven(int n) {

    if (n%2==0){
        System.out.println("Even ");
    }else{
        System.out.println("odd");
    }
    
}

public static void plaindrome(int n) {
    int las;
    
    while(n>0){
        las =n%10;
        System.out.print(las);
        n= n/10;
    }
    // System.out.println(las);
    
}

    public static void main(String[] args) {
        // int n =5;
        // for(int i = 1 ; i<=n; i++)
        
        // {
        //     for(int j=1; j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int s =1 ; s<=i;s++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // // }

        // pr(5);
        // System.out.println(sum(10));
        // binTodec(101);

    
        // Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // if ( n==2){
        //     System.out.println("Prime");
            
        // }
        // else{
        //     for ( int i =2 ; i<=n; i++){
        //         if ( n%i==0){
        //             System.out.println("Not Prime");
        //             break;
        //         }else{
        //             System.out.println("Prime");
        //             break;
        //         }
            // }
            // }


        plaindrome(120);

            

        
        }
}
