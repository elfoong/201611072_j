import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
class DrawTriangleOrSquare{
    enum Shape{TRIANGLE, RECTANGLE}
    public void drawTriangleOrSquare(int size, int sides, double angle){
        for(int i=0; i<sides; i++){
            t1.fd(size);
            t1.right(angle);
        }
    }
    public static void main(String[] args) {
        Shape sel = Shape.TRIANGLE;
        int size = 100;
        int sides = 0;
        double angle = 0;
        switch(sel) {
            case TRIANGLE:
                sides = 3;
                angle = 120;
                break;
            case SQUARE:
                sides = 4;
                angle = 90;
                break;
		DrawTriangleOrSquare{ t = new DrawTriangleOrSquare{();
		t.drawTriangleOrSquare(size, sides, angle);		
        
import ch.aplu.turtle.*;

class ShapeTriangle{
    Turtle t1 = new Turtle();
    enum Shape{TRIANGLE, RECTANGLE}
    public void drawSquareOrTriangle(int size, int sides, double angle){
        t1.home();
        t1.clean();
        for(int i=0; i<sides; i++){
            t1.fd(size);
            t1.right(angle);
        }
    }
    public static void main(String[] args) {
        Shape sel = Shape.TRIANGLE;
        int size = 100;
        int sides = 0;
        double angle = 0;
        switch(sel) {
          case TRIANGLE:
            sides = 3;
            angle = 120;
            break;
          case RECTANGLE:
            sides = 4;
            angle = 90;
            break;
        }
        import ch.aplu.turtle.*;

class ShapeTriangle{
    Turtle t1 = new Turtle();
    enum Shape{TRIANGLE, RECTANGLE}
    public void drawSquareOrTriangle(int size, int sides, double angle){
        t1.home();
        t1.clean();
        for(int i=0; i<sides; i++){
            t1.fd(size);
            t1.right(angle);
        }
    }
    public static void main(String[] args) {
        Shape sel = Shape.TRIANGLE;
        int size = 100;
        int sides = 0;
        double angle = 0;
        switch(sel) {
          case TRIANGLE:
            sides = 3;
            angle = 120;
            break;
          case RECTANGLE:
            sides = 4;
            angle = 90;
            break;
        }
        drawTriangleOrSquare t = new drawTriangleOrSquare();
        t.drawTriangleOrSquare(size, sides, angle);
        System.out.println("Size :%d Sides :%d Angle: %.1f",size,sides,angle);
    }
}
