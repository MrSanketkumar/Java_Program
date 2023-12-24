import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Pattern {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
    //     for(int i =1 ; i<=4;i++){
    //         for (int j =1; j<=4; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


    // for (int line = 0; line <=4; line++) {
    //     for(int star = 1 ; star <=line; star++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // for (int i=1 ; i<=4; i++){
    //     for(int a=1; a<=4-i+1; a++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // for( int i =5; i>=1; i--){
    //     for (int j=1 ; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // int a=1;

    // for (int i =1 ; i<=5;i++){
    //     for (int j=1; j<=i;j++){
    //         System.out.print(" ");
    //         System.out.print(" "+a);
    //         a++;
    //     }
    //    System.out.println();
    // }

    // System.out.println("Enter Number Rows :");
    // int n =sc.nextInt();
    // System.out.println("Enter Column :");
    // int a =sc.nextInt();
    // for (int i = 1; i<=n; i++){
    //     for (int j =1; j<=a; j++){
    //         System.out.print("#");
    //     }
    //     System.out.println();
    // }
    
    // int j =1;
    // for (int i =1 ; i<=4;i++){
        
    //     for( j =1 ; j<=4;j++){
    //         // System.out.print(j);
    //         System.out.println(i +" "+j);
    //     }
    // }

    // for (int i =1; i<=4; i++){
    //     for (int j =1 ; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    int i = 1;
        int j = 20;
        int k = 31;
        while (i < j) {
            k += (i * j);
            i = i * 2;
            j--;
        }
        System.out.println("i = " + i + " j = " + j + " k = " + k);
    }
    
}
