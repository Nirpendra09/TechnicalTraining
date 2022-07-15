package DSA.Stacks;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String expression = "a*b+c/d";
        System.out.println(infixToprefix(expression));
    }

    static String infixToprefix(String exp) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        String res = "";

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    String operand_1 = operands.pop();
                    String operand_2 = operands.pop();
                    char opr = operators.pop();
                    String e = opr + operand_2 + operand_1;
                }
                operators.pop();
            } else if (Character.isLetterOrDigit(c)) {
                operands.push(c + "");
            } else {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    String operand_1 = operands.pop();
                    String operand_2 = operands.pop();
                    char opr = operators.pop();
                    String e = opr + operand_2 + operand_1;
                    operands.push(exp);
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            String operand_1 = operands.pop();
            String operand_2 = operands.pop();
            char opr = operators.pop();
            String e = opr + operand_2 + operand_1;
            operands.push(e);
        }
        res = operands.peek();
        return res;
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
