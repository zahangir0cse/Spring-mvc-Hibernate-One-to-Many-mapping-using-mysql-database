/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahangir.service;

import com.zahangir.dao.PersonDao;
import com.zahangir.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Zahangir Alam
 */
@Service
public class PersonServiceImpl implements PersonService{
    
    @Autowired
    PersonDao personDao;

    @Override
    @Transactional
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    @Override
    @Transactional
    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    @Transactional
    public void deletePersonById(int personId) {
        personDao.deletePersonById(personId);
    }

    @Override
    @Transactional
    public List<Person> getAllPersons() {
        return personDao.getAllPersons();
    }
    
}
