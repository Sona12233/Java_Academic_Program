package abstact_class_and_interface.shape;

public class Square extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw square");
    }

    @Override
    public void erase() {
        System.out.println("Erase square");
    }
}
