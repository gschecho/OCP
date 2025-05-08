package com.examen.PaqueteNio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

    public static void main(String[] args) throws IOException {


        File file = new File("paquete.txt");
        Path path = Paths.get(file.getAbsolutePath());
        Path pathCanonical = Paths.get(file.getCanonicalPath());
        System.out.println(path);
        System.out.println(pathCanonical);


    }
}
