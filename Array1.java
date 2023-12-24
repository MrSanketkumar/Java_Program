import java.util.*;

public class Array1 {

    public static void update(int mark[]) {

        for (int i = 0; i < mark.length; i++) {
            mark[i] = mark[i]+1; 
            
        }
        
    }

    public static int linearSearch(int Search[],int key) {
        for (int i = 0; i < Search.length; i++) {
            if (key == Search[i]) {
                return i;
                // System.out.print(i);  
            }
            // return -1;
            
        }return -1;
        
    }

    public static int getLargest(int san[]){
        int largest = Integer.MIN_VALUE;
        int small  = Integer.MAX_VALUE;
        for (int i = 0; i < san.length; i++) {
            if (largest < san[i]) {
                largest=san[i];       
            }if(small>san[i]){  
                small=san[i];

            }
        }  System.out.println(small);
        return largest;
    }

    public static void reverse(int san[])
     {
        int first = 0; int last = san.length-1;
        while (first<last) {
            int temp = san[first];
            san[first]=san[last];
            san[last] = temp ; 
            first++;
            last--;
            
        }
     }

     public static void pairArray(int san[]) {

        for (int i = 0; i < san.length; i++) {
            for (int j = i+1; j < san.length; j++) {
                System.out.print("("+san[i]+","+san[j]+")");
                
            }
            System.out.println();
            
        }

     }

    public static void subArray(int san[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < san.length; i++) {
            // System.out.print(san[i]+san[i+1]);
            for (int j = i; j < san.length; j++) {
                // System.out.print(san[j]+san[j+1]);
                sum=0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum +=san[j2];   
                }
                System.out.println(sum);
                if (max<sum) {
                    max=sum;
                    
                }    
            }           
        }
        System.out.println("Max Sum :"+max);
    }


     public static void kadane(int san[]) {
        int max= Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < san.length; i++) {
            cs = cs + san[i];
            if (cs<0) {
                cs =0;  
            }
            max= Math.max(cs, max);
            
        }System.out.println(max);
        
    }
    public static void main(String[] args){
        // int Mark01[] = new int[67];
        // int mark[] ={1,2,35,68};
        // update(mark);
        // for (int i = 0; i< mark.length; i++) {
        //     System.out.print(mark[i]);
            
        // }
        // System.out.println();

        // int Search[]={2,4,6,8,10,12,14,16};
        // int key = 14;
        // // linearSearch(Search, key);
        // int sanket= linearSearch(Search, key);
        // if (sanket == -1){
        //     System.out.println("Not Found");
        // }else{
        //     System.out.println("Found "+ sanket);
        // }


        int san[]={2,7,8,-2,-5,-1};
        for (int i = san.length-1; i>0; i--) {
            System.out.println(san[i]);
        }

        // for (int i = san.length-1; i>=0; i--) {
        //     System.out.print(san[i]+" ");
            
        // }

        // System.out.println(getLargest(san));
        // System.out.print(reverse(san));    
        // // reverse(san);
        // pairArray(san);
        // subArray(san);
        // for (int i = 0; i < san.length; i++) {
        //     System.out.print(san[i]+" ");
            
        // }

        // kadane(san);
        }

    }
    

