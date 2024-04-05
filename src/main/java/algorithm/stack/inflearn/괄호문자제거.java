package algorithm.stack.inflearn;

import java.util.*;

public class 괄호문자제거 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(c);
        }
        for (char c : stack) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
