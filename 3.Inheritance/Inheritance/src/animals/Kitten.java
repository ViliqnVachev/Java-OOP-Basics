package animals;

public class Kitten extends Cat {
    private static final String INVALID_INPUT = "Invalid input!";

    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        if (gender.trim().isEmpty() || !gender.equals("Female")) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
        super.setGender(gender);
    }

    @Override
    protected String produceSound() {
        return "Miau";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s", this.produceSound());
    }
}
