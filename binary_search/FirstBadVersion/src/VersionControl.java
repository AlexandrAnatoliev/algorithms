public class VersionControl {
    public int bad;

    public VersionControl(int bad) {
        this.bad = bad;
    }

    public boolean isBadVersion(int n) {
        return n >= bad;
    }
}
