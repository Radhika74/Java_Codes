public class Cls {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        //methods of string
        System.out.println(a.concat(b)); //returns "HelloWorld"
        System.out.println(a.charAt(0)); //returns 'H'
        System.out.println(a.length()); //returns 5
        System.out.println(a.substring(1)); //returns "ello"
        System.out.println(a.substring(1, 3)); //returns "el"
        System.out.println(a.toUpperCase()); //returns "HELLO"
        System.out.println(a.toLowerCase()); //returns "hello"
        System.out.println(a.equals(b)); //returns false
        System.out.println(a.equalsIgnoreCase(b)); //returns false
        System.out.println(a.indexOf('l')); //returns 2
        System.out.println(a.lastIndexOf('l')); //returns 3
        System.out.println(a.replace('l', 'p')); //returns "Heppo"
        System.out.println(a.startsWith("He")); //returns true
    }
}
