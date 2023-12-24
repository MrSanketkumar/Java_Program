import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        
//     Scanner t =new Scanner(System.in);
//    for (int i = 1; i <=t; i++) {
//     int a[] ={41,18467,6334,26500,19169};

//         double mean=0;
//         int n = a.length;
//         for (int i = 0 ; i<a.length; i++){
//             mean = mean + a[i];
//             // System.out.print(mean);
//         }
//         System.out.print(mean/n);



//     }

// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int rev = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
//  System.out.println(rev);


 char n = 'a';
 String dh = "cdx";
 int count = 0;
 for (int i = 0; i < dh.length(); i++) {
    if (n==dh.charAt(i)) {
        count+=i;
        System.out.println(dh);
        n++;
    } else {
        continue;
    }
    System.out.println(count);
    
 }


   }
}


