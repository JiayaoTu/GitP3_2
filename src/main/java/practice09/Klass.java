package practice09;

public class Klass {
    int number;
    Student leader;

    public Klass(){}
    public Klass(int number){this .number=number;}
    public int getNumber(){return number;}
    String getDisplayName(){return "Class 2";}
    Klass getKlass() {return new Klass();}
    Klass setKlass() {return new Klass();}

    Student getLeader()
    {
        return this.leader;
    }
    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() == this.number) {
            this.leader = student;
        }
        System.out.print("It is not one of us.\n");
    }


    public void appendMember(Student student) {
        student.setKlass(this);

    }
}
