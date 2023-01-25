public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(1, "Шарик", "25.01.2023");
        System.out.println(dog);
        Animal dog1 = new Animal(2, "Байкал", "14.01.2023");
        System.out.println(dog1);

        Pet cat = new Pet(3, "Пушок", "20.09.2022");
        System.out.println(cat);
        PackAnimal horse = new PackAnimal(3, "Вороной", "20.09.2022");
        System.out.println(horse);

        System.out.println(horse.getCategory_animals());
    }
}
