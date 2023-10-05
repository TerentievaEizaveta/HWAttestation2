import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class AddToys {
    public static ListToys listToys;
    public static ListToys AddToys() {
        ListToys listToys = new ListToys(1);
        File file = new File("src//toys.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] toy = line.split(" ");
                Toy toy1 = new Toy(toy[0], Integer.parseInt(toy[1]), Double.parseDouble(toy[2]));
                listToys.addToy(toy1);
            }
            return listToys;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listToys;
    }

    public static ListToys getListToys() {
        return listToys;
    }
}



