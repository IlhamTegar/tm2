public class Calculating {
    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void AddAllNumber() {
        int sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
    }

    public void MultiplyNumber(int number1, int number2) {
        int hasil = number1 * number2;
        System.out.println(number1 + " x " + number2 + " = " + hasil);
    }

    public static void main(String[] args) {
        Calculating z = new Calculating();
        z.setNumber1(6);
        z.setNumber2(90);
        z.AddAllNumber();
        z.MultiplyNumber(z.number1, z.number2);
    }
}
