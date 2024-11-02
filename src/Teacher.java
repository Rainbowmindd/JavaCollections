import java.util.Objects;

public class Teacher implements Comparable<Teacher>{
    private String name;
    private String surname;

    private String plec;
    private int birth_year;
    private double salary;

    public Teacher(String name, String surname, int birthYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.birth_year = birthYear;
        this.salary = salary;
    }
    public Teacher(String plec, String name,String surname){
        this.name = name;
        this.surname = surname;
        this.plec=plec;

    }
    public int compareTo(Teacher teacher) {
        if (this.surname.compareTo(teacher.surname)!=0){
            return this.surname.compareTo((teacher.surname));
        }
        else {
            return this.name.compareTo(teacher.name);
        }
    }
    public String getName() {return name;}
    public String getSurname() {return surname;}

    public double getSalary(){return salary;}

    //zamisat tego trzeba uzyc comparatora

//    @Override
//    public boolean equals(Object obj) {
//        if (this==obj) return true;
//        if(obj==null || getClass() != obj.getClass()) return false;
//        Teacher teacher = (Teacher) obj;
//        return name.equals(teacher.name) && surname.equals(teacher.surname);
//    }
//    public int hashCode(){
//        return Objects.hash(name,surname);
//    }


//    public double getSalary() {return salary;}
//    public int getBirth_year() {return birth_year;}

    void printing(){
        System.out.println("Teacher info: \n");
        System.out.println("Name: " + name);
        System.out.println("\nSurname: " + surname);
        System.out.println("\nBirth Year: " + birth_year);
        System.out.println("\nSalary: " + salary);
    }



}