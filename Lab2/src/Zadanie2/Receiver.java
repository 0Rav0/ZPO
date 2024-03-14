package Zadanie2;

public class Receiver {
    String name;
    String email;
    String phone;
    PreferredLanguage preferredLanguage;

    public Receiver(String name, String email, String phone, PreferredLanguage preferredLanguage) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.preferredLanguage = preferredLanguage;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public PreferredLanguage getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPreferredLanguage(PreferredLanguage preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
}
