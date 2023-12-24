import javax.swing.plaf.nimbus.State;

public class Array2DProblem {

    public static int count(int san[][]) {
        int count = 0 ;
        int key =7;
        for (int i = 0; i < san.length; i++) {
            for (int j = 0; j < san[0].length; j++) {
                if (san[i][j]==key) {
                    count++;
                    
                }
                
            }
        }return count;
        
    }

    public static int sumNums(int nums[][]){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=nums[0].length-1; j++) {
                if (j<nums[0].length && i==1) {
                    sum = sum+nums[i][j];
                    
                }
                
            }
        }return sum;
    }
    public static void main(String[] args) {
        // int san [][]={{4,7,8},{8,8,7}};
        int nums [] [] ={{1,4,9},{11,4,3},{2,2,3}};
        // System.out.println(count(san));
        System.out.println(sumNums(nums));
    }
    
}
