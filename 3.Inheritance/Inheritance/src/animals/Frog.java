package animals;

public class Frog extends Animal{

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return "Frogggg";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s", this.produceSound());
    }
}
