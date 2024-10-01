import HW_11.Methods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void test1() {
        Assert.assertEquals(0, Methods.additionMethod(0, 0));
        Assert.assertEquals(-1, Methods.additionMethod(0, -1));
        Assert.assertEquals(10, Methods.additionMethod(5, 5));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, Methods.subtractionMethod(0, 0));
        Assert.assertEquals(-1, Methods.subtractionMethod(2, 3));
        Assert.assertEquals(10, Methods.subtractionMethod(15, 5));
    }
    @Test
    public void test3() {
        Assert.assertEquals(0, Methods.multiplicationMethod(0, 0));
        Assert.assertEquals(-1, Methods.multiplicationMethod(-1, 1));
        Assert.assertEquals(10, Methods.multiplicationMethod(5, 2));
    }
    @Test
    public void test4() {
        Assert.assertEquals(0, Methods.divisionMethod(0, 5));
        Assert.assertEquals(-1, Methods.divisionMethod(-1, 1));
        Assert.assertEquals(10, Methods.divisionMethod(50, 5));
    }

}
