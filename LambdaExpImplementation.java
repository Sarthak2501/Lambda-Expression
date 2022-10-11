@FunctionalInterface
interface Drawable{
    public void draw();
}


public class LambdaExpImplementation {
    public static void main(String[] args) {
        int width = 10;

        //Without using Lambda Expression
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();

        //With implementing Lambda Expression
        Drawable d2 = () ->{
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
