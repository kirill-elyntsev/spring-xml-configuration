package com.elyntsev.app.dao;


import com.elyntsev.app.model.Person;

public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
