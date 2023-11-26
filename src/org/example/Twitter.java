package org.example;

public class Twitter extends SocialNetwork{
    @Override
    public void doPost() {
        super.doPost();
        System.out.println("Social Network - Twitter");
    }

    @Override
    public void doLike() {
        System.out.println("No likes allowed");
        System.out.println("Social Network - Twitter");
    }

    @Override
    public void getPage(int id) {
        super.getPage(id);
        System.out.println("Social Network - Twitter");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Message %s sent from Twitter", message));
    }
}
