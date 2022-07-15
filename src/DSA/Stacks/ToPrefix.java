package DSA.Stacks;

import java.util.Stack;

public class ToPrefix {
    public static void main(String[] args) {
        String expression = "a*b+c/d";
        System.out.println(InfixToPrefix(expression));
    }

    static String InfixToPrefix(String exp) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    String op1 = operands.pop();
                    String op2 = operands.pop();
                    char opr = operators.pop();
                    String e = opr + op2 + op1;
                    operands.push(e);
                }
                operators.pop();
            } else if (Character.isLetterOrDigit(c)) {
                operands.push(c + "");
            } else {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    String op1 = operands.pop();
                    String op2 = operands.pop();
                    char opr = operators.pop();
                    String e = opr + op2 + op1;
                    operands.push(e);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            String op1 = operands.pop();
            String op2 = operands.pop();
            char opr = operators.pop();
            String e = opr + op2 + op1;
            operands.push(e);
        }

        return operands.peek();
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }
}
