package lopezalos.joancarles.supermariojcla;

public class Personaje {
    private String name;
    private String title;
    private String description;
    private int icon;

    //CONSTRUCTOR ----------------------
    public Personaje(String name, String title, String description, int icon) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    //GETTERS AND SETTERS --------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
