import java.util.Stack;

public class InfixToPostfix {

    // Function to return precedence of operators
    static int prec(char c) {
        if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    // The main function to convert infix expression to postfix expression
    static void infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }
            // If an operator is scanned
            else {
                while (!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) ||
                        prec(s.charAt(i)) == prec(stack.peek()))){

                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        // Pop all the remaining elements from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }


    public static void main(String[] args) {
        String exp = "a+b*c-f+g*h";

        // Function call
        infixToPostfix(exp);
    }
}
