package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/*
문제번호 : P10798
문제이름 : 세로읽기
 */
public class P10798 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        int[] str_len = {str1.length(), str2.length(),str3.length(),str4.length(),str5.length()};
        int max_len = 0;
        for(int i : str_len){
            if (i > max_len){
                max_len = i;
            }
        }
        for(int i = 0 ; i < max_len; i++){
            if(str1.length() > i){bw.write(str1.charAt(i));}
            if(str2.length() > i){bw.write(str2.charAt(i));}
            if(str3.length() > i){bw.write(str3.charAt(i));}
            if(str4.length() > i){bw.write(str4.charAt(i));}
            if(str5.length() > i){bw.write(str5.charAt(i));}
        }
        bw.flush();
    }
}
