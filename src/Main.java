import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        farm.createAnimal("Верблюд", "Вася", "01.01.1975");
        farm.createAnimal("Кошка", "Мурка", "15.03.2021");
        farm.createAnimal("Собака", "Шарик", "20.04.2020");
        farm.createAnimal("Осел", "Дружок", "15.11.2015");
        farm.createAnimal("Хомяк", "Беляш", "10.07.2022");
        farm.createAnimal("Лошадь", "Быстрый", "25.06.2018");

        try {
            Menu.displayMainMenu();
            while (true){

                try {
                    Scanner sc = new Scanner(System.in);
                    int key = sc.nextInt();

                    switch (key){
                        case 1:
                            System.out.println("Список зверей питомника:");
                            ArrayList animals = farm.getList_animals();
                            farm.printList(animals);
                            Menu.displayMainMenu();
                            break;
                        case 2:
                            System.out.println("Список домашних животных:");
                            ArrayList pet_animals = farm.getListPetAnimals();
                            farm.printList(pet_animals);
                            Menu.displayMainMenu();
                            break;
                        case 3:
                            System.out.println("Список вьючных животных:");
                            ArrayList pack_animals = farm.getListPackAnimals();
                            farm.printList(pack_animals);
                            Menu.displayMainMenu();
                            break;
                        case 4:
                            System.out.printf("В питомнике всего %s животных\n", farm.getCounter_animals());
                            Menu.displayMainMenu();
                            break;
                        case 5:
                            System.out.println("Введите вид животного(Собака, Кошка, Хомяк, Лошадь, Верблюд, Осел):");
                            Scanner sc_type = new Scanner(System.in);
                            String type = sc_type.nextLine();

                            System.out.println("Введите кличку животного:");
                            Scanner  sc_name= new Scanner(System.in);
                            String name = sc_name.nextLine();

                            System.out.println("Введите дату рождения животного:");
                            Scanner sc_birthdate = new Scanner(System.in);
                            String birthdate = sc_birthdate.nextLine();

                            farm.createAnimal(type, name, birthdate);
                            Menu.displayMainMenu();
                            break;
                        case 6:
                            System.out.println("Введите ID животного, которое нужно удалить:");
                            Scanner sc_id = new Scanner(System.in);
                            int id = sc_id.nextInt();
                            Animal delete_animal = farm.getAnimalById(id);
                            System.out.println("Удалить из питомника это животное?");
                            System.out.println(delete_animal);
                            System.out.println("Для подтверждения введите 1.Удалить 2.Отмена");

                            Scanner sc_answer = new Scanner(System.in);
                            int answer = sc_answer.nextInt();

                            if (answer == 1){
                                farm.removeAnimal(id);
                                System.out.println("Животное удалено.");
                                Menu.displayMainMenu();
                                break;
                            }

                            System.out.println("Удаление отменено.");
                            Menu.displayMainMenu();
                            break;
                        case 7:
                            System.out.println("Введите ID животного:");
                            Scanner sc_id_animal = new Scanner(System.in);
                            int id_animal_1 = sc_id_animal.nextInt();
                            Animal animal_1 = farm.getAnimalById(id_animal_1);
                            System.out.println(animal_1.getListCommands());

                            Menu.displayMainMenu();
                            break;
                        case 8:
                            System.out.println("Введите ID животного:");
                            Scanner sc_id_animal_2 = new Scanner(System.in);
                            int id_animal_2 = sc_id_animal_2.nextInt();
                            Animal animal_2 = farm.getAnimalById(id_animal_2);

                            System.out.println("Введите команду животного:");
                            Scanner sc_command_1 = new Scanner(System.in);
                            String command_1 = sc_command_1.nextLine();

                            animal_2.addCommand(command_1);
                            Menu.displayMainMenu();
                            break;
                        case 9:
                            System.out.println("Введите ID животного:");
                            Scanner sc_id_animal_3 = new Scanner(System.in);
                            int id_animal_3 = sc_id_animal_3.nextInt();
                            Animal animal_3 = farm.getAnimalById(id_animal_3);

                            System.out.println("Введите команду животного для удаления:");
                            Scanner sc_command_2 = new Scanner(System.in);
                            String command_2 = sc_command_2.nextLine();

                            animal_3.removeCommand(command_2);
                            Menu.displayMainMenu();
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Выберите правильный пункт меню");
                    }

                }catch (Exception e) {
                    System.out.println("Выберите правильный пункт меню");
                }

            }

        }catch (Exception e) {
            System.out.println("Ошибка!!!");
        }

    }
}
