package sk.gajdar.aves.domain.api;

import sk.gajdar.aves.domain.TaxonomicRank;

public interface HasTaxonomicRank {

    TaxonomicRank getTaxonomicRank();

    void setTaxonomicRank(TaxonomicRank taxonomicRank);
}
