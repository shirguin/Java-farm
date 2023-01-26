import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal dog = new Animal(1, "Шарик", "25.01.2023");
//        System.out.println(dog);
//        Animal dog1 = new Animal(2, "Байкал", "14.01.2023");
//        System.out.println(dog1);
//
//        Pet cat = new Pet(3, "Пушок", "20.09.2022");
//        System.out.println(cat);
//        PackAnimal horse = new PackAnimal(3, "Вороной", "20.09.2022");
//        System.out.println(horse);
//
//        System.out.println(horse.getCategory_animals());

//        Dog dog_1 = new Dog(1, "Шарик", "25.01.2023");
//        System.out.println(dog_1);
//
//        ArrayList commands = dog_1.getListCommands();
//        System.out.println(commands);
//
//        dog_1.addCommand("Сидеть");
//        dog_1.addCommand("Лежать");
//
//        commands = dog_1.getListCommands();
//        System.out.println(commands);
//
//        dog_1.removeCommand("Сидеть");
//        commands = dog_1.getListCommands();
//        System.out.println(commands);

//        Cat cat_1 = new Cat(10, "Мурзик", "01.01.2023");
//        System.out.println(cat_1);
//
//        ArrayList commands = cat_1.getListCommands();
//        System.out.println(commands);
//
//        cat_1.addCommand("Сидеть");
//        cat_1.addCommand("Лежать");
//
//        commands = cat_1.getListCommands();
//        System.out.println(commands);
//
//        cat_1.removeCommand("Сидеть");
//        commands = cat_1.getListCommands();
//        System.out.println(commands);

        Farm farm = new Farm();
        farm.createAnimal("Верблюд", "Вася", "01.01.1975");
        System.out.println(farm.getCounter_animals());
        System.out.println(farm.getList_animals());

        farm.createAnimal("Кошка", "Мурка", "01.01.1975");
        System.out.println(farm.getCounter_animals());
        System.out.println(farm.getList_animals());

        Animal animal = farm.getAnimalById(1);
        System.out.println(animal);
//        Не смог получить лист команд животного(нужно в Animal прописать этот метод)
//        System.out.println(animal.);


    }
}
