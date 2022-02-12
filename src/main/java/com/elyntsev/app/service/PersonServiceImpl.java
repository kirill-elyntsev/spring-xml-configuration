package com.elyntsev.app.service;


import com.elyntsev.app.dao.PersonDao;
import com.elyntsev.app.model.Person;

public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
