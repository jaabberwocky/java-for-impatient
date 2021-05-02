package com.tobias.corejava.exercises.ch03;

/**
 * Implements Ex 1 and Ex 2
 */

public class Ex1andEx2 {
    public static double average(Measurable[] objects) {
        int count = 0;
        double sum = 0;

        for(Measurable item: objects){
            count++;
            sum+=item.getMeasure();
        }
        return sum / count;
    }

    public static Measurable largest(Measurable[] objects) {
        double largestMeasure = Double.NaN; // accounts for all negative values in arr
        Measurable largest = null;

        for (Measurable item: objects) {
            if (Double.isNaN(largestMeasure)){
                largestMeasure = item.getMeasure();
                largest = item;
            }  else if (largestMeasure < item.getMeasure()) {
                largestMeasure = item.getMeasure();
                largest = item;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1450, "John");
        Employee e2 = new Employee(1623, "Mary");
        Employee e3 = new Employee(2995, "Peter");

        Measurable[] arr = new Measurable[] {e1,e2,e3};
        double avg = average(arr);
        System.out.println("Average: "+avg);

        Employee largestSalaryEmployee = (Employee) largest(arr);
        System.out.println(largestSalaryEmployee);

    }
}
