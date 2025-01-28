/**
 * leetCode: First Bad Version
 *
 * @version 0.1.0
 * @autor AlexandrAnatoliev
 */

// The API isBadVersion is defined in parent class VersionControl
// boolean isBadVersion(int version);

public class Solution extends VersionControl{

	public Solution(int bad)
	{
		super(bad);
	}

	public int firstBadVersion(int n){
		for(int i = 1; i <= n; i++)
		{
			if(isBadVersion(i))
			{
				return i;
			}
		}

		return n;
	}

	public static void main(String[] args)
	{
		Solution solution = new Solution(4);
		System.out.println(solution.firstBadVersion(6));
	}

}

public class VersionControl{
	public int bad;

	public VersionControl(int bad){
		this.bad = bad;
	}

	public boolean isBadVersion(int n){
		return n >= bad;
	}
}


