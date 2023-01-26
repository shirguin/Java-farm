import java.util.ArrayList;

public class Farm {
    private int id;
    private int counter_animals;
    private ArrayList list_animals;

    public Farm(){
        this.id = 1;
        this.counter_animals = 0;
        this.list_animals = new ArrayList();
    }

    public int getId(){
        return this.id;
    }
    public int getCounter_animals(){
        return this.counter_animals;
    }

    public void increaseCounter(){
        this.counter_animals++;
    }

    public void reduceCounter(){
        this.counter_animals--;
    }

    public ArrayList getList_animals(){
        return this.list_animals;
    }

    public void addAnimal(Animal animal){
        this.list_animals.add(animal);
        increaseCounter();
        this.id++;
    }

    public Animal getAnimalById(int id) {
        ArrayList animals = getList_animals();

        for (int i = 0; i < animals.size(); i++){
            Animal el = (Animal) animals.get(i);
            int el_id = el.getId();
            if (el_id == id){
                return el;
            }
        }
        return null;
    }

    public void removeAnimal(int id){
        Animal animal = getAnimalById(id);
        this.list_animals.remove(animal);
        reduceCounter();
    }

    public void createAnimal(String type, String name, String birthdate){
        switch (type){
            case "Собака":
                Dog dog = new Dog(getId(), name, birthdate);
                addAnimal(dog);
                break;
            case "Кошка":
                Cat cat = new Cat(getId(), name, birthdate);
                addAnimal(cat);
                break;
            case "Хомяк":
                Hamster hamster = new Hamster(getId(), name, birthdate);
                addAnimal(hamster);
                break;
            case "Лошадь":
                Horse horse = new Horse(getId(), name, birthdate);
                addAnimal(horse);
                break;
            case "Верблюд":
                Camel camel = new Camel(getId(), name, birthdate);
                addAnimal(camel);
                break;
            case "Осел":
                Donkey donkey = new Donkey(getId(), name, birthdate);
                addAnimal(donkey);
                break;
            default:
                break;
        }
    }

}
