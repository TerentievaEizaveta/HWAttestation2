import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PrizeDrawing {

    public static String RandomToy(ListToys listToys) {
        List  list=new ArrayList<>();
        Iterator<Toy> iterator = listToys.iterator();;
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            String name = toy.getName();
            list.add(name);
        }
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        String randomToy= (String) list.get(randomIndex);
        return randomToy;
    }

    public static void PrizeDrawing(ListToys listToys,List queueToys) {
        //System.out.println(queueToys);
        String randomToy = RandomToy(listToys);
        try {
            if (randomToy != queueToys.get(0)) {
                System.out.println("Повторите попытку");
            } else {
                System.out.println("Ура! Ты выиграл " + queueToys.get(0));
                queueToys.remove(0);
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Попытки кончились");
        }
        }
    }

