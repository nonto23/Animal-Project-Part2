public class Animal {


    private String name;

    public Animal()
    {

    }
    public String sound()
    {

        System.out.println("Barks");
        System.out.println("moews");
        return  null;

    }
   public String eat()
    {
        String food = "Food";
       System.out.println(food);

       return food;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
