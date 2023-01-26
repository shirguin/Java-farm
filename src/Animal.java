import java.util.ArrayList;

public class Animal {
    private int id;
    private String name;
    private String birthdate;

    private ArrayList list_commands;

    public Animal(int id, String name, String birthdate){
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.list_commands = new ArrayList();

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getListCommands(){
        return this.list_commands;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBirthdate(){
        return this.birthdate;
    }

    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

    public void addCommand(String command){
        this.list_commands.add(command);
    }

    public void removeCommand(String command){
        this.list_commands.remove(command);
    }

    @Override
    public String toString() {
        return String.format("id: %d | Name: %s | Рожден: %s", this.id, this.name, this.birthdate);
    }

}
