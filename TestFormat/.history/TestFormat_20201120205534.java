public class TestFormat {
    public static void main(String[] args){
        String s = String.format("%,d",100000000);
        System.out.println(s);
        System.out.println(String.format("I have %.2f bugs to fix.",476578.09876));
    }
}
