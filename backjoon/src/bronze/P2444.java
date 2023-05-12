package bronze;

import java.util.Scanner;
/*
문제번호 : P2444
문제이름 : 별 찍기 - 7
 */
public class P2444 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int a = n-1; a >= 0; a--){
            for (int i = a - 1; i >= 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n-a)- 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a < n; a++){
            for (int i = a - 1; i >= 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n-a)- 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
