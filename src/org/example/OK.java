package org.example;

public class OK extends SocialNetwork{
    @Override
    public void doPost() {
        super.doPost();
        System.out.println("Social Network - OK");
    }

    @Override
    public void doLike() {
        super.doLike();
        System.out.println("Social Network - OK");
    }

    @Override
    public void getPage(int id) {
        super.getPage(id);
        System.out.println("Social Network - OK");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Message %s sent from OK", message));
    }
}
