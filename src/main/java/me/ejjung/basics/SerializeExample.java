package me.ejjung.basics;

import lombok.ToString;

import java.io.*;

//@ToString
//class User implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    String username;
//    String email;
//
//    User(String username, String email) {
//        this.username = username;
//        this.email = email;
//    }
//}

//@ToString
//class User implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    String username;
//    String email;
//    transient String password;
//
//    User(String username, String email, String passWord) {
//        this.username = username;
//        this.email = email;
//        this.password = passWord;
//    }
//}

@ToString
class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String mail;

    User(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
}

public class SerializeExample {

    public static void main(String[] args) throws Exception {
        String fileName = "user.ser";
//        User user = new User("ej", "ej@example.com");
//        User user = new User("ej", "ej@example.com", "123400");
//        serialize(user);
        deserialize(fileName);
    }

    public static void serialize(User user) {
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("user.ser"));

            out.writeObject(user);
            out.close();

            System.out.println("Object serialized");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deserialize(String fileName){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            User readUser = (User) in.readObject();
            in.close();

            System.out.println(readUser.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
