public class Superhero extends Person {
    private String alias;

    public Superhero(String name, int health, String alias) {
        super(name, health);
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "The name of the person is " + this.getName() + ".\n"
                + "Their health is " + this.getHealth() + ".\n" +
                "They are a SUPERHERO! Their alias is... " + this.getAlias() + ".\n";
    }
}
