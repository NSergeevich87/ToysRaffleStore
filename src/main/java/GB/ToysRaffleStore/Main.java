package GB.ToysRaffleStore;

import GB.ToysRaffleStore.Raffle.ToysComparator;
import GB.ToysRaffleStore.Service.ServiceToys;
import GB.ToysRaffleStore.Toys.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to ToysRaffleStore!");
        System.out.println();

        int trys = 10;

        ServiceToys toys = new ServiceToys();
        toys.create(5968, "Oso", 2);
        toys.create(4622, "Conejo", 2);
        toys.create(7835, "Agila", 6);
        toys.create(7777, "MunecaDeSuerte", 10);

        for (int i = 0; i < trys; i++) {
            toys.getToysWithProbability(toys.getAllToys());
            System.out.println();
        }
        for (Toy q: toys.getAllToys()) {
            System.out.println(q + " из " + trys + " попыток.");
        }
        System.out.println("\nВсе данные записаны в файл!");

        //Сортировка по УБЫВАНИЮ Id
        System.out.println();
        System.out.println("Сортировка по убыванию Id");
        toys.printToys(toys.getSortedByToysId());
    }
}
