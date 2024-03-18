import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] plans = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.print("요일을 정수로 입력하세요(월요일=1): ");
        int userDay = scanner.nextInt();

        if(plans[userDay]==1){
            System.out.println("oh my god~");
        }else{
            System.out.println("enjoy!");
        }

        scanner.close();
    }
}
