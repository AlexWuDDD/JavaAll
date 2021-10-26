package Collection.com.alex.exe;

import java.util.Objects;

public class MyDate implements Comparable {
    
    private int year;
    private int month;
    private int day;


    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate year(int year) {
        setYear(year);
        return this;
    }

    public MyDate month(int month) {
        setMonth(month);
        return this;
    }

    public MyDate day(int day) {
        setDay(day);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MyDate)) {
            return false;
        }
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "{" +
            " year='" + getYear() + "'" +
            ", month='" + getMonth() + "'" +
            ", day='" + getDay() + "'" +
            "}";
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate myDate = (MyDate) o;
            if(this.year > myDate.year){
                return 1;
            }
            else if(this.year < myDate.year){
                return -1;
            }
            else{
                return 0;
            }
        }
        else{
            throw new IllegalArgumentException("Object is not a MyDate");
        }
    }
}
