package GB.ToysRaffleStore.Service;

import GB.ToysRaffleStore.FileWriter.WriteToFile;
import GB.ToysRaffleStore.Raffle.ToysComparator;
import GB.ToysRaffleStore.Toys.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ServiceToys {
    private Queue<Toy> toyQueue = new PriorityQueue<>();
    public Queue<Toy> getAllToys(){
        return toyQueue;
    }
    public void create(long toyId, String name, int frequency){
        Toy toy = new Toy(toyId, name, frequency);
        toyQueue.add(toy);
    }

    public void getToysWithProbability(Queue<Toy> toyQueue){
        WriteToFile writeToFile = new WriteToFile();
        Random rand = new Random();
        int sum = 0;
        for (Toy q: toyQueue) {
            int r = rand.nextInt(1,11);
            sum += q.getFrequency();
            if (sum >= r){
                sum = 0;
                q.setCount();
                writeToFile.FileWriter("Игрушка с Id: " + q.getToyId() + " ВЫПАЛА!");
                System.out.println("Игрушка с Id: " + q.getToyId() + " ВЫПАЛА!");
            }
            else {
                sum = 0;
                writeToFile.FileWriter("Игрушка с Id: " + q.getToyId() + " не выпала!");
                System.out.println("Игрушка с Id: " + q.getToyId() + " не выпала!");
            }
        }
        writeToFile.FileWriter("");
    }
}
