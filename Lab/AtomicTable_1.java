package week2.Lab;

import java.util.Scanner;

public class AtomicTable_1 {

    int atomicNumber;
    String name;
    String chemicalName;
    String classofElement;
    double atomicWeight;

    public AtomicTable_1(int atomicNumber, String name, String chemicalName, String classofElement, double atomicWeight) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.chemicalName = chemicalName;
        this.classofElement = classofElement;
        this.atomicWeight = atomicWeight;
    }

    public void printInfo() {
        System.out.println("Element details is : ");
        System.out.println("Atomic no: " + atomicNumber);
        System.out.println("Name : " + name);
        System.out.println("Element name " + chemicalName);
        System.out.println("Class of Element " + classofElement);
        System.out.println("Atomic Weight " + atomicWeight);
    }

    public void printInfoacctoAtomicNo() {
        if (atomicNumber >= 15) {
            System.out.println("Element details is : ");
            System.out.println("Atomic no: " + atomicNumber);
            System.out.println("Name : " + name);
            System.out.println("Element name " + chemicalName);
            System.out.println("Class of Element " + classofElement);
            System.out.println("Atomic Weight " + atomicWeight);
        }
    }
}
class Test {
    public static void main(String[] args) {


        AtomicTable_1 Na = new AtomicTable_1(11, "Sodium", "Na", "alkali metal", 22.9898);
        Na.printInfo();


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int atomicNumber = Integer.parseInt(sc.nextLine());

            String name = sc.nextLine();
            String chemicalName = sc.nextLine();
            String classofElement = sc.nextLine();
            double atomicWeight = Double.parseDouble(sc.nextLine());

            AtomicTable_1 K = new AtomicTable_1(atomicNumber, name, chemicalName, classofElement, atomicWeight);
            K.printInfo();
            K.printInfoacctoAtomicNo();


        }
    }
}
