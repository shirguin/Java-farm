import java.util.ArrayList;

public class Animal {
    private int id;
    private String name;
    private String birthdate;

    public Animal(int id, String name, String birthdate){
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;

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

    public void setName(String name){
        this.name = name;
    }

    public String getBirthdate(){
        return this.birthdate;
    }

    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("id: %d | Name: %s | Рожден: %s", this.id, this.name, this.birthdate);
    }

}
