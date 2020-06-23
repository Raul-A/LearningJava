import java.util.List;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String dateOfBirth;
    private List<Animal> animals;

    /*This is the constructor*/
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /*This is the constructor accepting the middle name*/
    public Person (String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    /*This is the constructor accepting all fields*/
    public Person (String firstName, String middleName, String lastName, int age, String dateOfBirth,List<Animal> animals) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.animals = animals;
    }




        /*Getters*/
    public String getFirstName (){
        return firstName;
    }
    public String getMiddleName (){
        return  middleName;
    }
    public String getLastName (){
        return lastName;
    }
    public int getAge (){
        return age;
    }
    public String getDateOfBirth (){
        return dateOfBirth;
    }
    public List<Animal> getAnimals (){
        return animals;
    }
}


