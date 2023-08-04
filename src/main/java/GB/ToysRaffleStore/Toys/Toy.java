package GB.ToysRaffleStore.Toys;

public class Toy {
    private long toyId;
    private String name;
    private int frequency;

    public Toy(long toyId, String name, int frequency){
        this.toyId = toyId;
        this.name = name;
        this.frequency = frequency;
    }
    public long getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyId=" + toyId +
                ", name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }

//    @Override
//    public int compareTo(Toy o) {
//        return this.frequency.compareTo(o.frequency);
//    }
}
