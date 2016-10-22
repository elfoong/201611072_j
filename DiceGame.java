import 
class Dice {
    private int num = 0;
    public void roll() {
        num = (int) (Math.random() * 6 + 1);
        System.out.println("Appear " + num);
    }
    public int getNum() {
        return this.num;
    }
}

class Player {
    private String name;
    int num=0;
	int firstnum=0;
	int secondnum=0;
    public Player(String name) {
        This.name=name;
    }
    public void play() {
        Dice d=new Dice();
        d.roll();
        firstnum=d.getNum();
		d.roll();
		secondnum=d.getNum();
    }
    public String getName() {
        return this.name;
    }
    public int score() {
		sum=firstnum + secondnum;
        return this.sum;
    }
}


class DiceGame {
    Player p1;
    Player p2;
    public void startGame() {
        p1 = new Player("Palyer1");
        p2 = new Player("Player2");
        p1.play();
        p2.play();
        if (p1.score() > p2.score(){
            System.out.println(p1.getName() + " won");
        }
        else if (p1.score() < p2.score()) {
            System.out.println(p2.getName() + " won");
        }
        else
            System.out.println("Draw");
    }
}

DiceGame g=new DiceGame();
g.startGame();