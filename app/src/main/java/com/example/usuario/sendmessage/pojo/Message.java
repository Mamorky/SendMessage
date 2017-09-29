package com.example.usuario.sendmessage.pojo;

import java.io.Serializable;

/**
 * Created by mamorky on 29/09/17.
 */

//Debemos de implementar la clase serializable para poder compartir el objeto de esta clase
public class Message implements Serializable{

    private String message;
    private String user;

    public Message(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (!message.equals(message1.message)) return false;
        return user.equals(message1.user);

    }
}
