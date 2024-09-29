package org.example;

import org.example.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeExample {
    public static void main(String[] args) {
        User user = new User("Alice", 30);

        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(user);
            System.out.println("对象已序列化");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
