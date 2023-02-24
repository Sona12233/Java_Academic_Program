package abstact_class_and_interface.shape;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Circle");
    }
    @Override
    public void erase(){
        System.out.println("Erase circle");
    }

}
