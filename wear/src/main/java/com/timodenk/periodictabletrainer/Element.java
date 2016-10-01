package com.timodenk.periodictabletrainer;

public class Element {
    private int atomicNumber;
    private String element, symbol;
    private ElementColors color;

    public Element(int atomicNumber, String element, String symbol, ElementColors color) {
        this.atomicNumber = atomicNumber;
        this.element = element;
        this.symbol = symbol;
        this.color = color;
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

    public int getColor() { return color.getColor(); }
}
