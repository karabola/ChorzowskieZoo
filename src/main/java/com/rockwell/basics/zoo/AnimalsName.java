package com.rockwell.basics.zoo;

import java.util.Objects;

public class AnimalsName {

    String name;
    PlaceOfBirth placeOfBirth;

    public AnimalsName(int i, String name, PlaceOfBirth placeOfBirth) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalsName that = (AnimalsName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "AnimalsName{" +
                "names='" + name + '\'' +
                ", pleaceOfBirth=" + placeOfBirth +
                '}';
    }
}
