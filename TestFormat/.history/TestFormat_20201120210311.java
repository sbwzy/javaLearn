public class TestFormat {
    public static void main(String[] args){
        String s = String.format("%,d",100000000);
        System.out.println(s);
        System.out.println(String.format("I have %,.4f bugs to fix.",476578.09876));
        System.out.println(String.format("%,6.1f",42.000));
        System.out.println(String.format("%,5.1f",42.000));
    }
}
