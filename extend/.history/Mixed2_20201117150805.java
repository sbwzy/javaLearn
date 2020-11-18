class A {
    int ivar = 7;
    void m1(){
        System.out.println("A's m1, ");
    }
    void m2(){
        System.out.println("A's m2, ");
    }
    void m3(){
        System.out.println("A's m3, ");
    }
}

class B extends A {
    void m1(){
        System.out.println("B's m2, ");
    }
}

class C extends B {
    void m3(){
        System.out.println("C's m3, "+(ivar + 6));
    }
}

public class Mixed2 {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1();
        c.m2();
        a.m3();
        a2.m1();
    }
}