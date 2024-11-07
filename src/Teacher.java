public class Teacher {
    private String name;
    private String surname;
    private TeacherCondition condition;
    private int birth_year;
    private double salary;

    public Teacher(String name, String surname, TeacherCondition condition,int birthYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.condition=condition;
        this.birth_year = birthYear;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Teacher info: \n"+
                "name= " + name + "\n" +
                "surname='" + surname + "\n" +
                "condition=" + condition +
                "\nbirth year=" + birth_year +
                "\nsalary=" + salary;
    }

    void printing(){
        System.out.println("Teacher info: ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Condition: " + condition);
        System.out.println("Birth Year: " + birth_year);
        System.out.println("Salary: " + salary);
        System.out.println("\n");
    }

    public int compareTo(Teacher teacher) {
       return this.surname.compareTo(teacher.surname);
    }

    //getters and setters
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public double getSalary(){return salary;}
    public TeacherCondition getCondition() {return condition;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setCondition(TeacherCondition condition) {this.condition = condition;}






}