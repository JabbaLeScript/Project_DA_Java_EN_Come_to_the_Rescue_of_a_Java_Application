package com.hemebiotech.analytics.symptoms;

public  class Symptom {
    String name;
    int occurs;

    public Symptom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccurs() {
        return occurs;
    }

    public void setOccurs(int occurs) {
        this.occurs = occurs;
    }

    @Override
    public String toString() {
        return "Symptoms{" +
                "name='" + name + '\'' +
                ", occurs=" + occurs +
                '}';
    }
}