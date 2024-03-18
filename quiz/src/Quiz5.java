import java.util.Scanner;
import java.util.Random;
public class Quiz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] count = {0, 0, 0}; //ball, strike, out
        int result = 0;
        System.out.println("게임시작!");
        while(count[2]<3) {
            while(count[1]<3){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                result = random.nextInt(2);
                count[result] += 1;
                
                //결과 출력
                if(result==0){
                    System.out.println("볼~");
                }else if(result==1){
                    System.out.println("스트라이크!");
                }

                //결과 반영
                if(count[0]>=4){
                    System.out.println("1루 진루!");
                    count[0]=0;
                }else if(count[1]>=3){
                    System.out.println("삼진 아웃!");
                    count[0]=0;
                    count[1]=0;
                    count[2]+=1;
                    break;
                }
            }
        }
        System.out.println("게임종료!");
        scanner.close();
    }
}
