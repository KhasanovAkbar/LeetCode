package leetCode;

public class FindSmallestLetterGreaterThanTarget744 {
    public char nextGreatestLetter(char[] letters, char target) {
        //
        int n = letters.length;
        int left = 0, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        if (left >= n)
            return letters[0];

        return letters[left];
    }

    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget744 f = new FindSmallestLetterGreaterThanTarget744();
        char[] chars = {'c', 'f', 'j'};
        System.out.println(f.nextGreatestLetter(chars, 'a'));//c
    }
}
