package Cognizant_JavaFSE.week1.Design_Patterns_and_Principles.FactoryMethodPatternExample.src;
public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}