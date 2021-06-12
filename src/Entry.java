public class Entry {

    String key;
    Integer value;

    public Entry(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public void setKey(String key){
        this.key = key;
    }

    public void setValue(int newNum){
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Entry other = (Entry) obj;
        if (this.key != other.key && (this.key == null || !this.key.equals(other.key))){
            return false;
        }
        if (this.value != other.value && (this.value == null || !this.value.equals(other.value))){
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.key != null ? this.key.hashCode() : 0);
        hash = 23 * hash + (this.value != null ? this.value.hashCode() : 0);
        return hash;
    }
}

