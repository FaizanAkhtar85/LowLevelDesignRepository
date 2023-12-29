package DesignPatterns.compositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory intermediateSyllabus = new Directory("Intermediate Syllabus");
        FileSystem sports= new File("Sports");
        intermediateSyllabus.add(sports);
        Directory mathematics = new Directory("Mathematics");
        FileSystem trigonometry = new File("Trigonometry");
        FileSystem algebra = new File("Algebra");
        FileSystem calculas = new File("Calculas");
        mathematics.add(trigonometry);mathematics.add(algebra);mathematics.add(calculas);
        intermediateSyllabus.add(mathematics);
        Directory chemistry = new Directory("Chemistry");
        FileSystem inorganic = new File("Inorganic");
        FileSystem organic = new File("Organic");
        FileSystem physicalChemistry = new File("PhysicalChemistry");
        chemistry.add(inorganic);chemistry.add(organic);chemistry.add(physicalChemistry);
        intermediateSyllabus.add(chemistry);

        intermediateSyllabus.ls();
    }
}
