package com.elyntsev.app.dao;


import com.elyntsev.app.model.Person;

public interface PersonDao {

    Person findByName(String name);
}
