



import java.util.Scanner;

public class test0 {
    public static void main(String[] args) {
        System.out.print("Введите  число: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][][] mas = {{{1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}}};

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int f = 0; f < mas[i][j].length; f++) {
                    mas[i][j][f] += N;

                    System.out.print(mas[i][j][f] + " ");
                }
                System.out.println();
            }
        }
    }
}








