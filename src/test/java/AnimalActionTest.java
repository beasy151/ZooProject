import org.example.allAnimals.Tiger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalActionTest {

    @Test(groups = "positive")
    public void tigerSoundCorrectTest() {
        Tiger leo = new Tiger("Leo");
        Assert.assertEquals(leo.getSound(), "Рррррррр");
    }

    @Test(groups = "negative")
    public void tigerSoundInCorrectTest() {
        Tiger leo = new Tiger("Leo");
        Assert.assertEquals("Мяу", "Рррррррр");
    }

}
