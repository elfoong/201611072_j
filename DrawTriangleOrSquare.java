import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
class DrawTriangleOrSquare{
    enum Shape{TRIANGLE, RECTANGLE}
    public void drawTriangleOrSquare(int size, int sides, double angle){
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
            case SQUARE:
                sides = 4;
                angle = 90;
                break;
        }
        DrawTriangleOrSquare{ t = new DrawTriangleOrSquare{();
        t.drawTriangleOrSquare(size, sides, angle);
        System.out.println("Size is : "+size);
        System.out.println("Sides is : "+sides);
        System.out.println("Angle is : "+angle);
    }
}