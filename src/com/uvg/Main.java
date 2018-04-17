package com.uvg;

import fileManager.FileManager;
import fileManager.FileManagerImpl;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManagerImpl();
        fileManager.createDB("newDB");
    }
}
