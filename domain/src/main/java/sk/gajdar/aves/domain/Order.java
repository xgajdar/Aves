package sk.gajdar.aves.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import sk.gajdar.aves.domain.api.Taxon;

public class Order implements Taxon {

    private Long id;

    private String scientific;
    private String name;
    private TaxonomicRank rank;
    private Taxon parent;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getScientific() {
        return null;
    }

    public void setScientific(String scientific) {
        this.scientific = scientific;
    }

    @Override
    public TaxonomicRank getTaxonomicRank() {
        return null;
    }

    @Override
    public void setTaxonomicRank(TaxonomicRank rank) {
        this.rank = rank;
    }


    @Override
    public Taxon getParent() {
        return parent;
    }

    @Override
    public void setParent(Taxon parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Order order = (Order) o;

        return new EqualsBuilder()
                .append(id, order.id)
                .append(scientific, order.scientific)
                .append(rank, order.rank)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(scientific)
                .append(rank)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", scientific='" + scientific + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
