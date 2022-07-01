package homework.books.model;

public class Author {

    private String name;
    private String surname;
    private String gmail;
    private String gender;

    public Author(String name, String surname, String gmail, String gender) {
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

    public String getEmail() {
        return gmail;
    }

    public void setEmail(String email) {
        this.gmail = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + gmail + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
