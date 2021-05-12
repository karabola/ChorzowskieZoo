package pl.rockwell.basics.zoo;

import java.util.Objects;

public class AnimalsName {
    String names;

    public AnimalsName(int i, String names) {
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalsName that = (AnimalsName) o;
        return Objects.equals(names, that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }
}
