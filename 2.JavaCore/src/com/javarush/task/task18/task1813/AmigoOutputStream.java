package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private final FileOutputStream originalFileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.originalFileOutputStream = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        originalFileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        originalFileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        originalFileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        originalFileOutputStream.flush();
        originalFileOutputStream.write("JavaRush © All rights reserved.".getBytes(StandardCharsets.UTF_8));
        originalFileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        originalFileOutputStream.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}