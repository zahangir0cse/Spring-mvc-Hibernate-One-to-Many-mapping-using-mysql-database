/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahangir.dao;

import com.zahangir.model.CreditCard;
import com.zahangir.model.Person;
import java.util.List;
import java.util.Set;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Zahangir Alam
 */
@Repository
public class PersonDaoImpl implements PersonDao {
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void addPerson(Person person) {
        sessionFactory.getCurrentSession().save(person);
    }
    
    @Override
    public void updatePerson(Person person) {
        sessionFactory.getCurrentSession().update(person);
    }
    
    @Override
    public void deletePersonById(int personId) {
        Person person = (Person) sessionFactory.getCurrentSession().createQuery("from Person as p LEFT JOIN FETCH p.creditCard where p.personId=" + personId).uniqueResult();
        Set<CreditCard> creditCards = person.getCreditCard();
        sessionFactory.getCurrentSession().delete(person);
        creditCards.forEach((creditCard) -> {
            sessionFactory.getCurrentSession().delete(creditCard);
        });
    }
    
    @Override
    public List<Person> getAllPersons() {
     List<Person> persons = sessionFactory.getCurrentSession().createQuery("from Person").list();
     return persons;
    }
    
}
