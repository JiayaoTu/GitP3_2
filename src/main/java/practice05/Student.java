package practice05;

public class Student extends Person{
    Person person;
    int klass;
    public int getKlass() {return klass;}
    public Student(){}
    public Student(String name,int age,int klass)
    {
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    //String s=person.PersoniItroduce();

    String introduce()
    {
        //String str="My name is "+name+"."+" I am "+age+" years old. I am a Student. I am at Class "+klass+".";

        String str=this.PersoniItroduce()+" I am a Student. I am at Class "+klass+".";
        return str;
    }
}
