package silver;

/*
문제번호 : P25206
문제이름 : 너의 평점은
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P25206 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double total_score = 0.0;
        int total_credit = 0;

        for(int i = 0; i<20; i++){
            st = new StringTokenizer(br.readLine());
            String lecture_name = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            total_credit += credit;

            switch (grade){
                case "A+": total_score += credit * 4.5; break;
                case "A0": total_score += credit * 4.0; break;
                case "B+": total_score += credit * 3.5; break;
                case "B0": total_score += credit * 3.0; break;
                case "C+": total_score += credit * 2.5; break;
                case "C0": total_score += credit * 2.0; break;
                case "D+": total_score += credit * 1.5; break;
                case "D0": total_score += credit * 1.0; break;
                case "F": total_score += credit * 0.0; break;
                case "P": total_credit -= credit; break;
            }
        }

        System.out.printf("%.6f",total_score/total_credit);
    }
}
