package bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
문제번호 : P11718
문제이름 : 진법 변환 2
 */
public class P11005 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Character> chars = new ArrayList<Character>();

        while (true) {
            char c;
            int a = num % N;
            num /= N;

            if(a >= 10){
                c = (char)(a + 55);
            } else{
                c = (char)(a + 48);
            }
            chars.add(c);
            if(num <= 0){
                break;
            }
        }
        for(int i = chars.size(); i >0; i--){
            bw.write(chars.get(i-1));
        }
        bw.flush();
    }
}
