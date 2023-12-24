import java.security.Principal;

public class Pattern2 {

    public static void patte(int rows , int column){
        for(int i = 1;i<=rows;i++){
            for(int j = 1; j<=column;j++){
                if(i==1 || i ==rows || j==1 || j==column  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        // patte(5, 9);

        int n =4;
        // for(int i = 1; i<=n; i++)
        // {
        //     for(int j=1; j<=4-i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j =1 ;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }System.out.println();

        // }
        int a = 1;
        
        for ( int i =1; i<=n;i++){
            for(int j = 1; j<=n-i+1;j++){
                System.out.print(" ");   
                System.out.print(j);  
            }System.out.println();
        }
        
    }
    
}
