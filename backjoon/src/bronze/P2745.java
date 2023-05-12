package bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
문제번호 : P2745
문제이름 : 진법 변환
 */
public class P2745 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int sum = 0;
        int mul = 1;
        ArrayList<Integer> num = new ArrayList<>();
        for (char c :s.toCharArray()) {
            if(c >= 65){
                num.add(c-55);
            } else {
                num.add(c-48);
            }
        };

        for(int i = num.size()-1; i>=0 ; i--){
            sum += num.get(i) * mul;
            mul *= N;
        }
        bw.write(sum+"");
        bw.flush();
    }
}
