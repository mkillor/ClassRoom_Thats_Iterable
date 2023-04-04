import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ClassRoom implements Iterable<Student> {
    private ArrayList<Student> myList = new ArrayList<>();

    public ClassRoom() {
    }

    public void addStudent(Student a){
        myList.add(a);
    }


    @Override
    public String toString() {
        return "ClassRoom{" +
                "myList=" + myList +
                '}';
    }


    @Override
    public Iterator<Student> iterator() {
        return myList.iterator();
    }




}
