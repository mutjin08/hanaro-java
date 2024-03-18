public class PrintEx {
    public static void main(String[] args) {
        int number = 10;
        double value = 3.14;

        System.out.print("Number: ");
        System.out.println(number);
        System.out.print("Value: ");
        System.out.println(value);
        System.out.printf("Number: %d, Value: %.2f\n", number, value);
    }
}
