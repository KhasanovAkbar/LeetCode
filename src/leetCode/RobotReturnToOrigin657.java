package leetCode;

public class RobotReturnToOrigin657 {
    public boolean judgeCircle(String moves) {
        //
        int x = 0, y = 0;
        char[] charArray = moves.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case 'R' -> x++;
                case 'L' -> x--;
                case 'U' -> y++;
                case 'D' -> y--;
            }
        }
        return x == 0 && y == 0;
     /*   int[] movement = {0, 0};
        HashMap<Character, int[]> sides = new HashMap<>();
        sides.put('R', new int[]{1, 0});
        sides.put('L', new int[]{-1, 0});
        sides.put('U', new int[]{0, 1});
        sides.put('D', new int[]{0, -1});
        char[] charArray = moves.toCharArray();
        for (char c : charArray) {
            int[] ints = sides.get(c);
            movement[0] += ints[0];
            movement[1] += ints[1];
        }
        return movement[0] == 0 && movement[1] == 0;*/
    }

    public static void main(String[] args) {
        RobotReturnToOrigin657 r = new RobotReturnToOrigin657();
        System.out.println(r.judgeCircle("LR"));//true
        System.out.println(r.judgeCircle("LL"));//false

    }
}
