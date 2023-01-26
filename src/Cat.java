import java.util.ArrayList;

public class Cat extends Pet {
    private String type_animal;

    public Cat(int id, String name, String birthdate){
        super(id, name, birthdate);
        this.type_animal = "Кошка";
    }

    public String getType_animal(){
        return this.type_animal;
    }

    @Override
    public String toString() {
        return String.format("id: %d | Вид: %s | Кличка: %s | Рожден: %s | Категория: %s", getId(), getType_animal(), getName(), getBirthdate(), getCategory_animals());
    }
}
