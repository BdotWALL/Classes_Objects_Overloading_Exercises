import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while(true) {
            System.out.print("Please enter a name: ");
            String animalsName = input.nextLine();

            if (animalsName.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? yes or no: ");
            String dogOr = input.nextLine();

            if (dogOr.isEmpty()){
                animals.add(new Animal(animalsName));

            } else {

                animals.add(new Animal(animalsName, dogOr));
            }


        }
        for (Animal animal: animals) {
            System.out.println(animal);
    }
  }
}
