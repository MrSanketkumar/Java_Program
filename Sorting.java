public class Sorting {


    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int i = 0; i < arr.length-turn-1; i++) {
                if (arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    
                }
                
            } 
            
        }
        
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int small =i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[small]>arr[j]) {
                    small=j;
                      
                }   
            }
           int temp = arr[small];
            arr[small] = arr[i];
            arr[i]=temp; 
        }
        
    }


    public static void insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++)
         {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && curr < arr[prev]) 
            {
                arr[prev+1]=arr[prev];
                prev--;
                
            }     
            arr[prev+1]=curr;
            
        }
        
    }
    public static void printSortedArray(int arr[])
     {
        int n =arr.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
            // if (arr[i]!=arr[i+1]) 
            // {  
            //     System.out.print(arr[i]+" ");
            // }   
        }System.out.println();
        
     }

     public static void insr(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            arr[prev+1]=curr;
            
        }
        
     }

     public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
             largest = Math.max(largest, arr[i]);
        }

        int count [] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            
        }
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                count[j] = i;
                j++; 
                count[i]--;
            }
        }
     }
    public static void main(String[] args) {
        // int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int arr[]={5,3,4,1};
        // selectionSort(arr);
        printSortedArray(arr); 
        countingSort(arr); 
        printSortedArray(arr);

    }
    
}
