package org.example;

public interface ISocialNetwork {
    void doPost();
    void doLike();
    void getPage(int id);

    void sendMessage(String message);
}
