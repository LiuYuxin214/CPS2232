package Chapter3.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

class ListOfFruit {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Double> price = new ArrayList<>();

    ListOfFruit() {
    }

    public void addFruit(String name, double price) {
        this.name.add(name);
        this.price.add(price);
    }

    public double getPrice(String name) {
        return price.get(this.name.indexOf(name));
    }
}

class Order {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> num = new ArrayList<>();
    Double total = 0.0;

    Order() {
    }

    public void addFruit(String name, int num) {
        this.name.add(name);
        this.num.add(num);
    }

    public double calculateTotal(ListOfFruit list) {
        for (int i = 0; i < name.size(); i++) {
            total += num.get(i) * list.getPrice(name.get(i));
        }
        return total;
    }

}

public class FruitOrderProcessingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListOfFruit list = new ListOfFruit();
        while (true) {
            String name = input.next();
            if (name.equals("END_PRICES")) {
                break;
            }
            double price = input.nextDouble();
            list.addFruit(name, price);
        }
        boolean isEnd = false;
        ArrayList<Double> total = new ArrayList<>();
        while (true) {
            Order order = new Order();
            while (true) {
                String name = input.next();
                if (name.equals("QUIT")) {
                    isEnd = true;
                    break;
                }
                if (name.equals("END_INVOICE")) {
                    break;
                }
                int num = input.nextInt();
                order.addFruit(name, num);
            }
            if (isEnd) {
                break;
            }
            total.add(order.calculateTotal(list));
        }
        for (int i = 0; i < total.size(); i++) {
            System.out.printf("Total: %.2f\n", total.get(i));
        }
    }
}
