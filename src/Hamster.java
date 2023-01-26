import java.util.ArrayList;

public class Hamster extends Pet {
    private String type_animal;
    private ArrayList list_commands;

    public Hamster(int id, String name, String birthdate){
        super(id, name, birthdate);
        this.type_animal = "Хомяк";
        this.list_commands = new ArrayList();
    }

    public void addCommand(String command){
        this.list_commands.add(command);
    }

    public void removeCommand(String command){
        this.list_commands.remove(command);
    }

    public String getType_animal(){
        return this.type_animal;
    }
    public ArrayList getListCommands(){
        return this.list_commands;
    }

    @Override
    public String toString() {
        return String.format("id: %d | Вид: %s | Кличка: %s | Рожден: %s | Категория: %s", getId(), getType_animal(), getName(), getBirthdate(), getCategory_animals());
    }
}

