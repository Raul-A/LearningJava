public class Animal {
    private String type;
    private String name;
    private int age;
    private boolean hasFourLegs;

    /*Constructor for animals*/
    public Animal (String type, String name, int age, boolean hasFourLegs){
        this.type = type;
        this.name = name;
        this.age = age;
        this.hasFourLegs = hasFourLegs;
    }

    /*Getters for Animals*/
    public String getType (){
        return type;
    }

    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }
    public boolean hasFourLegs (){
        return hasFourLegs;
    }
}
