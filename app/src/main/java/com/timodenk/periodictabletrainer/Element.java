package com.timodenk.periodictabletrainer;

public class Element {
    private int atomicNumber;
    private String element, symbol;

    public Element(int atomicNumber, String element, String symbol) {
        this.atomicNumber = atomicNumber;
        this.element = element;
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getElement() {
        return element;
    }

    public String getSymbol() {
        return symbol;
    }
}
