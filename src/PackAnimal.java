public class PackAnimal extends Animal{
    private String category_animals;

    public PackAnimal(int id, String name, String birthdate){
        super(id, name, birthdate);
        this.category_animals = "Вьючные животные";
    }

    public String getCategory_animals(){
        return this.category_animals;
    }

    @Override
    public String toString() {
        return String.format("id: %d | Name: %s | Рожден: %s | Категория: %s", getId(), getName(), getBirthdate(), this.category_animals);
    }
}
