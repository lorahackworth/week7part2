public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Peter",100);
        Superhero person2 = new Superhero("Bruce Wayne",150, "Batman");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println("\n ~*~ PREPARE FOR BATTLE! ~*~\n\n");

        person1.attack(person2, person1);

        person2.attack(person1, person2);
    }
}