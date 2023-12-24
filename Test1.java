class Test {
    Test(double d){
        this(10);
        System.out.println("The Double Constructor");

    }
    Test(int i){
        this();
        System.out.println("Int Constructor");
    }
    Test(){
        System.out.println("The Default Constructor");
    }
    
}


public class Test1{
    public static void main(String[] args) {
        Test t1 = new Test();
    }
}

