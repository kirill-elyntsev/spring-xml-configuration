package com.elyntsev.app.service;

import java.util.Scanner;

public class InputDataServiceImpl implements InputDataService {

    protected String studentName;

    @Override
    public void readInputData() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
    }

    protected void askFirstName(){

    }

    protected void askLastName(){

    }
}
