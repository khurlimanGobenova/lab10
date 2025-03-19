package category1;

public class Factory {
    public static Person defaultPerson() {
        Person person = new Person();
        person.setName("Default Name");
        person.setAge(30);
        person.setAddress("Default Address");
        return person;
    }

    public static void main(String[] args) {
        Person defaultPerson = Factory.defaultPerson();
        System.out.println("Default Person: " + defaultPerson.getName());
    }
}