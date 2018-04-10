package practice08;

public class Student extends Person{
    Klass klass;

    public String getName() {return age;}
    public int getAge(){return id;}
    public Klass getKlass() {return klass;}
    public Student(){}
    public Student(int name,String age,Klass klass)
    {
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    public Student(int name,String age,int id,Klass klass)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.klass=klass;
    }
    //String s=person.PersoniItroduce();

    String introduce()
    {
        //String str="My name is "+name+"."+" I am "+age+" years old. I am a Student. I am at Class "+klass+".";

        String str=this.PersoniItroduce()+" I am a Student. I am Leader of Class "+klass.number+".";
        return str;
    }
}
