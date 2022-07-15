package homework.students.model;

import homework.books.model.Role;

public class User extends homework.books.model.User {

    private String name;
    private String surname;
    private String gmail;
    private String password;
    private Role role;

    public User(String name, String surname, String gmail, String password, Role role) {
        this.name = name;
        this.surname = surname;
        this.gmail = gmail;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gmail='" + gmail + '\'' +
                ", role=" + role +
                '}';

    }
}
