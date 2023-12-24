import java.util.Scanner;

public class Strings{

    public static void isPlaindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)==str.charAt(n-i-1)) {
                System.out.print("Plaindrome");
                break;
                
            } else {
                System.out.println("NOt A PlainDrome");
                break;
            }
            
        }
        
    }

    public static float shortestPAth(String path) {
        int x =0 , y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if( dir == 'S'){
                y--;
            }else if (dir == 'W'){
                x--;
            }else{
                x++;
            }
        
            
        }
        int x2 = x*y;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static String subString(String str, int si, int en) {
        String substr="";
        for (int i = si; i < en; i++) {
            substr += str.charAt(i);
            
        }
        return substr;
    }


public static void compression(String str) 
{
    String newstr= "";

    for (int i = 0; i < str.length(); i++) {
        Integer count= 1;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            count++;
            i++;
            
        }
        newstr += str.charAt(i);

        if (count>1) {
            newstr += count.toString();
            
        }
        
    }
    System.out.println(newstr);
}  


public static void main(String[] args) {
        // Scanner sc  = new Scanner(System.in);
        // String str  = sc.nextLine();
        // isPlaindrome(str);

        // String path="WNEENESENNN";
        // System.out.println(shortestPAth(path));

        // String str = "SANKETKUMAR";
        // System.out.println(subString(str, 0, 6));

        // String str [] = {"apple","mango","banana"};
        // String largst = str[0];
        // for (int i = 0; i < str.length; i++) {
        //     if (largst.compareTo(str[i])<0) {
        //         largst=str[i];
                
        //     }
            
        // }System.out.println(largst);

        String str = "aaabbcccdd";
        compression(str);
        
    }
}