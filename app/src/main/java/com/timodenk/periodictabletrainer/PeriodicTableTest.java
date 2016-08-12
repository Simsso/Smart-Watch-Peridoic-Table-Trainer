package com.timodenk.periodictabletrainer;

public class PeriodicTableTest {
    public static final Element[] elements = {
            new Element(1, "Hydrogen", "H"),
            new Element(2, "Helium", "He"),
            new Element(3, "Lithium", "Li"),
            new Element(4, "Beryllium", "Be"),
            new Element(5, "Boron", "B"),
            new Element(6, "Carbon", "C"),
            new Element(7, "Nitrogen", "N"),
            new Element(8, "Oxygen", "O"),
            new Element(9, "Fluorine", "F"),
            new Element(10, "Neon", "Ne"),
            new Element(11, "Sodium", "Na"),
            new Element(12, "Magnesium", "Mg"),
            new Element(13, "Aluminum", "Al"),
            new Element(14, "Silicon", "Si"),
            new Element(15, "Phosphorus", "P"),
            new Element(16, "Sulfur", "S"),
            new Element(17, "Chlorine", "Cl"),
            new Element(18, "Argon", "Ar"),
            new Element(19, "Potassium", "K"),
            new Element(20, "Calcium", "Ca"),
            new Element(21, "Scandium", "Sc"),
            new Element(22, "Titanium", "Ti"),
            new Element(23, "Vanadium", "V"),
            new Element(24, "Chromium", "Cr"),
            new Element(25, "Manganese", "Mn"),
            new Element(26, "Iron", "Fe"),
            new Element(27, "Cobalt", "Co"),
            new Element(28, "Nickel", "Ni"),
            new Element(29, "Copper", "Cu"),
            new Element(30, "Zinc", "Zn"),
            new Element(31, "Gallium", "Ga"),
            new Element(32, "Germanium", "Ge"),
            new Element(33, "Arsenic", "As"),
            new Element(34, "Selenium", "Se"),
            new Element(35, "Bromine", "Br"),
            new Element(36, "Krypton", "Kr"),
            new Element(37, "Rubidium", "Rb"),
            new Element(38, "Strontium", "Sr"),
            new Element(39, "Yttrium", "Y"),
            new Element(40, "Zirconium", "Zr"),
            new Element(41, "Niobium", "Nb"),
            new Element(42, "Molybdenum", "Mo"),
            new Element(43, "Technetium", "Tc"),
            new Element(44, "Ruthenium", "Ru"),
            new Element(45, "Rhodium", "Rh"),
            new Element(46, "Palladium", "Pd"),
            new Element(47, "Silver", "Ag"),
            new Element(48, "Cadmium", "Cd"),
            new Element(49, "Indium", "In"),
            new Element(50, "Tin", "Sn"),
            new Element(51, "Antimony", "Sb"),
            new Element(52, "Tellurium", "Te"),
            new Element(53, "Iodine", "I"),
            new Element(54, "Xenon", "Xe"),
            new Element(55, "Cesium", "Cs"),
            new Element(56, "Barium", "Ba"),
            new Element(57, "Lanthanum", "La"),
            new Element(58, "Cerium", "Ce"),
            new Element(59, "Praseodymium", "Pr"),
            new Element(60, "Neodymium", "Nd"),
            new Element(61, "Promethium", "Pm"),
            new Element(62, "Samarium", "Sm"),
            new Element(63, "Europium", "Eu"),
            new Element(64, "Gadolinium", "Gd"),
            new Element(65, "Terbium", "Tb"),
            new Element(66, "Dysprosium", "Dy"),
            new Element(67, "Holmium", "Ho"),
            new Element(68, "Erbium", "Er"),
            new Element(69, "Thulium", "Tm"),
            new Element(70, "Ytterbium", "Yb"),
            new Element(71, "Lutetium", "Lu"),
            new Element(72, "Hafnium", "Hf"),
            new Element(73, "Tantalum", "Ta"),
            new Element(74, "Tungsten", "W"),
            new Element(75, "Rhenium", "Re"),
            new Element(76, "Osmium", "Os"),
            new Element(77, "Iridium", "Ir"),
            new Element(78, "Platinum", "Pt"),
            new Element(79, "Gold", "Au"),
            new Element(80, "Mercury", "Hg"),
            new Element(81, "Thallium", "Tl"),
            new Element(82, "Lead", "Pb"),
            new Element(83, "Bismuth", "Bi"),
            new Element(84, "Polonium", "Po"),
            new Element(85, "Astatine", "At"),
            new Element(86, "Radon", "Rn"),
            new Element(87, "Francium", "Fr"),
            new Element(88, "Radium", "Ra"),
            new Element(89, "Actinium", "Ac"),
            new Element(90, "Thorium", "Th"),
            new Element(91, "Protactinium", "Pa"),
            new Element(92, "Uranium", "U"),
            new Element(93, "Neptunium", "Np"),
            new Element(94, "Plutonium", "Pu"),
            new Element(95, "Americium", "Am"),
            new Element(96, "Curium", "Cm"),
            new Element(97, "Berkelium", "Bk"),
            new Element(98, "Californium", "Cf"),
            new Element(99, "Einsteinium", "Es"),
            new Element(100, "Fermium", "Fm"),
            new Element(101, "Mendelevium", "Md"),
            new Element(102, "Nobelium", "No"),
            new Element(103, "Lawrencium", "Lr"),
            new Element(104, "Rutherfordium", "Rf"),
            new Element(105, "Dubnium", "Db"),
            new Element(106, "Seaborgium", "Sg"),
            new Element(107, "Bohrium", "Bh"),
            new Element(108, "Hassium", "Hs"),
            new Element(109, "Meitnerium", "Mt"),
            new Element(110, "Darmstadtium", "Ds"),
            new Element(111, "Roentgenium", "Rg"),
            new Element(112, "Copernicium", "Cn"),
            new Element(113, "Nihonium", "Nh"),
            new Element(114, "Flerovium", "Fl"),
            new Element(115, "Moscovium", "Mc"),
            new Element(116, "Livermorium", "Lv"),
            new Element(117, "Tennessine", "Ts"),
            new Element(118, "Oganesson", "Og")
    };

    private int currentElementIndex = 0;

    public PeriodicTableTest() {

    }

    public Element getCurrentElement() {
        return elements[currentElementIndex];
    }

    public void next() {
        currentElementIndex++;
        if (currentElementIndex >= elements.length) {
            restart();
        }
    }

    public void restart() {
        currentElementIndex = 0;
    }

    public double getProgress() {
        return (double)(currentElementIndex + 1) / elements.length;
    }
}
