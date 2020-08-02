package mhj.es.api.elements;

import java.util.LinkedHashMap;

public class Element {
    String name;


    String abbr;
    int change;


    String[] tag;

    public Element(String name, String abbr, int change, String... tag) {
//        if (elements.containsKey(change)) throw new IllegalArgumentException(name + "is existed");
        this.name = name;
        this.change = change;
        this.tag = tag;
        this.abbr = abbr;
        elements.put(change, this);
    }

    public String getAbbr() {
        return abbr;
    }

    public String getName() {
        return name;
    }

    public int getChange() {
        return change;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    public static LinkedHashMap<Integer, Element> elements = new LinkedHashMap();

    public static Element H = new Element("Hydrogen", "H", 1);
    public static Element He = new Element("Helium", "He", 2, "Inert");
    public static Element Li = new Element("Lithium", "Li", 3, "Alkali");
    public static Element Be = new Element("Beryllium", "Be", 4, "Alkaline");
    public static Element B = new Element("Boron", "B", 5, "Metalloid");
    public static Element C = new Element("Carbon", "C", 6, "NonMetal");
    public static Element N = new Element("Nitrogen", "N", 7, "NonMetal");
    public static Element O = new Element("Oxygen", "O", 8, "NonMetal");
    public static Element F = new Element("Fluorine", "F", 9, "Halogen");
    public static Element Ne = new Element("Neon", "Ne", 10, "Inert");
    public static Element Na = new Element("Sodium", "Na", 11, "Alkali");
    public static Element Mg = new Element("Magnesium", "Mg", 12, "Alkaline");
    public static Element Al = new Element("Aluminium", "Al", 13, "otherMetal");
    public static Element Si = new Element("Silicon", "Si", 14, "Metalloid");
    public static Element P = new Element("Phosphorus", "P", 15, "NonMetal");
    public static Element S = new Element("Sulfur", "S", 16, "NonMetal");
    public static Element Cl = new Element("Chlorine", "Cl", 17, "Halogen");
    public static Element Ar = new Element("Argon", "Ar", 18, "Inert");
    public static Element K = new Element("Potassium", "K", 19, "Alkali");
    public static Element Ca = new Element("Calcium", "Ca", 20, "Alkaline");
    public static Element Sc = new Element("Scandium", "Sc", 21, "Transition");
    public static Element Ti = new Element("Titanium", "Ti", 22, "Transition");
    public static Element V = new Element("Vanadium", "V", 23, "Transition");
    public static Element Cr = new Element("Chromium", "Cr", 24, "Transition");
    public static Element Mn = new Element("Manganese", "Mn", 25, "Transition");
    public static Element Fe = new Element("Iron", "Fe", 26, "Transition");
    public static Element Co = new Element("Cobalt", "Co", 27, "Transition");
    public static Element Ni = new Element("Nickel", "Ni", 28, "Transition");
    public static Element Cu = new Element("Copper", "Cu", 29, "Transition");
    public static Element Zn = new Element("Zinc", "Zn", 30, "Transition");
    public static Element Ga = new Element("Gallium", "Ga", 31, "otherMetal");
    public static Element Ge = new Element("Germanium", "Ge", 32, "Metalloid");
    public static Element As = new Element("Arsenic", "As", 33, "Metalloid");
    public static Element Se = new Element("Selenium", "Se", 34, "NonMetal");
    public static Element Br = new Element("Bromine", "Br", 35, "Halogen");
    public static Element Kr = new Element("Krypton", "Kr", 36, "Inert");
    public static Element Rb = new Element("Rubidium", "Rb", 37, "Alkali");
    public static Element Sr = new Element("Strontium", "Sr", 38, "Alkaline");
    public static Element Y = new Element("Yttrium", "Y", 39, "Transition");
    public static Element Zr = new Element("Zirconium", "Zr", 40, "Transition");
    public static Element Nb = new Element("Niobium", "Nd", 41, "Transition");
    public static Element Mo = new Element("Molybdenum", "Mo", 42, "Transition");
    public static Element Tc = new Element("Technetium", "Tc", 43, "Transition");
    public static Element Ru = new Element("Ruthenium", "Ru", 44, "Transition");
    public static Element Rh = new Element("Rhodium", "Rh", 45, "Transition");
    public static Element Pd = new Element("Palladium", "Pd", 46, "Transition");
    public static Element Ag = new Element("Silver", "Ag", 47, "Transition");
    public static Element Cd = new Element("Cadmium", "Cd", 48, "Transition");
    public static Element In = new Element("Indium", "In", 49, "otherMetal");
    public static Element Sn = new Element("Tin", "Sn", 50, "otherMetal");
    public static Element Sb = new Element("Antimony", "Sb", 51, "Metalloid");
    public static Element Te = new Element("Tellurium", "Te", 52, "Metalloid");
    public static Element I = new Element("Iodine", "I", 53, "Halogen");
    public static Element Xe = new Element("Xenon", "Xe", 54, "Inert");
    public static Element Cs = new Element("Caesium", "Cs", 55, "Alkali");
    public static Element Ba = new Element("Barium", "Ba", 56, "Alkaline");
    public static Element La = new Element("Lanthanum", "La", 57, "Lanthanide");
    public static Element Ce = new Element("Cerium", "Ce", 58, "Lanthanide");
    public static Element Pr = new Element("Praseodymium", "Pr", 59, "Lanthanide");
    public static Element Nd = new Element("Neodymium", "Nd", 60, "Lanthanide");
    public static Element Pm = new Element("Promethium", "Pm", 61, "Lanthanide");
    public static Element Sm = new Element("Samarium", "Sm", 62, "Lanthanide");
    public static Element Eu = new Element("Europium", "Eu", 63, "Lanthanide");
    public static Element Gd = new Element("Gadolinium", "Gd", 64, "Lanthanide");
    public static Element Tb = new Element("Terbium", "Tb", 65, "Lanthanide");
    public static Element Dy = new Element("Dyprosium", "Dy", 66, "Lanthanide");
    public static Element Ho = new Element("Holmium", "Ho", 67, "Lanthanide");
    public static Element Er = new Element("Erbium", "Er", 68, "Lanthanide");
    public static Element Tm = new Element("Thulium", "Tm", 69, "Lanthanide");
    public static Element Yb = new Element("Ytterbium", "Yb", 70, "Lanthanide");
    public static Element Lu = new Element("Lutetium", "Lu", 71, "Lanthanide");
    public static Element Hf = new Element("Hafnium", "Hf", 72, "Transition");
    public static Element Ta = new Element("Tantalum", "Ta", 73, "Transition");
    public static Element W = new Element("Tungsten", "W", 74, "Transition");
    public static Element Re = new Element("Rhenium", "Re", 75, "Transition");
    public static Element Os = new Element("Osmium", "Os", 76, "Transition");
    public static Element Ir = new Element("Iridium", "Ir", 77, "Transition");
    public static Element Pt = new Element("Platinum", "Pt", 78, "Transition");
    public static Element Au = new Element("Gold", "Au", 79, "Transition");
    public static Element Hg = new Element("Mercury", "Hg", 80, "Transition");
    public static Element Tl = new Element("Thallium", "Tl", 81, "otherMetal");
    public static Element Pb = new Element("Lead", "Pb", 82, "otherMetal");
    public static Element Bi = new Element("Bismuth", "Bi", 83, "otherMetal");
    public static Element Po = new Element("Polonium", "Po", 84, "Metalloid");
    public static Element At = new Element("Astantine", "At", 85, "Halogen");
    public static Element Rn = new Element("Radon", "Rn", 86, "Inert");
    public static Element Fr = new Element("Francium", "Fr", 87, "Alkali");
    public static Element Ra = new Element("Radium", "Ra", 88, "Alkaline");
    public static Element Ac = new Element("Actinium", "Ac", 89, "Actinide");
    public static Element Th = new Element("Thorium", "Th", 90, "Actinide");
    public static Element Pa = new Element("Protactinium", "Pa", 91, "Actinide");
    public static Element U = new Element("Uranium", "U", 92, "Actinide");
    public static Element Np = new Element("Neptunium", "Np", 93, "Actinide");
    public static Element Pu = new Element("Plutonium", "Pu", 94, "Actinide");
    public static Element Am = new Element("Americium", "Am", 95, "Actinide");
    public static Element Cm = new Element("Curium", "Cm", 96, "Actinide");
    public static Element Bk = new Element("Berkelium", "Bk", 97, "Actinide");
    public static Element Cf = new Element("Californium", "Cf", 98, "Actinide");
    public static Element Es = new Element("Einsteinium", "Es", 99, "Actinide");
    public static Element Fm = new Element("Fermium", "Fm", 100, "Actinide");
    public static Element Md = new Element("Mendelenium", "Md", 101, "Actinide");
    public static Element No = new Element("Nobelium", "No", 102, "Actinide");
    public static Element Lr = new Element("Lawrencium", "Lr", 103, "Actinide");
    public static Element Rf = new Element("Rutherfordium", "Rf", 104, "Transition");
    public static Element Db = new Element("Dubnium", "Db", 105, "Transition");
    public static Element Sg = new Element("Seaborgium", "Sg", 106, "Transition");
    public static Element Bh = new Element("Bohrium", "Bh", 107, "Transition");
    public static Element Hs = new Element("Hassium", "Hs", 108, "Transition");
    public static Element Mt = new Element("Meitnerium", "Mt", 109, "Transition");
    public static Element Ds = new Element("Darmstadtium", "Ds", 110, "Transition");
    public static Element Rg = new Element("Roenthenium", "Rg", 111, "Transition");
    public static Element Cn = new Element("Copernicium", "Cn", 112, "Transition");
    public static Element Nh = new Element("Nihonium", "Nh", 113);
    public static Element Fl = new Element("Flerovium", "Fl", 114);
    public static Element Mc = new Element("Moscovium", "Mc", 115);
    public static Element Lv = new Element("Livermorium", "Lv", 116);
    public static Element Ts = new Element("Tennessine", "Ts", 117);
    public static Element Og = new Element("Oganesson", "Og", 118);
}
