/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpracticeprobs;

/**
 *
 * @author khyle
 */

    import java.util.ArrayList;
import java.util.Scanner;

class Item {

    String name;
    int stock;

    public Item(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Stock: " + stock;
    }
}

public class InventorySystem {

    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory System");
            System.out.println("1. Add a new item");
            System.out.println("2. Update stock");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial stock: ");
                    int stock = scanner.nextInt();
                    inventory.add(new Item(name, stock));
                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    System.out.print("Enter item name to update stock: ");
                    String updateName = scanner.nextLine();
                    boolean found = false;
                    for (Item item : inventory) {
                        if (item.name.equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new stock count: ");
                            item.stock = scanner.nextInt();
                            System.out.println("Stock updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found in inventory.");
                    }
                    break;

                case 3:
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("Inventory:");
                        for (Item item : inventory) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Inventory System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
