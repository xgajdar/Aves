package sk.gajdar.aves.domain.api;

import sk.gajdar.aves.domain.TaxonomicRank;

public interface Taxon extends HasId, HasScientific, HasParent {

    TaxonomicRank getTaxonomicRank();

    void setTaxonomicRank(TaxonomicRank rank);
}
