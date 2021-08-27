package models;

public class Author {
    private int     id;
    private String  firstName;
    private String  lastName;
    private String  nickName;
    private String  birthDate;

    public Author(int id, String firstName, String lastName, String nickName, String birthDate) {
        this.id         = id;
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.nickName   = nickName;
        this.birthDate  = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
