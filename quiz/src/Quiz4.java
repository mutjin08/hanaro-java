import java.util.Scanner;

public class Quiz4 {

    static String isX(int n){
        int target = n;
        while(target>0){
            if(target%10==3||target%10==6||target%10==9){
                return "X";
            }
            target = target/10;
        }
        return n+"";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 40사이의 정수 한 개를 입력하세요: ");
        int n = scanner.nextInt();

        String[] answer = new String[n+1];
        for (int i = 1; i <= n; i++) {
            answer[i] = isX(i);
        }

        
        scanner.close();
    }
}
