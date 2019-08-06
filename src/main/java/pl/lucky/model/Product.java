package pl.lucky.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 1098237091283L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Producer producer;
    private double pirce;
    private int quantity;

    public Product(String name, Producer producer, double pirce, int quantity) {
        this.name = name;
        this.producer = producer;
        this.pirce = pirce;
        this.quantity = quantity;
    }
}
