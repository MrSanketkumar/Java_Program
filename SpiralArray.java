public class SpiralArray {



    public static void spiralProblem(int arr[][]){
        int strrow=0;
        int endrow=arr.length-1;
        int srtcol=0;
        int endcol = arr[0].length-1;

        while(strrow<=endrow && srtcol<=endcol){
            //top
            for(int j = srtcol; j<=endcol; j++){
                System.out.print(arr[strrow][j]+" ");
            }
            //right
            for (int i = strrow+1; i <=endrow; i++) {
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for(int j = endcol-1; j>=srtcol;j--){
                System.out.print(arr[endrow][j]+" ");
            }
            //left
            for (int i = endrow-1; i >=strrow+1; i--) {
                System.out.print(arr[i][srtcol]+" ");
            }

            strrow++;
            endrow--;
            srtcol++;
            endcol--;
            
      
        }System.out.println();
    }

    public static void rightDiagonal(int arr[][]){
        int j = 0;
        int i2 =arr.length-1;
        int sum=0;
        for(int i = 0 ; i<=i2; i++){
            System.out.print(sum+" + ");
            sum +=arr[i][j];
            
            j++;
        }
        System.out.print("0 = "+sum);  
    }
    public static void leftdiagonal(int arr[][]){
        int i =0;
        int j2 = arr[0].length-1;
        int sum= 0 ;
        for(int j = j2; j>=0 ; j--){
            System.out.print(sum+" + ");
            sum += arr[i][j];
            i++;
        }
         System.out.println("0 = "+sum);
        
    }



    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

                    spiralProblem(arr);
                    System.out.println("RIGHT VALUE :");
                    rightDiagonal(arr);
                    System.out.println("\nLEFT VALUE :");
                    leftdiagonal(arr);
    }
    
}
