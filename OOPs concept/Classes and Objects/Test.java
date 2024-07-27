class TestCase{
    void show(){
    System.out.println("Calling Show Function");

    }
    static void display(){
    System.out.println("Calling Display Function");

    }
}


public class Test {

    public static void main(String[] args) {
        
TestCase t1= new TestCase();
t1.show();
TestCase.display();


    }
    
}
