import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//tu moga sie przydac rzeczy do javy jx, funkcjonalnosci podobne
//jak w zadaniu 2
//dodawanie/odejmowanie rzeczy w tabelce, filtrowanie
//soltrowanie, dodawanie klasy przypisywac do niej
//w formie interakcyjnej

//w mainie zamiescic wywolania wszystkich metod
//ktore sa do zaimplementownia !!!
//odkomentowywanie kazdej funkcji podczas odpowiedzi



//capacity -> int albo long a nie double
public class Main {
    public static void main(String[] args) {
        ClassTeacher classTeacher=new ClassTeacher("Grupa 1",4);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher ("M","Jakub", "Pachut"));
        teachers.add(new Teacher ("K","Martyna", "Kindrat"));
        teachers.add(new Teacher ("K","Martyna", "Kindrat"));
        teachers.add(new Teacher ("K","Aneta", "Kaczmarczyk"));
        teachers.add(new Teacher ("K","Anna", "Jasielec"));
        teachers.add(new Teacher ("K","Anna", "Hellmann"));


        System.out.println("Nieposortowane: ");
        for(Teacher teacher: teachers) {
            System.out.println(teacher);
        }


    }
}