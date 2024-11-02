import java.util.ArrayList;
import java.util.List;

//metoda max moze zwrocic nam najwyjzsze wynagrodzenie
public class ClassTeacher{
    private String teacherGroupName;
    //lista nauczycieli
    private List<Teacher> teachers;
    private int maxTeacherNumber;

    ClassTeacher(String teacherGroupName, int maxTeacherNumber){
        this.teacherGroupName = teacherGroupName;
        this.maxTeacherNumber = maxTeacherNumber;
        this.teachers = new ArrayList<>();
    }
    public String getTeacherGroupName(){return teacherGroupName;}
    public int getMaxTeacherNumber(){return maxTeacherNumber;}



    public void addTeacher(Teacher teacher){

        if(teachers.size()>=maxTeacherNumber){
            System.out.print("Przekroczona pojemnosc grupy.");
        }

        if(teachers.contains(teacher)){
            System.out.println("Ten nauczyciel należy juz do grupy");
        }
        else{
            teachers.add(teacher);
            System.out.println("Nauczyciel "+teacher.getName() + " " + teacher.getSurname()+" dodany do grupy");
        }


    }

    public void addSalary(Teacher teacher, double salary){

        if(!teachers.contains(teacher)){
            double teachersSalary= teacher.getSalary();
            double bonus=1000;

            teachersSalary+=bonus;

            System.out.println("PREMIA!!! Dodano 1000pln do wynagrodzenia, obecne wynagrodzenie: ");
            System.out.println(teachersSalary);
        }

    }
}