import java.util.ArrayList;

public class Dog extends Pet{
    private ArrayList list_commands;

    public Dog(int id, String name, String birthdate){
        super(id, name, birthdate);
        this.list_commands = new ArrayList();
    }

    public void addCommand(String command){
        this.list_commands.add(command);
    }

    public void removeCommand(String command){
        this.list_commands.remove(command);
    }

    @Override
    public String toString() {
        return String.format("id: %d | Name: %s | Рожден: %s | Категория: %s", getId(), getName(), getBirthdate(), getCategory_animals());
    }
}
