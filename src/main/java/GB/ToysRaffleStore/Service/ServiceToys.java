package GB.ToysRaffleStore.Service;

import GB.ToysRaffleStore.Toys.Toy;

import java.util.PriorityQueue;
import java.util.Queue;

public class ServiceToys {
    private Queue<Toy> toyQueue = new PriorityQueue<>();
    public Queue<Toy> getAllToys(){
        return toyQueue;
    }
    public void create(long toyId, String name, int frequency){
        Toy toy = new Toy(toyId, name, frequency);
        toyQueue.add(toy);
    }
}
