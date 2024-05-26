package org.example;

public class Main {
    public static void main(String[] args) {

        int height =12;
        int width =13;
        int price =40;
        int tax1 = 5;

        int image = height + width;
        int amount = price + tax1;
        image +=1;
        amount -=2;
        System.out.println(amount>image);
        int test =2;
        if (image%test == 0 || amount%test == 0) {System.out.println("true");}
        else if (image%test != 0 && amount%test != 0){System.out.println("false");}

        }
    }
