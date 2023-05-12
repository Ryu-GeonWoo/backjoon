package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제번호 : P10988
문제이름 : 팰린드롬인지 확인하기
 */
public class P10988 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int j = str.length()-1;
        int IsPelrinderom = 1;
        for(int i = 0; i < str.length(); i++,j--){
            if(str.charAt(i) == str.charAt(j)){
                IsPelrinderom = 1;
            } else {
                IsPelrinderom = 0;
                break;
            }
        }
        System.out.println(IsPelrinderom);

    }
}
