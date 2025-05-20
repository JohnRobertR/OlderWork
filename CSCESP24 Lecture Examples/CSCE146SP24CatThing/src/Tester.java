public class Tester {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Triscuit", 9.0, 4);
        Cat cat3;
        
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        System.out.println(cat1.toString());
        System.out.println(cat2);

        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        System.out.println(cat4.equals(cat5));
        System.out.println(cat4 == cat5);
        Cat cat6, cat7;
        cat6 = cat7 = new Cat();
        cat6.setName("Dr. Boots");
        System.out.println(cat7.getName());
    }
}
