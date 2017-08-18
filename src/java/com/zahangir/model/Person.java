
package com.zahangir.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int personId;
    @Column(name = "person_name")
    private String personName;
    @Column(name = "person_conatct_no")
    private String personContactNo;
    @Column(name = "person_address")
    private String personAddress;
    @OneToMany
    private Set<CreditCard> creditCard;

    public Person() {
    }

    public Person(int personId, String personName, String personContactNo, String personAddress, Set<CreditCard> creditCard) {
        this.personId = personId;
        this.personName = personName;
        this.personContactNo = personContactNo;
        this.personAddress = personAddress;
        this.creditCard = creditCard;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonContactNo() {
        return personContactNo;
    }

    public void setPersonContactNo(String personContactNo) {
        this.personContactNo = personContactNo;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public Set<CreditCard> getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Set<CreditCard> creditCard) {
        this.creditCard = creditCard;
    }
    
    
    
}
