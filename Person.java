

public class Person{
    int age;
    static void change(Person p) {
        p = new Person();
        p.age = 99;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        change(p1);
        System.out.println(p1.age);
    }
}