package leetCode;

class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length()%2 != 0) return false;

        char[] stack = new char[s.length()/2];
        int stackPointer = -1;

        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') &&
                    stackPointer+1 < stack.length) {
                stack[++stackPointer] = s.charAt(i);
            }
            else if (stackPointer != -1 &&
                    ((s.charAt(i) == ')' && stack[stackPointer] == '(') ||
                            (s.charAt(i) == ']' && stack[stackPointer] == '[') ||
                            (s.charAt(i) == '}' && stack[stackPointer] == '{'))) {
                stackPointer--;
            }
            else {
                return false;
            }

        }

        return stackPointer == -1;
    }
}
/*public class leetCode.ValidParentheses {

    Character replace(char c) {
        if (c == ')') return '(';
        else if (c == '}') return '{';
        else return '[';
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else {
                    Character replace = replace(s.charAt(i));

                    if (!stack.isEmpty() && replace == stack.peek())
                        stack.pop();
                    else return false;
                }
            }
            return stack.size() == 0;
        }
        return false;
    }
   *//* char[] array = {'(', ')', '{', '}', '[', ']'};

    boolean value(char c1, char c2) {
        if (c1 == array[0] && c2 == array[1]) return true;
        if (c1 == array[2] && c2 == array[3]) return true;
        return c1 == array[4] && c2 == array[5];
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 0) {
            String res = s;
            for (int i = 0; i < res.length(); i++) {
                char c1 = res.charAt(i);
                if (i + 1 < res.length()) {
                    char c2 = res.charAt(i + 1);
                    if (value(c1, c2)) {
                        res = res.substring(0, i) + res.substring(i + 1 + 1);
                        i = -1;
                    }
                } else return false;
                if (res.equals(""))
                    return true;
            }
        }
        return false;
    }*//*
}*/
