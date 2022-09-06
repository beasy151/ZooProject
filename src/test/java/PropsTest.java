import org.example.Props;
import org.example.Zoo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PropsTest {

    @Test (groups = "positive")
    public void getPasswordTest() {
        Assert.assertNotNull(Props.getPassword());
    }

    @Test (groups = "positive")
    public void inputStringPassTest() {
        Assert.assertTrue(Zoo.checkInputPasswordisNotEmpty("qwerty"));
    }

    @Test(groups = "negative", enabled = false)
    public void inputNullPassTest() {
        Assert.assertFalse(Zoo.checkInputPasswordisNotEmpty(null));
    }

    @Test(groups = "positive")
    public void inputCorrectPasswordTest() throws Exception {
        Assert.assertTrue(Zoo.checkInputPasswordIsCorrect("qwerty"));
    }

    @Test(groups = "negative", expectedExceptions = Exception.class)
    public void inputInCorrectPasswordTest() throws Exception {
        Assert.assertFalse(Zoo.checkInputPasswordIsCorrect("qwer"));
    }

}
