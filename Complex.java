class ComplexOp{
    int Add(int a , int b){

        return a+b;
    }

    int Sub(int a , int b){
        return a-b;
    }

    int mul(int a , int b){
        return a*b;
    }
}


public class Complex {
    public static void main(String[] args) {
        ComplexOp c1 = new ComplexOp();
        System.out.println("The Add IS :"+c1.Add(10, 5));
        System.out.println("The Sub is :"+c1.Sub(10, 5));
        System.out.println("The Multi Is :"+c1.mul(10, 5));
        
    }
    
}
