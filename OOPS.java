public class OOPS {
    public static void main(String[] args) {
        Student sanket =new Student();
        // Student s1 = new Student(21.33333);
        // sanket.setName("Sanket");
        // System.out.println(sanket.getName());
        sanket.setName("asmlr");
        System.out.println(sanket.rollNo);
        

    }
    
}

class Student{
    private String name;
    int age;
    double rollNo;

    Student(){
        System.out.println("Non-Argument");
    }
    Student(int age){
        this.age = age;
        System.out.println("The Age is :"+age);
    }

    Student(double rollNo){
        this.rollNo = rollNo;
        System.out.println("The RollNo is : "+rollNo);
    }  
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;

    }
}
