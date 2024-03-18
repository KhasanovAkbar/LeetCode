package leetCode;

public class DIStringMatch942 {
    //
    public int[] diStringMatch(String s) {
    int[] result = new int[s.length()+1];
        char[] charArray = s.toCharArray();
        int max = s.length();
        int min = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'I'){
                result[i] = min;
                min++;
            }
            else {
                result[i] = max;
                max--;
            }
        }
        if (charArray[charArray.length-1] == 'I')
            result[charArray.length] = max;
        else result[charArray.length] = min;
        return result;
    }

    public static void main(String[] args) {
        DIStringMatch942 d = new DIStringMatch942();
//        int[] idids = d.diStringMatch("IDID");
        int[] idids = d.diStringMatch("DDI");
        for (int idid : idids) {
            System.out.print(idid + " "); //[0,4,1,3,2]
        }
    }
}
