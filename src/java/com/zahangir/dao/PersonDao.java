
package com.zahangir.dao;

import com.zahangir.model.Person;
import java.util.List;

public interface PersonDao {
    void addPerson(Person person);
    void updatePerson(Person person);
    void deletePersonById(int personId);
    List<Person> getAllPersons();
}
