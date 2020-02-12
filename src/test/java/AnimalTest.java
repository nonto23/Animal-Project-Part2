import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void testDogSound() {

        Dog dog = new Dog();

        Assert.assertEquals(dog.sound(),"Barks");
    }
    @Test

    public void testDogEat() {

        Dog dog = new Dog();

        Assert.assertEquals(dog.eat(),"Food");
    }
    @Test
    public void testCatSound() {

       Cat cat = new Cat();

        Assert.assertEquals(cat.sound(),"moews");
    }
    @Test

    public void testCatEat() {

        Cat cat = new Cat();

        Assert.assertEquals(cat.eat(),"Food");
    }
    @Test

    public void testName()
    {
        Cat cat = new Cat();
        cat.setName("Stormy");

        Assert.assertEquals(cat.getName(),"Stormy");
    }

}
