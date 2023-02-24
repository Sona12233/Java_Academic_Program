package inheritance;

public class Child extends Parent {
    public Child() {
        super.showMessage();
    }

    @Override
    public void showMessage() {
        System.out.println("Hello Child class");
    }


}

