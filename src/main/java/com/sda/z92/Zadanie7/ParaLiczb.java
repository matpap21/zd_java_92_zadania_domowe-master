package com.sda.z92.Zadanie7;

import java.util.Objects;

public class ParaLiczb {
    private int liczbaA, liczbaB;

    public ParaLiczb(int liczbaA, int liczbaB) {
        this.liczbaA = liczbaA;
        this.liczbaB = liczbaB;
    }

    public int getLiczbaA() {
        return liczbaA;
    }

    public int getLiczbaB() {
        return liczbaB;
    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "liczbaA=" + liczbaA +
                ", liczbaB=" + liczbaB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParaLiczb)) return false;
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return getLiczbaA() == paraLiczb.getLiczbaA() && getLiczbaB() == paraLiczb.getLiczbaB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLiczbaA(), getLiczbaB());
    }

}