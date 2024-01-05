package leetCode;

import java.util.Stack;
import java.util.stream.Collectors;

public class BackspaceStringCompare844 {
    boolean result = false;

    public boolean backspaceCompare(String s, String t) {
        //
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        String collect1 = findBackspace(s, st1);
        String collect2 = findBackspace(t, st2);

        return collect1.equals(collect2);
    }

    private String findBackspace(String s, Stack<Character> st1) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#')
                st1.push(s.charAt(i));
            else if (!st1.isEmpty())
                st1.pop();
        }
        return st1.stream().map(Object::toString).collect(Collectors.joining(""));
    }

    public static void main(String[] args) {

        BackspaceStringCompare844 b = new BackspaceStringCompare844();
        System.out.println(b.backspaceCompare("a#c", "c"));//true
        System.out.println(b.backspaceCompare("a#c#", "c#"));//true
    }
}
