package pl.sztuczkap;

import java.util.List;

public class User {
    private String name;
    private Integer age;
    private String address;
    private List<User> relatives;

    public User(String name, Integer age, String address, List<User> relatives) {
        System.out.println("Create user");
        this.name = name;
        this.age = age;
        this.address = address;
        this.relatives = relatives;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public List<User> getRelatives() {
        return relatives;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", relatives=" + relatives +
                '}';
    }
}
