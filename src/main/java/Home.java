import java.util.ArrayList;

public class Home
{
    ArrayList<Animal> list = new ArrayList<>();

    public  Animal adoptPet(Animal pet)
    {
        list.add(pet);
        return pet;
    }

    public void makeAllSound()
    {


        for( Animal animal:list)
        {
               animal.sound();
        }
    }
}
