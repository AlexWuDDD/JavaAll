

public class FamilyAccount {
    public static void main(String[] args) {
        
        boolean isFlag = true;
        //用于记录用户的收入的支出详情
        String details = "收支\t账户金额\t收支金额\t说明\n";
        //初始金额
        int balance = 10000;
        
        while(isFlag){
            System.out.println("===============家庭收支记账软件===============");
            System.out.println("                1. 收支细节");
            System.out.println("                2. 登记收入");
            System.out.println("                3. 登记支出");
            System.out.println("                4. 退出");
            System.out.println("");
            System.out.print("                请选择(1-4)：");

            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    // System.out.println("1.收支明细");
                    System.out.println("==============当前收支明细记录==============");
                    System.out.println(details);
                    System.out.println("============================================");
                    System.out.println("");
                    break;
                case '2':{
                    // System.out.println("2.登记收入");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String detail = Utility.readString();
                    details += "收入\t" + (balance+money) + "\t\t" + money + "\t\t" + detail + "\n";
                    System.out.println("=============登记完成!==============\n");
                    break;
                }
                case '3':{
                    // System.out.println("3.登记支出");
                    System.out.print("本次支出金额：");
                    int money = Utility.readNumber();
                    if(balance < money){
                        System.out.println("支出超出账户额度,支付失败!!!\n");
                    }
                    else{
                        System.out.print("本次支出说明：");
                        String detail = Utility.readString();
                        details += "支出\t" + (balance-money) + "\t\t" + money + "\t\t" + detail + "\n";
                        System.out.println("=============登记完成!==============\n");
                    }
                    break;
                }
                case '4':
                    System.out.print("是否确认退(Y/N)： ");
                    char choice = Utility.readConfirmSelection();
                    if(choice == 'Y'){
                        isFlag = false;
                    }
                    break;  
                default:
                    break;
            }
        }
    }
}
