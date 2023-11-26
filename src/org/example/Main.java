package org.example;

public class Main {
    public static void main(String[] args) {
        VK vk = new VK();
        vk.doLike();
        vk.doPost();
        vk.getPage(1);
        vk.sendMessage("Frog");

        OK ok = new OK();
        ok.doLike();
        ok.doPost();
        ok.getPage(1);
        ok.sendMessage("Frog");

        Twitter twitter = new Twitter();
        twitter.doLike();
        twitter.doPost();
        twitter.getPage(1);
        twitter.sendMessage("Frog");
    }
}