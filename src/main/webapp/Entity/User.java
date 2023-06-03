package Entity;

public class User {
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String poroda;
    public String getPoroda() {
        return lastporoda;
    }
    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    private Integer age;
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(Stringr color) {
        this.color = color;
    }

    private String warning;
    public String getWarning() {
        return warning;
    }
    public void setWarning(String warning) {
        this.warning = warning;
    }

    public User(Integer id, String name, String poroda, Integer age, String color, String warning) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
        this.color= color;
        this.warning = warning;
    }

}
