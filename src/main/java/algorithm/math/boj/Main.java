package algorithm.math.boj;

// 쉬운 브론즈 문제용 클래스
/**
 * 배수와 약수 5086 B3
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main main = new Main();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) {
                break;
            }
            bw.write(main.solution(N));
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private String solution(int n) {
        ArrayList<Integer> perfectNumList = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                perfectNumList.add(i);
                sum += i;
            }
        }
        perfectNumList.sort(Comparator.comparingInt(a -> a));
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        if (sum == n) {
            sb.append(" =");
            for (int i = 0; i < perfectNumList.size(); i++) {
                if (i == perfectNumList.size() - 1) {
                    sb.append(" ").append(perfectNumList.get(i)).append("\n");
                } else {
                    sb.append(" ").append(perfectNumList.get(i)).append(" +");
                }
            }
        } else {
            sb.append(" is NOT perfect.\n");
        }
        return sb.toString();
    }
}