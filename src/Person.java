/**
 * Created by Vice on 5/24/2017.
 */
public  class Person {

    private String name,surname;
    private static String id="Person";

    public Person(String name, String surname,String id) {
        Person.id =id;
        this.name = name;
        this.surname = surname;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public  String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}
