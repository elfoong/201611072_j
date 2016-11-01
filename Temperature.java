class Temperature{
	void convertTemperature(String sel, double temp){
		if(sel.equals("F")) {
			System.out.println("Convert F to C : "+(temp-32)/1.8+"C");
		}
		else if(sel.equals("C")) {
			System.out.println("Convert C to F : "+(temp*1.8+32)+"F");
		}
		else{
			System.out.println("Error");
		}
	}
	public static void main(String[] args){
		Temperature c = new Temperature();
		c.convertTemperature("C", 100.0);
		Temperature f = new Temperature();
		f.convertTemperature("F", 100.0);
	}
}