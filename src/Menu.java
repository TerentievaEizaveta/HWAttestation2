import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner in = new Scanner(System.in);
        ListToys listToys = AddToys.AddToys();
        List queueToys= ListToys.QueueToys(listToys);
        System.out.println("Меню");
        System.out.println("1-Название игрушек для розыгрыша, 2-Розыгрыш,5-Выход ");

        while(true) {
            System.out.println("Введите число");
            String num = in.nextLine();
            switch (num) {
                case "1":
                    System.out.println(listToys.getToyAllName());// Название игрушек для розыгрыша:
                    break;
                case "2":
                    PrizeDrawing.PrizeDrawing(listToys,queueToys); // Розыгрыш
                    break;
                case "3":
                    System.out.println(queueToys); //очередь выигрышных
                    break;
                case "4":
                    System.out.println(listToys.getToyInfo()); //список игрушек
                    break;
                case "5":
                    System.out.println("выход"); //выход
                    System.exit(0);
            }
        }
    }

}
