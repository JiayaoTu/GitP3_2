package practice09;

public class Person {
    int id;
    String name;
    int age;
    public Person(){}

    public Person(int id, String name)
    {
        this.name=name;
        this.id=id;
    }
    public Person(int id, String name,int age)
    {

        this.id=id;
        this.name=name;
        this.age=age;

    }

    public String  getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){return age;}
    public void setAge(int age) {
        this.age = age;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
}
