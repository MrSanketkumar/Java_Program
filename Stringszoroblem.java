import java.util.Scanner;

public class Stringszoroblem {


    public static void countVowels(String str) {
        char vow[] ={'a','i','e','u','o'};
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vow.length; j++) {
                if (str.charAt(i)==vow[j]) {
                    count++;
                }               
            }
      
        }
        System.out.println("There Are "+count+" Vowels in the Given String "+str);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String :");
        String str = sc.nextLine();
        countVowels(str);


    }

}

