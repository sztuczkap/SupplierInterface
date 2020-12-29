package pl.sztuczkap;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // leniwe tworzenie obiektu
        Supplier<Integer> supplier = () -> 1;

        // wywolujemy display user przekazujac 22:30,
        // oraz uzytkownika ctworzonego za pomoca metody createUser,
        // po 22 nic sie nie dzieje a o 17:30 tworzy 3 uzytkownikow
        displayUser(LocalTime.of(17, 30), createUser());
    }

    // stworzymy metode displayUser  która przyjmie czas jako local time
    // i wyswietli uzytkownika tylko przed godz 18

    private static void displayUser(LocalTime localTime, Supplier<User> user) {
        if (localTime.isBefore(LocalTime.of(18, 0))) {
            System.out.println(user.get().toString());
        }
    }

    // tworzymy statyczna metode create user w ktorej stworzymy przykladowego uzytkownika wraz z krewnymi
    private static Supplier<User> createUser() {
        return () -> {
            User user1 = UserBuilder.newBuilder()
                    .name("Michał")
                    .build();
            User user2 = UserBuilder.newBuilder()
                    .name("Mateusz")
                    .build();
            User targetUser = UserBuilder.newBuilder()
                    .name("Paweł")
                    .age(20)
                    .address("Popularna 20")
                    .addRelative(user1)
                    .addRelative(user2)
                    .build();
            return targetUser;
        };
    }


}
