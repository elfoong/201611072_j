/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1 = new Turtle();

class TurtleDraw {
    void makeSwirlSquare(int size,int bigger,int turns,double degree) {
        int size=5;
        int bigger=15;
        int turns=20;
        double degree=90.0;
        for(int i=0;i<turns;i++) {
            if (i%2!=0) {
                size+=bigger;
            }
            t1.forward(size);
            t1.right(degree);
        }
    }
}

TurtleDraw t = new TurtleDraw();
t.makeSwirSquare(size,bigger,turns,degree);