import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class ListToys  {
    private int id;
    private static int toyId;
    private static List<Toy> toyList;
    private static Toy toy;
    public static List queueToys;

    public ListToys(int id) {
        this.id = id;
        toyList = new ArrayList<>();
    }

    public static void addToy(Toy toy) {
        toy.setId(toyId++);
        toyList.add(toy);
    }

    public String getToyInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список игрушек:\n");
        for (Toy toy : toyList) {
            stringBuilder.append(toy);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


    public Iterator<Toy> iterator() {
        return new IteratorToys(toyList);
    }



    public static List QueueToys(ListToys listToys) {
        List  queueToys=new ArrayList<>();
        Iterator<Toy> iterator = listToys.iterator();;
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            int n = toy.getQuantity();
            for (int i = 0; i < n; i++) {
                queueToys.add(toy.getName());
            }
        }
        Collections.addAll(queueToys);
        Collections.shuffle(queueToys);
        return queueToys;
    }
    public String getToyAllName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Название игрушек для розыгрыша:\n");
        for (Toy toy : toyList) {
            stringBuilder.append(toy.getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public static List toyAllName(ListToys listToys) {
        List  list=new ArrayList<>();
        Iterator<Toy> iterator = listToys.iterator();;
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            String name = toy.getName();
            list.add(name);
        }
        return list;
    }


}






