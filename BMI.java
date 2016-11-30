class BMI{
    void computeBMI(float height, float weight) {
        String res=null;
        float bmi=(float) weight/ (height * height);
        System.out.printf("Your BMI is %.2f", bmi);
        if (bmi<=18.5) {
            res="저 체중";
        } else if (bmi>=18.5 && bmi<23) {
            res="정상 체중";
        } else if (bmi>=23 && bmi<25) {
            res="위험 체중";
        } else if (bmi>=25 && bmi<30) {
            res="overweight";
        } else if (bmi>=30 && bmi<40) {
            res="비만 2단계";
        } else if (bmi>=40) {
            res="비만 3단계";
        } else {
            res="오류";
        }
        return res;
    }
    public static void main(String[] args){
		float result;
		BMI b = new BMI();
		result = b.calc(70f, 180f);
		b.printResult(result);
}