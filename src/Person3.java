public class Person3 {
    private  String name;
    private  String surname;

    public Person3(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void changePerson(Person3 person) {
         person.name = "Ilya";
         person.surname = "Lagutenko";
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    /*Объявите объект класса person с полями name и surname.
    Переопределите у него метод toString так, чтобы он возвращал строку из name и surname.
     Объявите метод changePerson, который принимает параметр типа Person под названием person.
     Внутри метода запишите в поле name строку “Ilya”, а в строку surname — “Lagutenko”.
В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
Присвойте значение имени Lyapis, фамилии — Trubetskoy.
В следующей строке вызовите метод changePerson и передайте в него эту переменную.*/
}
