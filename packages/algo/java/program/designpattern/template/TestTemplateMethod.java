package packages.algo.java.program.designpattern.template;

//Purpose: Define the program skeleton of an algorithm in a base class but let subclasses override specific steps.
//
//Use Case: Frameworks, JDBC Template, unit test runners, processing pipelines
// Abstract class with the template method
abstract class DataProcessor {

    // Template method (final to prevent overriding)
    public final void process() {
        readData();
        processData();
        saveData();
    }

    abstract void readData();

    abstract void processData();

    void saveData() {
        System.out.println("Saving data to database...");
    }
}

// Concrete class 1
class CSVDataProcessor extends DataProcessor {

    void readData() {
        System.out.println("Reading data from CSV file...");
    }

    void processData() {
        System.out.println("Processing CSV data...");
    }
}

// Concrete class 2
class XMLDataProcessor extends DataProcessor {

    void readData() {
        System.out.println("Reading data from XML file...");
    }

    void processData() {
        System.out.println("Processing XML data...");
    }
}

public class TestTemplateMethod {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        System.out.println();

        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();
    }
}