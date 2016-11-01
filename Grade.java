class Grade{
    void computeGrade(double marks){
        if(marks >= 90 && marks <=100){
            System.out.println("Your Grade is "+marks+" A!");
        }
		else if(marks >= 80 && marks <90){
            System.out.println("Your Grade is "+marks+" B");
        }
		else if(marks >= 70 && marks <80){
            System.out.println("Your Grade is "+marks+" C");
        }
		else if(marks >= 60 && marks <70){
            System.out.println("Your Grade is "+marks+" D");
        }
		else
			System.out.println("Your Grade is "+marks+" F");
    }
    public static void main(String[] args){
        double marks = 75.0;
        computeGrade(marks);
    }
}