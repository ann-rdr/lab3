package author;

import java.lang.*;
public class testauthor {
    public static void main(String[] args) {
        author a1 = new author("ivanovaleksey@mail.ru", "Aleksey Ivanov", 'M');
        System.out.println("Email adress: "+ a1.getEmail()
            +", name author is " + a1.getName()
            +" and gender author's - " + a1.getGender());

        author a2 = new author("daryaleks@yandex.ru", "Darya Alekseeva", 'F' );
        System.out.println("Email adress: "+ a2.getEmail()
            +", name author is " + a2.getName()
            +" and gender author's -  " + a2.getGender());

        author a3 = new author("Keksik keksik", "keks@bk.ru", 'U');
        System.out.println("Email adress: "+ a3.getEmail()
            +", name author is " + a3.getName()
            +" and gender author's is "+ a3.getGender() +" or unknown");

        author a4 = new author("sashaley@gmail.ru", "Sasha Polanskyi", 'M');
        System.out.println("Email  adress: "+ a4.getEmail()
            +", name author is "+ a4.getName()
            +" and gender author's is - "+ a4.getGender());
    }
}
