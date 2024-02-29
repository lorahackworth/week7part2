public class Person {
    private String name;
    private int health = 100;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "The name of the person is " + this.getName() + ".\n"
                + "Their health is " + this.getHealth() + ".\n";
    }

    public void attack(Person a, Person b){
        if(a.getClass()==Superhero.class) {
            System.out.println("Your punch is not as effective!");
            a.setHealth(a.getHealth()-5);
        }else{
            a.setHealth(a.getHealth()-10);
        }
        System.out.println(b.getName() + " attacked " + a.getName() + "!" +
                "\nTheir health is now " + a.getHealth() + "\n");
    }

    public void hollowPurple(Person a, Person b){
        a.setHealth(a.getHealth()-100);
        System.out.println(b.getName() + " used ***HOLLOW PURPLE*** on " + a.getName() + "!" +
                "\nTheir health is now " + a.getHealth() + "\n");
    }
}
