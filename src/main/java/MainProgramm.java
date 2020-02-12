public class MainProgramm {

    public static void main(String []agrs)
    {
        Cat cat = new Cat();
        cat.setName("Stormy");
        cat.sound();
        cat.eat();

        Dog dog = new Dog();
        dog.setName("Rax");
        dog.sound();
        dog.eat();

        Home home = new Home();
        home.adoptPet(cat);
        home.makeAllSound();

        home.adoptPet(dog);
        home.makeAllSound();
    }
}
