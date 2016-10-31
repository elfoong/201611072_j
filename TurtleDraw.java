import ch.aplu.turtle.*;
 
Turtle t1 = new Turtle();
class TurtleDraw{
    void drawTriangle(int size, double x, double y){
        t1.penUp();
        t1.setPos(x,y);
        t1.penDown();
        for(int i=0; i<3; i++){
            t1.fd(size);
            t1.right(120);
        }
    }
    void drawSquare(int size, double x, double y){
        t1.penUp();
        t1.setPos(x,y);
        t1.penDown();
        for(int i=0; i<4; i++){
            t1.fd(size);
            t1.right(90);
        }
    }
    void drawStar(int size, double x, double y){
        t1.penUp();
        t1.setPos(x,y);
        t1.penDown();
        for(int i=0; i<5; i++){
            t1.fd(size);
            t1.right(144);
        }
    }
}

TurtleDraw f = new TurtleDraw();
f.drawTriangle(70, -30.0 , 0.0);
f.drawSquare(60, 0.0 , 0.0);
f.drawStar(50, 30.0 , 0.0); 