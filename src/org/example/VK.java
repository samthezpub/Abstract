package org.example;

public class VK extends SocialNetwork{

    @Override
    public void doPost() {
        super.doPost();
        System.out.println("Social Network - VK");
    }

    @Override
    public void doLike() {
        super.doLike();
        System.out.println("Social Network - VK");
    }

    @Override
    public void getPage(int id) {
        super.getPage(id);
        System.out.println("Social Network - VK");
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Message %s sent from VK", message));
    }
}
