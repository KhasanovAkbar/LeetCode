package leetCode;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        /*if(numRows<2 || s.length()==1)
            return s;
        String[] mat=new String[numRows];
        boolean dir=true;
        int row=0;
        for(int i=0;i<s.length();i++){
            if(mat[row]!=null){
                mat[row]+=s.charAt(i);
            }else{
                mat[row]=""+s.charAt(i);
            }

            if(row==0){
                dir=true;
            }else if(row==numRows-1){
                dir=false;
            }
            if(dir){
                row++;
            }else{
                row--;
            }
        }
        String ans="";
        for(String str:mat){
            if(str!=null)
                ans+=str;
        }
        return ans;*/

        if(numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int spacer = (numRows - 1) * 2;

        for(int r = 0; r < numRows; r++)  {
            for(int i = 0; i + r < n; i += spacer)  {
                sb.append(s.charAt(i + r));
                if(r != 0 && r != numRows - 1 && i + spacer - r < n)  {
                    sb.append(s.charAt(i + spacer - r));
                }
            }
        }
        return sb.toString();

    }
}
