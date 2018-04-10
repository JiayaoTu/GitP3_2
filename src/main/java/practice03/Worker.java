package practice03;

public class Worker {

    String name;
    int age;
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
        String str="I am a Worker. I have a job.";
        return str;
    }
}
