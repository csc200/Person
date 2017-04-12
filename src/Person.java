/**
 * Represent a person object
 * Created by tkanchanawanchai6403 on 4/12/2017.
 */
public class Person {
    String id;
    String name;
    double height;
    String username;
    String password;
    Address address;
    String language;

    /**
     * Initialize name to John and language to English
     */
    public Person() {
        this.name = "John";
        this.language = "English";
    }

    /**
     * Initialize person name and language
     * @param name person first name
     * @param language native language of a person
     */
    public Person(String name,String language) {
        this.name = name;
        this.language = language;
    }

    /**
     * get person name
     * @return person first name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return language;
    }

    public boolean equals(Person obj) {
        return this.name.equals(obj.getName()) && this.language.equals(obj.speak());
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Name " + name +"\n Language " + language;
    }

}
