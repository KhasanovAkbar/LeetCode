package leetCode;

public class CountOfMatchesInTournament1688 {
    int result = 0;

    public int numberOfMatches(int n) {
        //
        if (n == 1) return result;

        if (n % 2 == 0) {
            result += n / 2;
            numberOfMatches(n / 2);
        } else {
            result += (n - 1) / 2;
            numberOfMatches((n - 1) / 2 + 1);

        }
        return result;
    }

    public static void main(String[] args) {
        CountOfMatchesInTournament1688 c = new CountOfMatchesInTournament1688();
        System.out.println(c.numberOfMatches(14));
    }
}
