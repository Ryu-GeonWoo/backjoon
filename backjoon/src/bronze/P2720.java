package bronze;

import java.io.*;
/*
문제번호 : P2720
문제이름 :세탁소 사장 동혁
 */
public class P2720 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Double Quarter = 25d;
        Double Dime = 10d;
        Double Nickel = 5d;
        Double Penny = 1d;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            Double toCharge = Double.parseDouble(br.readLine());
            bw.write((int) (toCharge/Quarter) + " ");
            toCharge %= Quarter;
            bw.write((int) (toCharge/Dime) + " ");
            toCharge %= Dime;
            bw.write((int) (toCharge/Nickel) + " ");
            toCharge %= Nickel;
            bw.write((int) (toCharge/Penny) + " ");
            toCharge %= Penny;

            bw.flush();

        }


    }
}
