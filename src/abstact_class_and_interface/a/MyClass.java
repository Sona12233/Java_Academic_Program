package abstact_class_and_interface.a;

public class MyClass implements A {

    @Override
    public void methodOne() {
        System.out.println("Method one");
    }

    @Override
    public void methodSecond() {
        System.out.println("Method second");
    }


}

class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodOne();
        obj.methodSecond();
    }
}
