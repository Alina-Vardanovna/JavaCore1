package homework.books.model;

import homework.books.ourEnum.Gender;

public class Author {

    private String name;
    private String surname;
    private String gmail;
    private Gender gender;

    public Author(String name, String surname, String gmail, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gmail = gmail;
        this.gender = gender;
    }

    public Author() {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gmail='" + gmail + '\'' +
                ", gender=" + gender +
                '}';
    }

}
