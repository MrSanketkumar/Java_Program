import java.text.BreakIterator;

public class MeraSorting {


    public static void bubble(int arr[]) {
        int n =arr.length;
        System.out.println(n);
        for(int i  = 0; i< n-1;i++){
            for(int j = 0; j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }

    public static void selection(int arr[]) {
        for(int i = 0; i<arr.length; i++ ){
            int small = i;
            // System.out.println(small );
            for (int j = 0; j < arr.length; j++) {
                if (arr[small]>arr[j]) {
                    small=j;
                    System.out.println(j);
                }
            int temp = arr[small];
            arr[small]=arr[j];
            arr[j]=temp;   
            }
            
        }
        
    }


    public static void bbl(int arr[]){
        int n = arr.length;
        boolean san = true;
        for(int i =0 ; i<n-1;i++)
        {
            for(int j = 0; j<n-1-i; j++ )
            {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    
                }
                
            }
        
        }
    }
    // Printing Array
    public static void main(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
   
        }
        System.out.println();
    }


    public static void sel(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            int curr =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[curr]){
                    curr=j;
                }
                
            }
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] =temp;
                        
        }
         
    
    }


    public static void main(String[] args) {
        int arr[]={65,25,12,22,11};
        // bbl(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+" ");
        }

        System.out.println();
        bubble(arr);
        main(arr);
    }
    
}
