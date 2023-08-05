package GB.ToysRaffleStore.Raffle;

import GB.ToysRaffleStore.Toys.Toy;

import java.util.Comparator;

public class ToysComparator<T extends Toy> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1.getToyId() < o2.getToyId()){
            return 1;
        }
        else return -1;
    }
}
