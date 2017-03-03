package sk.gajdar.aves;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String scientific;
    private String name;
    private TaxonomicRank rank;



}
