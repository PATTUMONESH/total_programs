package Strings;

public class RemoveJunk {

    public static void main(String[] args) {
        String s1="*/--/-/-/-/-/-/-#$%^&**&^%#@#$%^^^ hi monesh how are u 156161646646";
        s1=s1.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s1);
    }



}
