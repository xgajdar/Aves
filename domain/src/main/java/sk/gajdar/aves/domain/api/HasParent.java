package sk.gajdar.aves.domain.api;

public interface HasParent {

    Taxon getParent();

    void setParent(Taxon parent);
}
