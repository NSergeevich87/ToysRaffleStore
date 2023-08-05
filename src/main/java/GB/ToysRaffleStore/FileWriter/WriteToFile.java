package GB.ToysRaffleStore.FileWriter;

import GB.ToysRaffleStore.Toys.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

public class WriteToFile {
    public WriteToFile(){
    }
    public void FileWriter(String str){
            try(FileWriter writer = new FileWriter("dropToysResults.txt", true))
            {
                writer.write(str);
                writer.append('\n');
                writer.flush();
            } catch (IOException e) {
                System.out.println("Произошла ошибка записи в файл!");
            }
    }
}
