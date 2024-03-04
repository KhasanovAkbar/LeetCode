package leetCode;

public class AvailableCapturesForRook999 {
    public int numRookCaptures(char[][] board) {
        //
        int rook_x =-1 ;
        int rook_y =-1 ;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rook_x = i;
                    rook_y = j;
                    break;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        AvailableCapturesForRook999 a = new AvailableCapturesForRook999();
        char[][] board = {{}, {}, {}};
        System.out.println(a.numRookCaptures(board));

    }
}
