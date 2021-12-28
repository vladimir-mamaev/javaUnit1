import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
    @Test
    public void testAdd() {
       Calculator calculator=new Calculator();
      int sum= calculator.getSum(3,5);
        Assert.assertEquals(7,sum);

    }


}
