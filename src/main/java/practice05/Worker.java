package practice05;

public class Worker extends Person{
    Person person;
    public String getName() {return name;}
    public int getAge(){return age;}

    public Worker(){}
    public Worker(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    //String ss=person.PersoniItroduce();
   // System.out.println(ss);
    String introduce()
    {
       // String str="My name is "+name+"."+" I am "+age+" years old. I am a Worker. I have a job.";
        String str=this.PersoniItroduce()+" I am a Worker. I have a job.";
        return str;
    }
}
