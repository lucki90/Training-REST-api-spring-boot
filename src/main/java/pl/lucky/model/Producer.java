package pl.lucky.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Producer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String country;
    private double totalIncome;
    @OneToMany(mappedBy = "producer")
    private List<Product> products;

    public Producer(String name, String country, double totalIncome) {
        this.name = name;
        this.country = country;
        this.totalIncome = totalIncome;
    }
}
