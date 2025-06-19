package Cognizant_JavaFSE.week1.Algorithms_Data_Structures.EcommercePlatformSearchFunctionExcercise2.src;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "T-shirt", "Apparel")
        };

        System.out.println("Enter target item \n1.Laptop 2.Shoes 3.Watch 4.Phone 5.T-shirt\nEnter the number:");
        int n = sc.nextInt();
        String ch="";

        switch (n) {
            case 1:
                ch="Laptop";
                break;
            case 2:
                ch="Shoes";
                break;
            case 3:
                ch="Watch";
                break;
            case 4:
                ch="Phone";
                break;
            case 5:
                ch="T-shirt";
                break;
        
            default:
            System.out.println("Invalid number");
                break;
        }

        System.out.println("Linear Search:");
       
        Product result1 = LinearSearch.search(products, ch);
        System.out.println(result1 != null ? result1 : "Product not found\n");

        System.out.println("Binary Search:");
        Product result2 = BinarySearch.search(products, ch);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

