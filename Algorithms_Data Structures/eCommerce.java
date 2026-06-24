import java.util.*;

class Product {
    int id;
    String name;
    String type;

    Product(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Category     : " + type);
    }
}

public class eCommerce {

    static Product linearSearch(Product[] items, int searchKey) {
        for (Product p : items) {
            if (p.id == searchKey) {
                return p;
            }
        }
        return null;
    }

    static Product binarySearch(Product[] items, int searchKey) {
        int left = 0;
        int right = items.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (items[mid].id == searchKey) {
                return items[mid];
            }

            if (items[mid].id < searchKey) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("E-Commerce Product Search");
        System.out.print("Enter number of products: ");
        int count = input.nextInt();
        input.nextLine();

        Product[] items = new Product[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nProduct " + (i + 1));

            System.out.print("Enter Product ID: ");
            int pid = input.nextInt();
            input.nextLine();

            System.out.print("Enter Product Name: ");
            String pname = input.nextLine();

            System.out.print("Enter Category: ");
            String ptype = input.nextLine();

            items[i] = new Product(pid, pname, ptype);
        }

        System.out.print("\nEnter Product ID to Search: ");
        int searchKey = input.nextInt();

        Product result1 = linearSearch(items, searchKey);

        System.out.println("\nLinear Search Result");
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }

        Product[] sortedItems = Arrays.copyOf(items, items.length);
        Arrays.sort(sortedItems, Comparator.comparingInt(p -> p.id));

        Product result2 = binarySearch(sortedItems, searchKey);

        System.out.println("\nBinary Search Result");
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }

        input.close();
    }
}