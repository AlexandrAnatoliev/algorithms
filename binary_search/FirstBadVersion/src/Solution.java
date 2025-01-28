/**
 * leetCode: First Bad Version
 *
 * @version 0.1.2
 * @autor AlexandrAnatoliev
 */

// The API isBadVersion is defined in parent class VersionControl
// boolean isBadVersion(int version);

public class Solution extends VersionControl {

    public Solution(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        {
            int start = 1;
            int finish = n;
            int middle;

            while (start + 1 < finish) {
                middle = start + (finish - start) / 2;
                if (isBadVersion(middle)) {
                    finish = middle;
                } else {
                    start = middle;
                }
            }
            if (isBadVersion(start)) {
                return start;
            }
            return finish;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution(4);
        System.out.println(solution.firstBadVersion(5));
        solution = new Solution(1);
        System.out.println(solution.firstBadVersion(1));
    }

}


