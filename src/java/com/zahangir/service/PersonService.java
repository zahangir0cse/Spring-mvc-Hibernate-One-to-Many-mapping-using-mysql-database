/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahangir.service;

import com.zahangir.model.Person;
import java.util.List;

/**
 *
 * @author Zahangir Alam
 */
public interface PersonService {
    void addPerson(Person person);
    void updatePerson(Person person);
    void deletePersonById(int personId);
    List<Person> getAllPersons();
}
