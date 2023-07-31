package models;

public class Tutor {
    private static Integer generateId;
    Integer id;
    String name;

    public Tutor(String name) {
        this.name = name;
        Tutor.generateId++;
        this.id = Tutor.generateId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
