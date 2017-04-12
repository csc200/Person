/**
 * Created by tkanchanawanchai6403 on 4/12/2017.
 */
public class PersonDriver {
    public static void main(String [] args) {
        Person person = new Person();
        System.out.println(person.speak());
        System.out.println(person.getName());

        Person jing = new Person("Jing","Mandarin");
        Person dominic = new Person("Dominic", "English");
        System.out.println(jing.speak());
        System.out.println(dominic.speak());
        System.out.println(dominic.getName());
        dominic.setName("Tanes");
        System.out.println(dominic.getName());

        System.out.println(dominic.toString());
        System.out.println(person);
        System.out.println(jing);
        dominic.setName("Jing");
        System.out.println(jing.equals(dominic));

    }
}
