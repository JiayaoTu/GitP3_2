package practice07;

public class Klass {
    int number;
    public Klass(){}
    public Klass(int number){this .number=number;}
    public int getNumber(){return number;}
    String getDisplayName(){return "Class 2";}
    Klass getKlass() {return new Klass();}

}
