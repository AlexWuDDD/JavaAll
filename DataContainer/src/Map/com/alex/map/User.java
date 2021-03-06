package Map.com.alex.map;

import java.util.Objects;

public class User implements Comparable {
    
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    public User name(String name) {
        setName(name);
        return this;
    }

    public User age(int age) {
        setAge(age);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User) o;
            int compare = this.getName().compareTo(user.getName());
            if(compare !=0){
                return compare;
            }
            else{
                return Integer.compare(this.getAge(), user.getAge());
            }
        }
        else{
            throw new IllegalArgumentException("Object is not a User");
        }
    }

}
