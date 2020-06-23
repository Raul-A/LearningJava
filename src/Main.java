import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person ("Raul","Aldrete");
        System.out.println(person1.getFirstName()+" "+person1.getMiddleName()+" "+person1.getLastName());
        System.out.println("Age: "+person1.getAge());
        System.out.println("DOB: "+person1.getDateOfBirth());

        Person person2 = new Person ("Dude","James","Wilson");
        System.out.println(person2.getFirstName()+" "+person2.getMiddleName()+" "+person2.getLastName());
        System.out.println("Age: "+person2.getAge());
        System.out.println("DOB: "+person2.getDateOfBirth());

        Animal animal1 = new Animal("dog", "Chino", 12, true);
        Animal animal2 = new Animal("cat", "Garfield", 4, false);
        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);

        Person person3 = new Person ("Anekin","Luke","Skywalker",46,"09/12/1974",animals);
        System.out.println(person3.getFirstName()+" "+person3.getMiddleName()+" "+person3.getLastName());
        System.out.println("Age: "+person3.getAge());
        System.out.println("DOB: "+person3.getDateOfBirth());
        for(Animal animal: person3.getAnimals()){
            System.out.println(animal.getType());
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
            System.out.println(animal.hasFourLegs());
            System.out.println("\n\n");
        }
    }


}
