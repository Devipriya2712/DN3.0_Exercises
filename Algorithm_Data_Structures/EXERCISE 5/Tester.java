package Datastructure;
import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        // Create a list of orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Alice", 250.75));
        orders.add(new Order(2, "Bob", 150.50));
        orders.add(new Order(3, "Charlie", 300.00));
        

        // Display unsorted orders
        System.out.println("Unsorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        List<Order> bubbleSortedOrders = new ArrayList<>(orders);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("\nBubble Sorted Orders:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort
        List<Order> quickSortedOrders = new ArrayList<>(orders);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.size() - 1);
        System.out.println("\nQuick Sorted Orders:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}

