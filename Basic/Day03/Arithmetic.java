public class Arithmetic{
    public static void getEachPositionOfANumber(int number){
        while(number != 0){
            System.out.println(number % 10);
            number = number / 10;
        }
    }
    public static void main(String[] args){
        byte b1 = 127;
        ++b1;
        System.out.println(b1); //-128

        getEachPositionOfANumber(102);
        getEachPositionOfANumber(10223);

        
    }
}