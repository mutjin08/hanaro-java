import java.util.Random;

public class Quiz2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] visited = new int[46];
        int[] picked = new int[6];

        int n;
        for (int i = 0; i < picked.length; i++) {
            do{
                n = random.nextInt(45)+1;
            }while(visited[n]==1);
            visited[n] = 1;
            picked[i] = n;
        }

        for (int p : picked) {
            System.out.print(p+" ");
        }
    }
}
