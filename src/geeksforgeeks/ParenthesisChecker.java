package geeksforgeeks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisChecker {
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // add your code here
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(ispar("{([])}"));
    }
}
