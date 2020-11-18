public class Duck{
    int size;

    public Duck(){
        System.out.println("Quark!");
    }

    public void setSize(int newSize){
        size = newSize;
    }
}

public class UseADuck{
    public static void main(String[] args){
        Duck d = new Duck();

        d.setSize(42);
    }
}