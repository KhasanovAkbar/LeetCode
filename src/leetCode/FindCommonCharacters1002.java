package leetCode;

import java.util.List;

public class FindCommonCharacters1002 {
    public List<String> commonChars(String[] words) {
        //

        return null;
    }

    public static void main(String[] args) {
        FindCommonCharacters1002 f = new FindCommonCharacters1002();
        String[] strings = {"bella", "label", "roller"};
        List<String> list = f.commonChars(strings);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
