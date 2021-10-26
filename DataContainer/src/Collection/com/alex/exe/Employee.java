package Collection.com.alex.exe;

import java.util.Objects;

public class Employee implements Comparable{

    private String name;
    private int age;
    private MyDate birthday;


    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee name(String name) {
        setName(name);
        return this;
    }

    public Employee age(int age) {
        setAge(age);
        return this;
    }

    public Employee birthday(MyDate birthday) {
        setBirthday(birthday);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && age == employee.age && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee employee = (Employee) o;
            return this.name.compareTo(employee.name);
        }
        else{
            throw new IllegalArgumentException("Object is not an Employee");
        }
    }

}
