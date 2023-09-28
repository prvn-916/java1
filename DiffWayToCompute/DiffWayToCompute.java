package DiffWayToCompute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiffWayToCompute{
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> results = new ArrayList<>();

        
        if (expression.matches("\\d+")) {
            results.add(Integer.parseInt(expression));
            return results;
        }

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExpr = expression.substring(0, i);
                String rightExpr = expression.substring(i + 1);

                List<Integer> leftResults = diffWaysToCompute(leftExpr);
                List<Integer> rightResults = diffWaysToCompute(rightExpr);

                for (int leftNum : leftResults) {
                    for (int rightNum : rightResults) {
                        if (c == '+') {
                            results.add(leftNum + rightNum);
                        } else if (c == '-') {
                            results.add(leftNum - rightNum);
                        } else if (c == '*') {
                            results.add(leftNum * rightNum);
                        }
                    }
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        DiffWayToCompute solution = new DiffWayToCompute();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();
        
        List<Integer> results = solution.diffWaysToCompute(expression);
        System.out.println("Results: " + results);

        scanner.close();
    }
}

