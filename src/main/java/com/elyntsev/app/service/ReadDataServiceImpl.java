package com.elyntsev.app.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadDataServiceImpl implements ReadDataService {
    @Override
    public void readFromFile() {
        try {
            Reader reader = new FileReader("/questions.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
