package practice05;

public class Person {
    String name;
    int age;
    public Person(){}

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {return name;}
    public int getAge(){return age;}

    String introduce()
    {
        String str="My name is "+name+". "+"I am "+age+" years old.";
        return str;
    }

    String PersoniItroduce()
    {
        String str="My name is "+name+". "+"I am "+age+" years old.";
        return str;
    }
}
