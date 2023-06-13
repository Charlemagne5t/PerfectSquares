import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numSquaresTest1() {
        int n = 12;
        int output = 3;
        Assert.assertEquals(output, new Solution().numSquares(n));
    }

    @Test
    public void numSquaresTest2() {
        int n = 12;
        int output = 3;
        Assert.assertEquals(output, new Solution().numSquares(n));
    }

    @Test
    public void numSquaresTest3() {
        int n = 13;
        int output = 2;
        Assert.assertEquals(output, new Solution().numSquares(n));
    }
}
