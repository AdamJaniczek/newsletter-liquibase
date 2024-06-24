package pl.com.itsystems.newsletterliquibase;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String eMail;

    private Boolean newsletter;

    public User() {
    }

    public User(String firstName, String lastName, LocalDate birthDate, String eMail, Boolean newsletter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.eMail = eMail;
        this.newsletter = newsletter;
    }

    public User(long id, String firstName, String lastName, LocalDate birthDate, String eMail, Boolean newsletter) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.eMail = eMail;
        this.newsletter = newsletter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Boolean getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }
}
