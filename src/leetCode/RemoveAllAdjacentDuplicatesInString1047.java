package leetCode;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public String removeDuplicates(String s) {
        //

        int index = -1;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (index >= 0 && ch[index] == c)
                index--;
            else
                ch[++index] = c;
        }
        return String.valueOf(ch, 0, index + 1);

       /* Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c)
                stack.pop();
            else
                stack.push(c);

        }
        StringBuilder sb=new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }

        return sb.toString();*/
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString1047 r = new RemoveAllAdjacentDuplicatesInString1047();
        System.out.println(r.removeDuplicates("aaaaaaaa"));//""
        System.out.println(r.removeDuplicates("abbaca"));//ca
        System.out.println(r.removeDuplicates("azxxzy"));//ay
    }
}
