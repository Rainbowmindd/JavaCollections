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

        ClassContainer classContainer = new ClassContainer();

        //5a add class
        classContainer.addClass("IT",2);
        classContainer.addClass("History",3);
        classContainer.addClass("Polish",1);
        classContainer.addClass("Biology",2);

        Teacher teacher1 = new Teacher("Martyna", "Kindrat", TeacherCondition.present, 2003, 5500.0);
        Teacher teacher2 = new Teacher("Anna", "Kowalska", TeacherCondition.sick, 1999, 3500.0);
        Teacher teacher3 = new Teacher("Jakub", "Nowakowski", TeacherCondition.delegation, 2001, 4000.0);
        Teacher teacher4 = new Teacher("Piotr", "Wisniewski", TeacherCondition.notPresent, 1989, 2500.0);
        Teacher teacher5=  new Teacher("Malwina","Kozak",TeacherCondition.present,2000,7000.0);

        // 4a adding teachers to a group
        ClassTeacher historyGroup=classContainer.teacherGroups.get("History");
        historyGroup.addTeacher(teacher1);
        historyGroup.addTeacher(teacher4);
        historyGroup.addTeacher(teacher5);


        // 4a adding teacher that already exists in this group
//        historyGroup.addTeacher(teacher1);

        // 4a adding to different group
        ClassTeacher itGroup=classContainer.teacherGroups.get("IT");
        ClassTeacher biologyGroup=classContainer.teacherGroups.get("Biology");
        ClassTeacher polishGroup=classContainer.teacherGroups.get("Polish");
        polishGroup.addTeacher(teacher2);

        // 4h printing summary
//        System.out.println("\n Summary of teacher groups: ");
//        classContainer.summary();

        // 4b add salary
//        System.out.println("\nAdding bonus to teacher1");
//        historyGroup.addSalary(teacher1,500.0);

        //4c removeTeacher
//        polishGroup.removeTeacher(teacher2);
//        System.out.println("\n Summary of teacher groups: ");
//        classContainer.summary();

        //4d change condition
//        historyGroup.changeCondition(teacher3,TeacherCondition.sick);
//        System.out.print("\n New teacher condition: ");
//        teacher3.printing();

        //4e search
//        Teacher searchTeacher=historyGroup.search("Kindrat");
//        if(searchTeacher!=null){
//            System.out.println("\nTeacher found succesfully!");
//            searchTeacher.printing();
//        }

        //4f search partial
        List<Teacher> partialSearchResult= historyGroup.searchPartial("at");
        System.out.println("\nPartial search result: ");
        partialSearchResult.forEach(System.out::println);

        //4g countByCondition

//        System.out.println("\nPresent teachers:  " + historyGroup.countByCondition(TeacherCondition.present));
//        System.out.println("On delegation:  " + historyGroup.countByCondition(TeacherCondition.delegation));
//        System.out.println("Sick teachers:  " + historyGroup.countByCondition(TeacherCondition.sick));
//        System.out.println("Not present:  " + historyGroup.countByCondition(TeacherCondition.notPresent));

        //4h summary
//        System.out.println("\n Summary of teacher groups: ");
//        System.out.println("\nHistory group");
//        historyGroup.summary();
//        System.out.println("\nPolish group");
//        polishGroup.summary();
//        System.out.println("IT group");
//        itGroup.summary();
//        System.out.println("Biology group");
//        biologyGroup.summary();



        //4i sort by name
        System.out.println("\nSorted by name: ");
        historyGroup.sortByName().forEach(Teacher::printing);

        //4j sort by salary
//        System.out.println("\nSorted by salary: ");
//        historyGroup.sortBySalary().forEach(Teacher::printing);

        //4k max()
//        System.out.println("\nTeacher with max salary: ");
//        Teacher maxSalary= historyGroup.max();
//        maxSalary.printing();

        //5b remove class
        //classContainer.removeClass("IT");

        //5c find empty
        System.out.println("Empty groups: ");
        List<String> emptyGroups=classContainer.findEmpty();
        System.out.println(emptyGroups);

        //5d summary
       classContainer.summary();









    }
}