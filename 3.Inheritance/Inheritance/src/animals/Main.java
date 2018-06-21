package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        while (!"Beast!".equals(line)) {
            String[] tokens = reader.readLine().split(" ");

            try {
                switch (line) {
                    case "Cat":
                        String name = tokens[0];
                        int age = Integer.parseInt(tokens[1]);
                        String gender = tokens[2];

                        Cat cat = new Cat(name, age, gender);
                        System.out.println(line);
                        System.out.println(cat);
                        break;
                    case "Dog":
                        name = tokens[0];
                        age = Integer.parseInt(tokens[1]);
                        gender = tokens[2];

                        Dog dog = new Dog(name, age, gender);
                        System.out.println(line);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        name = tokens[0];
                        age = Integer.parseInt(tokens[1]);
                        gender = tokens[2];

                        Frog frog = new Frog(name, age, gender);
                        System.out.println(line);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        name = tokens[0];
                        age = Integer.parseInt(tokens[1]);
                        gender = tokens[2];

                        Kitten kitten = new Kitten(name, age, gender);
                        System.out.println(line);
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        name = tokens[0];
                        age = Integer.parseInt(tokens[1]);
                        gender = tokens[2];

                        Tomcat tomcat = new Tomcat(name, age, gender);
                        System.out.println(line);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            line = reader.readLine();
        }
    }
}
