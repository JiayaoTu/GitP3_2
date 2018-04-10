package practice06;

public class Teacher extends Person{
    int klass;
    public int getKlass() {return klass;}
    public Teacher(){}
    public Teacher(String name,int age,int klass)
    {
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    public Teacher(String name,int age)
    {
        this.name=name;
        this.age=age;
      //  this.klass=klass;
    }


    String introduce() {
        //String str="My name is "+name+"."+" I am "+age+" years old. I am a Student. I am at Class "+klass+".";

        if(klass==0)
        {
            return this.PersoniItroduce()+" I am a Teacher. I teach No Class.";
        }else {
            String str = this.PersoniItroduce() + " I am a Teacher. I teach Class " + klass + ".";
            return str;
        }
    }
}
