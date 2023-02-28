import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        Integer[] value = {3, 4};
        System.out.println(Arrays.toString(value));
        ChangeValue(value);
        System.out.println(Arrays.toString(value));
        Person3 person = new Person3("Lyapis", "Trubetskoy");
        System.out.println(person);
        Person3.changePerson(person);
        System.out.println(person);
    }

    public static void ChangeValue(Integer[] value) {
        value[0] = 99;
    }

}
