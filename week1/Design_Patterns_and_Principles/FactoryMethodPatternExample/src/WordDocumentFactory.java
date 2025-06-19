package Cognizant_JavaFSE.week1.Design_Patterns_and_Principles.FactoryMethodPatternExample.src;
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
