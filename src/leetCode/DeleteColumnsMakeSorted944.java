package leetCode;

import java.util.HashMap;

public class DeleteColumnsMakeSorted944 {
    public int minDeletionSize(String[] strs) {
        //
        int col = strs[0].length();
        int del = 0;

        for(int i=0;i<col;i++){
            char prev = '0';
            for(String str: strs){
                char cur = str.charAt(i);
                if(cur < prev){
                    del++;
                    break;
                }
                prev = cur;
            }

        }
        return del;

       /* HashMap<Integer, String> hashMap = new HashMap<>();
        for (String str : strs) {
            for (int j = 0; j < str.length(); j++) {
                hashMap.put(j, hashMap.getOrDefault(j, "") + str.charAt(j));
            }
        }
        int count = 0;
        for (int i = 0; i < hashMap.size(); i++) {
            if (!alphabeticalOrder(hashMap.get(i)))
                count++;

        }

        return count;*/
    }

    private boolean alphabeticalOrder(String str) {
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) > str.charAt(i + 1))
                return false;
        return true;
    }

    public static void main(String[] args) {
        DeleteColumnsMakeSorted944 d = new DeleteColumnsMakeSorted944();
        String[] strs = {"abcd", "bcef", "caeg"};
        System.out.println(d.minDeletionSize(strs));//1
    }
}
