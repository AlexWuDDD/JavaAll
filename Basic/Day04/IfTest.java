/*
岳小鹏参加java考试，他和父亲岳不群达成承诺
如果：
成绩为100分时，奖励一辆BMW
成绩为（80，99]时，奖励一台iphone xs max
当成绩为【60，80】时，奖励一个iPad
其他时，什么奖励也没有
请从键盘输入岳小鹏的期末成绩，并加以判断

*/
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入岳小鹏的成绩：");
        int score = scan.nextInt();
        if(score == 100){
            System.out.println("岳小鹏获得了一辆BMW");
        }
        else if(score > 80 && score <= 99){
            System.out.println("岳小鹏获得了一台iphone xs max");
        }
        else if(score >= 60 && score <= 80){
            System.out.println("岳小鹏获得了一个iPad");
        }
        else{
            System.out.println("岳小鹏没有获得任何奖励");
        }

        boolean b = true;
        System.out.println(b=false);

        scan.close();
    }
}
