package BasicCalculator;

import java.util.Scanner;
import java.util.Stack;

class BasicCalculator {
    public int Calculator(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int result = 0;
        int num = 0;
        int sign = 1;
        stack.push(sign);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = num * 10 + (chars[i] - '0');
            } else if (chars[i] == '+' || chars[i] == '-') {
                result+= sign * num;
                sign = stack.peek() *(chars[i] == '+' ? 1 : -1);
                num = 0;
            } else if (chars[i] == '(') {
                stack.push(sign);
            } else if (chars[i] == ')') {
                stack.pop();
            }
        }

        result += sign * num;
        return result;
    }
    public static void main(String[] args) {
        BasicCalculator BasicCalculator = new BasicCalculator();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(BasicCalculator.Calculator(s));
        
    }
}