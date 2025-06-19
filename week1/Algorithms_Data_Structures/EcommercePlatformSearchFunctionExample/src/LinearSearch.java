package Cognizant_JavaFSE.week1.Algorithms_Data_Structures.EcommercePlatformSearchFunctionExample.src;

public class LinearSearch {
    public static Product search(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }
}

