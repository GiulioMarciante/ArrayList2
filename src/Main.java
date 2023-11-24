import java.util.*;

//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Filippo",25);
        Student student2 = new Student("Doriana",32);
        Student student3 = new Student("Paola",20);
        Student student4 = new Student("Luigi",30);
        Student student5 = new Student("Gianluca",28);
        Student student6 = new Student("Barbara",29);
        Student student7 = new Student("Anna",24);
        Student student8 = new Student("Nicola",30);
        Student student9 = new Student("Enrico",21);
        Student student10 = new Student("Raffaele",23);
        Student student11 = new Student("Carmela",20);
        Student student12 = new Student("Erik",22);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12));

        System.out.println("\nArray non ordinato\n");

        for (Student i : students) {
            System.out.println(i);
        }

        System.out.println("\nArray ordinato\n");

        students.sort(Comparator.comparing(Student::getName));
        for (Student i : students) {
            System.out.println(i);
        }
    }
}