package wild_farm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");

            String typeAnimal = tokens[0];
            String nameAnimal = tokens[1];
            double animalWeight = Double.parseDouble(tokens[2]);
            String livingRegion = tokens[3];


            String[] food = reader.readLine().split("\\s+");
            String type = food[0];
            int quantity = Integer.parseInt(food[1]);


            switch (typeAnimal) {
                case "Cat":
                    String breed = tokens[4];
                    Felime cat = new Cat(nameAnimal, typeAnimal, animalWeight, livingRegion, breed);
                    System.out.println(cat.makeSound());

                    if (type.equals("Meat")) {
                        Food meat = new Meat(quantity);
                        try {
                            cat.eat(meat, quantity);

                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(cat);
                    } else {
                        Food vegetable = new Vegetable(quantity);
                        try {
                            cat.eat(vegetable, quantity);

                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(cat);
                    }
                    break;
                case "Tiger":
                    Mammal tiger = new Tiger(nameAnimal, typeAnimal, animalWeight, livingRegion);
                    System.out.println(tiger.makeSound());

                    if (type.equals("Meat")) {
                        Food meat = new Meat(quantity);
                        try {
                            tiger.eat(meat, quantity);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(tiger);
                    } else {
                        Food vegetable = new Vegetable(quantity);
                        try {
                            tiger.eat(vegetable, quantity);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(tiger);
                    }
                    break;
                case "Zebra":
                    Mammal zebra = new Zebra(nameAnimal, typeAnimal, animalWeight, livingRegion);
                    System.out.println(zebra.makeSound());

                    if (type.equals("Meat")) {
                        Food meat = new Meat(quantity);
                        try {
                            zebra.eat(meat, quantity);

                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(zebra);
                    } else {
                        Food vegetable = new Vegetable(quantity);
                        try {
                            zebra.eat(vegetable, quantity);

                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(zebra);
                    }
                    break;
                case "Mouse":
                    Mammal mouse = new Mouse(nameAnimal, typeAnimal, animalWeight, livingRegion);
                    System.out.println(mouse.makeSound());

                    if (type.equals("Meat")) {
                        Food meat = new Meat(quantity);
                        try {
                            mouse.eat(meat, quantity);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(mouse);
                    } else {
                        Food vegetable = new Vegetable(quantity);
                        try {
                            mouse.eat(vegetable, quantity);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println(mouse);
                    }
                    break;
            }

            line = reader.readLine();
        }
    }


}
