import org.example.Zoo;
import org.example.allAnimals.Tiger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZooWorkTest {

    @BeforeTest
    public void beforeStarting() {
        System.out.println("Let's get it");
    }

    @Test (groups = "positive")
    public void myFirstTest() {
        System.out.println("Hi");
    }

    @Test(groups = "positive")
    public void addNewAnimalTest() {
        int defaultCount = Zoo.getCountAnimalsAtList();
        Tiger Bonya = new Tiger("Bonya");
        int currentCount = Zoo.getCountAnimalsAtList();
        Assert.assertEquals(currentCount - defaultCount,1);
    }

    @Test(groups = "negative")
    public void addNewAnimalNegativeTest() {
        int defaultCount = Zoo.getCountAnimalsAtList();
        Tiger Bonya = new Tiger("Bonya");
        int currentCount = Zoo.getCountAnimalsAtList();
        Assert.assertEquals(currentCount - defaultCount,2,"Количество животных неверное");
    }

}
