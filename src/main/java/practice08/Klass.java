package practice08;

public class Klass {
    int number;
    Student leader;

    public Klass(){}
    public Klass(int number){this .number=number;}
    public int getNumber(){return number;}
    String getDisplayName(){return "Class 2";}
    Klass getKlass() {return new Klass();}
    void assignLeader(Student student)
    {
        this.leader=student;
    }

    Student getLeader()
    {
        return this.leader;
    }
}
