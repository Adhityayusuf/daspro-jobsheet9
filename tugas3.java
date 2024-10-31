import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String nmMakan;
        boolean ada = false;
        System.out.print("Input nama makanan : ");
        nmMakan = sc.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nmMakan)) {
                ada = true;
            }
        }
        if (ada) {
            System.out.println("Makanan tersedia !!!");
        } else {
            System.out.println("Makanan tidak tersedia !!!");
        }
    }
}