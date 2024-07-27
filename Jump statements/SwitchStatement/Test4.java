
public class Test4 {
    public static void main(String[] args) {
        byte a=126;
        switch (a+1) {
            case 126:
                System.out.println("a is 126");
                break;
            case 127:
                System.out.println("a is 127");
                break;
            default:
                System.out.println("a is neither 126 nor 127");
        }
        
    }
    
}
