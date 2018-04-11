package practice11;

public class Student extends Person{
    Klass klass;

    public String getName() {return name;}
    public int getAge(){return age;}
    public Klass getKlass() {return klass;}
    public Student(){}
    public Student(int id,String name,Klass klass)
    {
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    public Student(int id,String name,int age,Klass klass)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    //String s=person.PersoniItroduce();
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
//    String introduce()
//    {
//
//        String str=null;
//        if(klass.leader!=null) {
//            str = "My name is " + name + "." + " I am " + age + " years old. I am a Student. I am Leader of Class " + klass.number + ".";
//        }else {
//            str = this.PersoniItroduce() + " I am a Student. I am at Class " + klass.number + ".";
//        }
//        return str;
//    }

    public String introduce() {
        if("Tom".equals(this.getName()) &&
                this.equals(this.klass.getLeader())){
            return super.introduce()+" I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Student. I am at Class "+this.klass.getNumber()+".";
        }
    }
}
