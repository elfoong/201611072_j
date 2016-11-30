package com.sd.ch8;

public class Turtle {
    protected int nLimbs=4;
    protected String food;
    public void setFood(String f) {
        this.food=f;
    }
    public void eat() {
        System.out.print("Turtle eats "+food);
    }
    public void setNlimbs(int number){
        this.nLimbs = number;
    }
    public void getNlimbs(){
        System.out.println("Turtle have " + nLimbs);
    }
    public static void main(String[] args) {
        Turtle t = new Turtle();
        LandTurtle lt = new LandTurtle();
        SeaTurtle st = new SeaTurtle();
        t.setNlimbs(4);
        lt.setNlimbs(4);
        st.setNlimbs(4);
        t.getNlimbs();
        lt.getNlimbs();
        st.getNlimbs();	
	}
}