package inheritance;

public class SubClass extends SuperClass{
    String message = "Hello SubClass";

    public SubClass(){
        System.out.println(super.message);
        System.out.println(this.message);
    }
}
