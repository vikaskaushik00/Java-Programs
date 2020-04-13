package org.example.mypackage;

import com.example.game.IMobile;
import com.example.game.SmartPhone;

public class Main {

    public static void main(String[] args) {

        IMobile iMobile = new SmartPhone("Vikas ", "Samsung", 30000);
        iMobile.company();
        iMobile.price();
        System.out.println(iMobile.name().get(0));



    }
}