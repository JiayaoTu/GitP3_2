package practice10;
import java.util.*;
public class Teacher extends Person{
    Klass klass;
    HashSet classes;

    public HashSet getClasses() {
        return classes;
    }
    public void setClasses(HashSet classes) {
        this.classes = classes;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public Klass getKlass() {return klass;}
    public Teacher(){}
    public Teacher(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public Teacher(int id,String name,int age,HashSet classes)
    {
        this.id=id;
        this.name=name;
        this.age=age;
     //   this.klass=klass;
        this.classes=classes;
    }
    public Teacher(int id,String name)
    {
        this.name=name;
        this.age=age;
        //  this.klass=klass;
    }


    String introduce() {
        //String str="My name is "+name+"."+" I am "+age+" years old. I am a Student. I am at Class "+klass+".";
        if (this.getClasses() != null) {
            String klass = "";
            Iterator<Klass> it = this.getClasses().iterator();
            while (it.hasNext()) {
                String str = it.next().getNumber() + "";
                klass += str;
            }
            klass = klass.split("")[0] + ", " + klass.split("")[1];
            return this.PersoniItroduce() + " I am a Teacher. I teach Class " + klass + ".";
        }
        return this.PersoniItroduce() + " I am a Teacher. I teach No Class.";

//        if(klass==null)
//        {
//            return this.PersoniItroduce()+" I am a Teacher. I teach No Class.";
//        }else {
//            String str = this.PersoniItroduce() + " I am a Teacher. I teach Class " + klass.number + ".";
//            return str;
//        }
    }
    String introduceWith(Student student)
    {
        if(isTeaching(student))
        {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }else {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public Boolean isTeaching(Student student) {
        Klass klass = student.getKlass();
        return this.getClasses().contains(klass);
    }

}
