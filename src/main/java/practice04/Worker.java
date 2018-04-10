package practice04;

public class Worker extends Person{
    public String getName() {return name;}
    public int getAge(){return age;}

    public Worker(){}
    public Worker(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    String introduce()
    {
        String str="My name is "+name+"."+" I am "+age+" years old. I am a Worker. I have a job.";
        return str;
    }
}
