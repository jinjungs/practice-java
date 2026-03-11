package me.ejjung.prepareInterview.concept.hashmaps;

public class HashAndKey {
    int hashcode;
    String key;

    public HashAndKey(int hashcode, String key) {
        this.hashcode = hashcode;
        this.key = key;
    }

    @Override
    public int hashCode() {
        System.out.println("Calling hashcode(): " + key);
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Calling equals() for key: " + obj);
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HashAndKey other = (HashAndKey) obj;
        return hashcode == other.hashcode && key.equals(other.key);
    }

}
