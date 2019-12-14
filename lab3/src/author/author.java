package author;

import java.lang.*;
public class author {
    private String name;
    private String email;
    private char gender;

    public author() {
        name = "Aleksey Ivanov";
        email = "ivanovaleksey@mail.ru";
        gender = 'M';
    }
    public author(String e) {
        name = "Darya Alekseeva";
        email = e;
        gender = 'F';
    }
    public author(String e, String n) {
        name = n;
        email = e;
        gender = 'U';
    }
    public author(String e, String n, char g) {
        name = n;
        email = e;
        gender = g;
    }

public void setName(String name) { this.name = name; }
public void setEmail(String email) { this.email = email; }
public void setGender(char gender) { this.gender = gender; }
public String getName() {
        return name;
}
public String getEmail() {
    return email;
}
public char getGender() {
    return gender;
}

@Override
public String toString() {
    return "Author @ (" + this.name + ", " + this.email + ").";
}
}