package pl.lucky.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String producer;
    private double pirce;

    public Product(String name, String producer, double pirce) {
        this.name = name;
        this.producer = producer;
        this.pirce = pirce;
    }

}
