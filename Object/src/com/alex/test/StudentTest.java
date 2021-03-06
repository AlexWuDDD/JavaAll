package com.alex.test;

public class StudentTest {

    public static void main(String[] args) {
        
        Student[] students = new Student[20];
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i+1;
            students[i].state = (int)(Math.random()*(6-1+1)+1); 
            students[i].score = (int)(Math.random()*(100-0+1)+0);
        }

        printStudents(students);

        System.out.println("================================");
        searchState(students, 3);

        System.out.println("================================");
        sort(students);
        printStudents(students);
    }

    //遍历student数组
    public static void printStudents(Student[] students) {
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].info());
        }
    }

    public static void searchState(Student[] students, int state) {
        for(int i = 0; i < students.length; i++) {
            if(students[i].state == state) {
                System.out.println(students[i].info());
            }
        }
    }
    
    public static void sort(Student[] students) {
        for(int i = 0; i < students.length-1; i++) {
            for(int j = 0; j < students.length-1-i; j++) {
                if(students[j].score > students[j+1].score) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}

class Student {

    int number; //学号
    int state;  //年级
    int score;  //成绩

    public String info() {
        return "学号：" + number + " 年级：" + state + " 成绩：" + score;
    }

}