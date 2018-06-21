package animals;

public class Tomcat extends Cat {
    private static final String INVALID_INPUT = "Invalid input!";

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        if (gender.trim().isEmpty() || !gender.equals("Male")) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
        super.setGender(gender);
    }

    @Override
    protected String produceSound() {
        return "Give me one million b***h";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s", this.produceSound());
    }
}
