package pl.sztuczkap;

import java.util.ArrayList;
import java.util.List;

public class UserBuilder {
    private String name;
    private Integer age;
    private String address;
    private List<User> relatives = new ArrayList<>();

    // metoda która zwróci nam naszego Buildera
    static UserBuilder newBuilder() {
        return new UserBuilder();
    }

    // metoda name która zwróci Buildera i  zwróci do pola name odpowiednia nazwe
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    // metoda przyjmuje naszego uzytkownika i dodaje do naszej listy
    public UserBuilder addRelative(User relative) {
        this.relatives.add(relative);
        return this;
    }

    // dodamy metodę build która stworzy nam wlaściwy obiekt typu user
    public User build() {
        return new User(name, age, address, relatives);
    }

}
