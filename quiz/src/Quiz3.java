import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 10사이의 정수 한 개를 입력하세요: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%3==0){
                System.out.print("X"+" ");
            }else{
                System.out.print(i+" ");
            }
        }

        scanner.close();
    }
}
