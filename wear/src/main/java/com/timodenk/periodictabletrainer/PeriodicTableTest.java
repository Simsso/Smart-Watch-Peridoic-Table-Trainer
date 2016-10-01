package com.timodenk.periodictabletrainer;

public class PeriodicTableTest {
        public static final Element[] elements = {
                new Element(1, "Hydrogen", "H", ElementColors.DIATOMIC_NONMETAL),
                new Element(2, "Helium", "He", ElementColors.NOBLE_GAS),
                new Element(3, "Lithium", "Li", ElementColors.ALKALI_METAL),
                new Element(4, "Beryllium", "Be", ElementColors.ALKALINE_EARTH_METAL),
                new Element(5, "Boron", "B", ElementColors.METALLOID),
                new Element(6, "Carbon", "C", ElementColors.POLYATOMIC_NONMETAL),
                new Element(7, "Nitrogen", "N", ElementColors.DIATOMIC_NONMETAL),
                new Element(8, "Oxygen", "O", ElementColors.DIATOMIC_NONMETAL),
                new Element(9, "Fluorine", "F", ElementColors.DIATOMIC_NONMETAL),
                new Element(10, "Neon", "Ne", ElementColors.NOBLE_GAS),
                new Element(11, "Sodium", "Na", ElementColors.ALKALI_METAL),
                new Element(12, "Magnesium", "Mg", ElementColors.ALKALINE_EARTH_METAL),
                new Element(13, "Aluminum", "Al", ElementColors.POST_TRANSITION_METAL),
                new Element(14, "Silicon", "Si", ElementColors.METALLOID),
                new Element(15, "Phosphorus", "P", ElementColors.POLYATOMIC_NONMETAL),
                new Element(16, "Sulfur", "S", ElementColors.POLYATOMIC_NONMETAL),
                new Element(17, "Chlorine", "Cl", ElementColors.DIATOMIC_NONMETAL),
                new Element(18, "Argon", "Ar", ElementColors.NOBLE_GAS),
                new Element(19, "Potassium", "K", ElementColors.ALKALI_METAL),
                new Element(20, "Calcium", "Ca", ElementColors.ALKALINE_EARTH_METAL),
                new Element(21, "Scandium", "Sc", ElementColors.TRANSITION_METAL),
                new Element(22, "Titanium", "Ti", ElementColors.TRANSITION_METAL),
                new Element(23, "Vanadium", "V", ElementColors.TRANSITION_METAL),
                new Element(24, "Chromium", "Cr", ElementColors.TRANSITION_METAL),
                new Element(25, "Manganese", "Mn", ElementColors.TRANSITION_METAL),
                new Element(26, "Iron", "Fe", ElementColors.TRANSITION_METAL),
                new Element(27, "Cobalt", "Co", ElementColors.TRANSITION_METAL),
                new Element(28, "Nickel", "Ni", ElementColors.TRANSITION_METAL),
                new Element(29, "Copper", "Cu", ElementColors.TRANSITION_METAL),
                new Element(30, "Zinc", "Zn", ElementColors.TRANSITION_METAL),
                new Element(31, "Gallium", "Ga", ElementColors.POST_TRANSITION_METAL),
                new Element(32, "Germanium", "Ge", ElementColors.METALLOID),
                new Element(33, "Arsenic", "As", ElementColors.METALLOID),
                new Element(34, "Selenium", "Se", ElementColors.POLYATOMIC_NONMETAL),
                new Element(35, "Bromine", "Br", ElementColors.DIATOMIC_NONMETAL),
                new Element(36, "Krypton", "Kr", ElementColors.NOBLE_GAS),
                new Element(37, "Rubidium", "Rb", ElementColors.ALKALI_METAL),
                new Element(38, "Strontium", "Sr", ElementColors.ALKALINE_EARTH_METAL),
                new Element(39, "Yttrium", "Y", ElementColors.TRANSITION_METAL),
                new Element(40, "Zirconium", "Zr", ElementColors.TRANSITION_METAL),
                new Element(41, "Niobium", "Nb", ElementColors.TRANSITION_METAL),
                new Element(42, "Molybdenum", "Mo", ElementColors.TRANSITION_METAL),
                new Element(43, "Technetium", "Tc", ElementColors.TRANSITION_METAL),
                new Element(44, "Ruthenium", "Ru", ElementColors.TRANSITION_METAL),
                new Element(45, "Rhodium", "Rh", ElementColors.TRANSITION_METAL),
                new Element(46, "Palladium", "Pd", ElementColors.TRANSITION_METAL),
                new Element(47, "Silver", "Ag", ElementColors.TRANSITION_METAL),
                new Element(48, "Cadmium", "Cd", ElementColors.TRANSITION_METAL),
                new Element(49, "Indium", "In", ElementColors.POST_TRANSITION_METAL),
                new Element(50, "Tin", "Sn", ElementColors.POST_TRANSITION_METAL),
                new Element(51, "Antimony", "Sb", ElementColors.METALLOID),
                new Element(52, "Tellurium", "Te", ElementColors.METALLOID),
                new Element(53, "Iodine", "I", ElementColors.DIATOMIC_NONMETAL),
                new Element(54, "Xenon", "Xe", ElementColors.NOBLE_GAS),
                new Element(55, "Caesium", "Cs", ElementColors.ALKALI_METAL),
                new Element(56, "Barium", "Ba", ElementColors.ALKALINE_EARTH_METAL),
                new Element(57, "Lanthanum", "La", ElementColors.LANTHANIDE),
                new Element(58, "Cerium", "Ce", ElementColors.LANTHANIDE),
                new Element(59, "Praseodymium", "Pr", ElementColors.LANTHANIDE),
                new Element(60, "Neodymium", "Nd", ElementColors.LANTHANIDE),
                new Element(61, "Promethium", "Pm", ElementColors.LANTHANIDE),
                new Element(62, "Samarium", "Sm", ElementColors.LANTHANIDE),
                new Element(63, "Europium", "Eu", ElementColors.LANTHANIDE),
                new Element(64, "Gadolinium", "Gd", ElementColors.LANTHANIDE),
                new Element(65, "Terbium", "Tb", ElementColors.LANTHANIDE),
                new Element(66, "Dysprosium", "Dy", ElementColors.LANTHANIDE),
                new Element(67, "Holmium", "Ho", ElementColors.LANTHANIDE),
                new Element(68, "Erbium", "Er", ElementColors.LANTHANIDE),
                new Element(69, "Thulium", "Tm", ElementColors.LANTHANIDE),
                new Element(70, "Ytterbium", "Yb", ElementColors.LANTHANIDE),
                new Element(71, "Lutetium", "Lu", ElementColors.LANTHANIDE),
                new Element(72, "Hafnium", "Hf", ElementColors.TRANSITION_METAL),
                new Element(73, "Tantalum", "Ta", ElementColors.TRANSITION_METAL),
                new Element(74, "Tungsten", "W", ElementColors.TRANSITION_METAL),
                new Element(75, "Rhenium", "Re", ElementColors.TRANSITION_METAL),
                new Element(76, "Osmium", "Os", ElementColors.TRANSITION_METAL),
                new Element(77, "Iridium", "Ir", ElementColors.TRANSITION_METAL),
                new Element(78, "Platinum", "Pt", ElementColors.TRANSITION_METAL),
                new Element(79, "Gold", "Au", ElementColors.TRANSITION_METAL),
                new Element(80, "Mercury", "Hg", ElementColors.TRANSITION_METAL),
                new Element(81, "Thallium", "Tl", ElementColors.POST_TRANSITION_METAL),
                new Element(82, "Lead", "Pb", ElementColors.POST_TRANSITION_METAL),
                new Element(83, "Bismuth", "Bi", ElementColors.POST_TRANSITION_METAL),
                new Element(84, "Polonium", "Po", ElementColors.POST_TRANSITION_METAL),
                new Element(85, "Astatine", "At", ElementColors.METALLOID),
                new Element(86, "Radon", "Rn", ElementColors.NOBLE_GAS),
                new Element(87, "Francium", "Fr", ElementColors.ALKALI_METAL),
                new Element(88, "Radium", "Ra", ElementColors.ALKALINE_EARTH_METAL),
                new Element(89, "Actinium", "Ac", ElementColors.ACTINIDE),
                new Element(90, "Thorium", "Th", ElementColors.ACTINIDE),
                new Element(91, "Protactinium", "Pa", ElementColors.ACTINIDE),
                new Element(92, "Uranium", "U", ElementColors.ACTINIDE),
                new Element(93, "Neptunium", "Np", ElementColors.ACTINIDE),
                new Element(94, "Plutonium", "Pu", ElementColors.ACTINIDE),
                new Element(95, "Americium", "Am", ElementColors.ACTINIDE),
                new Element(96, "Curium", "Cm", ElementColors.ACTINIDE),
                new Element(97, "Berkelium", "Bk", ElementColors.ACTINIDE),
                new Element(98, "Californium", "Cf", ElementColors.ACTINIDE),
                new Element(99, "Einsteinium", "Es", ElementColors.ACTINIDE),
                new Element(100, "Fermium", "Fm", ElementColors.ACTINIDE),
                new Element(101, "Mendelevium", "Md", ElementColors.ACTINIDE),
                new Element(102, "Nobelium", "No", ElementColors.ACTINIDE),
                new Element(103, "Lawrencium", "Lr", ElementColors.ACTINIDE),
                new Element(104, "Rutherfordium", "Rf", ElementColors.TRANSITION_METAL),
                new Element(105, "Dubnium", "Db", ElementColors.TRANSITION_METAL),
                new Element(106, "Seaborgium", "Sg", ElementColors.TRANSITION_METAL),
                new Element(107, "Bohrium", "Bh", ElementColors.TRANSITION_METAL),
                new Element(108, "Hassium", "Hs", ElementColors.TRANSITION_METAL),
                new Element(109, "Meitnerium", "Mt", ElementColors.UNKNOWN),
                new Element(110, "Darmstadtium", "Ds", ElementColors.UNKNOWN),
                new Element(111, "Roentgenium", "Rg", ElementColors.UNKNOWN),
                new Element(112, "Copernicium", "Cn", ElementColors.TRANSITION_METAL),
                new Element(113, "Uuntrium", "Uut", ElementColors.UNKNOWN),
                new Element(114, "Flerovium", "Fl", ElementColors.POST_TRANSITION_METAL),
                new Element(115, "Ununpentium", "Uup", ElementColors.UNKNOWN),
                new Element(116, "Livermorium", "Lv", ElementColors.UNKNOWN),
                new Element(117, "Ununseptium", "Uus", ElementColors.UNKNOWN),
                new Element(118, "Ununoctium", "Uuo", ElementColors.UNKNOWN),
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
