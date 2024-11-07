package model;

public class User {
    private int id;
    private String name;
    private String city;
    private String email;

    // Constructors
    public User() {
    }

    public User(int id, String name, String city, String email) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
