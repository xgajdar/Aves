package sk.gajdar.aves.domain;

import sk.gajdar.aves.domain.api.HasScientific;

public enum TaxonomicRank implements HasScientific {

    CLASS("classis", true),
    SUPERORDER("superordo"),
    ORDER("ordo",true),
    FAMILY("familia", true),
    GENUS("genus", true),
    SPECIES("species", true);

    private String scientific;
    private boolean main;
    private String suffix;

    TaxonomicRank(String scientific) {
        this(scientific, false);
    }

    TaxonomicRank(String scientific, boolean main) {
        this.scientific = scientific;
        this.main = main;
    }

    @Override
    public String getScientific() {
        return scientific;
    }

    public boolean isMain() {
        return main;
    }

    public String getSuffix() {
        return suffix;
    }
}
