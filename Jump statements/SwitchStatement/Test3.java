
public class Test3 {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        switch (a) {
            case 10:
                System.out.println("Value of a is 10");
                break;
            case b: //error
                System.out.println("Value of a is 20");
                break;
            default:
                System.out.println("Value of a is neither 10 nor 20");
    
    }
}
