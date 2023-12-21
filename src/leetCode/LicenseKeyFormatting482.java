package leetCode;

public class LicenseKeyFormatting482 {
    public String licenseKeyFormatting(String s, int k) {
        //
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1,cnt=0;i>=0;i--){
            if(s.charAt(i)!='-'){
                if(cnt>=k){
                    ans.append('-');
                    cnt=0;
                }
                ans.append(Character.toUpperCase(s.charAt(i)));cnt++;
            }
        }
        return ans.reverse().toString();
       /* StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String[] split = s.toUpperCase().split("-");
        for (String item : split) {
            temp.append(item);
        }

        for (int i = temp.length(); i > 0; i -= k) {
            if (i - k > 0)
                result.insert(0, "-" + (temp.subSequence(i - k, i)));
            else result.insert(0, temp.subSequence(0, i));
        }
        return result.toString();*/
    }

    public static void main(String[] args) {
        LicenseKeyFormatting482 l = new LicenseKeyFormatting482();
        System.out.println(l.licenseKeyFormatting("5F3Z-2e-9-w1", 4));//5F3Z-2E9W
        System.out.println(l.licenseKeyFormatting("2-5g-3-J", 2));//2-5G-3J
    }
}
