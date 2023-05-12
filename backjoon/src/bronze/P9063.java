package bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

/*
문제 번호 : P9063
문제 이름 : 대지
 */
public class P9063 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        List<Integer> x_value = new ArrayList<>();
        List<Integer> y_value = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            x_value.add(Integer.parseInt(st.nextToken()));
            y_value.add(Integer.parseInt(st.nextToken()));
        }
        Integer x = x_value.stream().mapToInt(i -> i).max().getAsInt() - x_value.stream().mapToInt(i -> i).min().getAsInt();
        Integer y = y_value.stream().mapToInt(i -> i).max().getAsInt() - y_value.stream().mapToInt(i -> i).min().getAsInt();
        Integer area = x * y;
        bw.write(area +" ");

        bw.flush();
    }

}
