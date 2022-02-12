package com.elyntsev.app.service;


import com.elyntsev.app.model.Person;

public interface PersonService {

    Person getByName(String name);
}
