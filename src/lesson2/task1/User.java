package lesson2.task1;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {
    int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;
}
