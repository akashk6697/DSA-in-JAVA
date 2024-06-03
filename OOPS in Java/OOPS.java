class Student{
    String name;
    int age;
    String location; 
    //// method in java
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.location);
        
    }
}


public class OOPS {

    public static void main(String[] args) {
        //// creating object using new keyword
        Student s1 = new Student();
        s1.name = "akash";
        s1.age = 25;
        s1.location = "GanjBasoda";
    
        s1.printInfo();

    }
}
