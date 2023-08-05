package GB.ToysRaffleStore.View;

import GB.ToysRaffleStore.Toys.Toy;

import java.util.List;

public class ViewToConsole {
    public void ArrayPrint(List<Toy> toys){
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).getToyId());
        }
    }
}
