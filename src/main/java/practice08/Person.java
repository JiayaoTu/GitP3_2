package practice08;

public class Person {
    int name;
    String age;
    int id;
    public Person(){}

    public Person(int name, String age)
    {
        this.name=name;
        this.age=age;
    }
    public Person(int name, String age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public String  getName() {return age;}
    public int getAge(){return id;}

    String introduce()
    {
        String str="My name is "+age+". "+"I am "+id+" years old.";
        return str;
    }

    String PersoniItroduce()
    {
        String str="My name is "+age+". "+"I am "+id+" years old.";
        return str;
    }
}
