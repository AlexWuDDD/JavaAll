package Collection.com.alex.collection;

import java.util.Objects;

public class Person implements Comparable {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("call person equals");
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && age == person.age;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person) o;
            int compare = this.name.compareTo(person.name);
            if(compare != 0){
                return compare;
            }
            else{
                return Integer.compare(this.age, person.age);
            }
        }
        else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }


}
