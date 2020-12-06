package devhiroba.junit5.domain;

public class UserModel {

    public UserModel() {
        this.id = "japan2020";
        this.name = "yamada";
        this.age = 20;
        Email = "yamada@email.com";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private String id;
    private String name;
    private Integer age;
    private String Email;

}
