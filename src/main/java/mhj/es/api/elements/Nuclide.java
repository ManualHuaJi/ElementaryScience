package mhj.es.api.elements;

public class Nuclide extends Element {
    int neutron;

    public Nuclide(String name, String abbr, int change, int neutron, String... tag) {
        super(name, abbr, change, tag);
        this.neutron = neutron;
    }
}
