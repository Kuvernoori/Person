public class Person {
    public Person(){

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    String fullName;
    int age;
    public void move(){
        System.out.println("Such and such a Person is talking");
    }
    public void talk(){
        System.out.println("Such and such a Person is talking");
    }
}
