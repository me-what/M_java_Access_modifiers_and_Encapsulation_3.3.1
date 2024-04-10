public class Main {
    public static void main(String[] args) {
        Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
        kate.displayName();
        kate.displayAge();
        kate.displayPhone();
        //kate.displayAddress();  // ! Ошибка, метод private

        System.out.println(kate.name);
        System.out.println(kate.address);
        System.out.println(kate.age);
        //System.out.println(kate.phone);   // ! Ошибка, модификатор private
        System.out.println();

        // Person_2
        Person_2 kate2 = new Person_2("Kate", 30);
        System.out.println(kate2.getAge());
        kate2.setAge(33);
        System.out.println(kate2.getAge());
        kate2.setAge(123450);
        System.out.println(kate2.getAge());
    }
}