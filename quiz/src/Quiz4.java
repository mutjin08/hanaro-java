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

        //정답
        String comp;
        String user;
        for (int i = 1; i <= n; i++) {
            comp = isX(i);

            if(i%2==1){
                System.out.println("컴퓨터: "+comp);
                continue;
            }

            System.out.print("나: ");
            user = scanner.next();

            if(!comp.equals(user)){
                System.out.println("컴퓨터 승!");
                System.out.println("게임종료");
                return;
            }
        }
        System.out.println("무승부!");
        
        scanner.close();
    }
}
