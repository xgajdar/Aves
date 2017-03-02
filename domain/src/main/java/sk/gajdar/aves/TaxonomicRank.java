package sk.gajdar.aves;

public enum TaxonomicRank {

    CLASS("classis", true),
    SUPERORDER("superordo"),
    ORDER("ordo",true),
    FAMILY("familia", true),
    GENUS("genus", true),
    SPECIES("species", true);

    private String scientific;
    private boolean main;

    TaxonomicRank(String scientific) {
        this(scientific, false);
    }

    TaxonomicRank(String scientific, boolean main) {
        this.scientific = scientific;
        this.main = main;
    }

    public String getScientific() {
        return scientific;
    }

    public boolean isMain() {
        return main;
    }
}
