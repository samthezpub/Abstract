package org.example;

public abstract class SocialNetwork implements ISocialNetwork {
    @Override
    public void doPost() {
        System.out.println("Post added");
    }

    @Override
    public void doLike() {
        System.out.println("Like add");
    }

    @Override
    public void getPage(int id) {
        System.out.println(String.format("Post %s", id));
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Message %s sent", message));
    }
}
