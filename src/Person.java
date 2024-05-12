public class Person {
    private String name;
    private String designation;

    public Person (){}
    public Person(String name,  String designation){
        this.name = name;
        this.designation = designation;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }

    public void learn(){
        System.out.println("Learng");
    }
    public void walk(){
        System.out.println("Walk");
    }

    public void eat(){
        System.out.println("Eat");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
