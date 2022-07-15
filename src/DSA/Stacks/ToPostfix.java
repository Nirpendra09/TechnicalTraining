package DSA.Stacks;

import java.util.Stack;

public class ToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        InfixToPostfix(exp);
    }

    private static void InfixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                System.out.print(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    System.out.print(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(')
                    st.pop();
            } else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek()))
                    System.out.print(st.pop());
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }


    static int precedence(char c) {
        switch (c) {
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
