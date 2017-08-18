
package com.zahangir.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "creditcard_id")
    private int creditCardId;
    @Column(name = "creditcard_type")
    private String creditCardType;
    @Column(name = "creditcard_number")
    private String creditCardNumber;

    public CreditCard() {
    }

    public CreditCard(int creditCardId, String creditCardType, String creditCardNumber) {
        this.creditCardId = creditCardId;
        this.creditCardType = creditCardType;
        this.creditCardNumber = creditCardNumber;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(int creditCardId) {
        this.creditCardId = creditCardId;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    
    
}
