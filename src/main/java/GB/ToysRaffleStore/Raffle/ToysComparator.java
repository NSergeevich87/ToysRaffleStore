package GB.ToysRaffleStore.Raffle;

import GB.ToysRaffleStore.Toys.Toy;

import java.util.Comparator;

public class ToysComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {

        return (int) (o1.getFrequency() - o2.getFrequency());
    }
}
