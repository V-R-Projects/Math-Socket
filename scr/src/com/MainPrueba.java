package com;

import java.io.IOException;

public class MainPrueba {

    public static void main(String[] args) {

        {
            try {

                Client server = new Client("server");
                Client cliente = new Client();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
