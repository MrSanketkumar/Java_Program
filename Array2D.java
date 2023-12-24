import java.util.Scanner;

public class Array2D {

    public static void prinArray(int arr[][]) {
    int n = arr.length;
    int m =arr[0].length;

     for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(arr[i][j]+ " ");
            }
         System.out.println();   
        }
}

public static void search(int arr[][], int key){
     for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==key) {
                    System.out.print("Key Found At "+("("+i+","+j+")"));
                    break;
                    
                }
                
            }
            
        }
    System.out.println("Not ");
}


public static void largest(int arr[][])
{
    int lrgst= Integer.MIN_VALUE;
     for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]> lrgst) {
                    lrgst=arr[i][j];  
                }
                
            }
            
        }
    System.out.println(lrgst);
}

public static void small(int arr[][])
{
    int sml= Integer.MAX_VALUE;
     for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]< sml) {
                    sml=arr[i][j];  
                }
                
            }
            
        }
    System.out.println(sml);
}
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }

    System.out.println("The Array :");
    prinArray(arr);
    System.out.println("Largest_Element_Of_Array :");
    largest(arr);
    System.out.println("Smallest_Element_Of_Array :");
    small(arr);
    }
    
}
