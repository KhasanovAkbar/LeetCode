package leetCode;

public class StudentAttendanceRecordOne {
    public boolean checkRecord(String s) {
        //
        int absent = 0;
        boolean attendance = true;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (absent == 2) {
                attendance = false;
                break;
            }
            if (charArray[i] == 'A') absent++;
            else if (charArray[i] == 'L') {
                if ((i + 2) < charArray.length) {
                    if (charArray[i+1] == 'L' && charArray[i+2] == 'L'){
                        attendance = false;
                        break;
                    }
                }
            }
        }
        if (absent == 2)
            attendance = false;
        return attendance;
    }

    public static void main(String[] args) {
        StudentAttendanceRecordOne s = new StudentAttendanceRecordOne();
        System.out.println(s.checkRecord("AA"));//true
        System.out.println(s.checkRecord("PPALLP"));//true
        System.out.println(s.checkRecord("PPALLL"));//false
    }
}
