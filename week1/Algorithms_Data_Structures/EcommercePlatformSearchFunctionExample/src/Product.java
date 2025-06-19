package Cognizant_JavaFSE.week1.Algorithms_Data_Structures.EcommercePlatformSearchFunctionExcercise2.src;

public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }
}

