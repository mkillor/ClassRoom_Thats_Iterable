import java.util.ArrayList;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        Student myStudent1 = new Student("Bob",123123);
        Student myStudent2 = new Student("Sally",567);
        Student myStudent3 = new Student("Tim",0234);
        Student myStudent4 = new Student("Mason",785);
        Student myStudent5 = new Student("Mya",654);
        Student myStudent6 = new Student("Gabe",989);

        ArrayList<Student> alc = new ArrayList<>();
        alc.add(myStudent1);
        alc.add(myStudent2);
        alc.add(myStudent3);
        alc.add(myStudent4);
        alc.add(myStudent5);
        alc.add(myStudent6);

        
        Spliterator<Student> firstHalf = alc.spliterator();
        Spliterator<Student> secondHalf = firstHalf.trySplit();
        secondHalf.forEachRemaining(System.out::println);
        System.out.println("---");
        firstHalf.forEachRemaining(System.out::println);

    }
}