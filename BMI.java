class BMI{
    void computeBMI(float height, float weight) {
        String res=null;
        float bmi=(float) weight/ (height * height);
        System.out.printf("Your BMI is %.2f", bmi);
        if (bmi<=18.5) {
            res="�� ü��";
        } else if (bmi>=18.5 && bmi<23) {
            res="���� ü��";
        } else if (bmi>=23 && bmi<25) {
            res="���� ü��";
        } else if (bmi>=25 && bmi<30) {
            res="overweight";
        } else if (bmi>=30 && bmi<40) {
            res="�� 2�ܰ�";
        } else if (bmi>=40) {
            res="�� 3�ܰ�";
        } else {
            res="����";
        }
        return res;
    }
    public static void main(String[] args){
        float result;
        BMI b = new BMI();
        result = b.calc(70f, 180f);
        b.printResult(result);
    }
}