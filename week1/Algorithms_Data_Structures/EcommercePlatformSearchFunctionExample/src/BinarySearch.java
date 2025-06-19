package Cognizant_JavaFSE.week1.Algorithms_Data_Structures.EcommercePlatformSearchFunctionExcercise2.src;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product search(Product[] products, String targetName) {
        // Sort array by product name
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }
}

