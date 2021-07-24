package com.sda.z92.Zadanie7;

public class Pairs<T, U> {
    private T liczbaA;
    private U liczbaB;

    public Pairs(T d1, U d2) {
        this.liczbaA = d1;
        this.liczbaB = d2;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Pairs)) return false;
        Pairs<T, U> newData = (Pairs<T, U>) object;
        return liczbaA.equals(newData.liczbaA) && liczbaB.equals(newData.liczbaB);
    }

    @Override
    public int hashCode() {
        int result = liczbaA != null ? liczbaA.hashCode() : 0;
        result = 31 * result + (liczbaB != null ? liczbaB.hashCode() : 0);
        return result;
    }

    public String toString() {
        return liczbaA.toString() + " " + liczbaB.toString();
    }
}