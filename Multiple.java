class Multiple{
	int sum = 0;
	void calc(int degree){
		for(int i=0; i<degree; i++){
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		System.out.printf("3�� 5�� ����� ���� %d\n", sum);
	}
	public static void main(String[] args){
		Multiple m = new Multiple();
		int range = 1000;
		m.calc(range);
	}
}
