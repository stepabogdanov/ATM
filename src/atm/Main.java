package atm;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        PackOfMoney myPack = new PackOfMoney();
        myPack.setNote50(10);
        myPack.setNote100(10);
        myPack.setNote200(10);
//        myPack.setNote100(10);
//        myPack.setNote200(10);
        myPack.setNote500(10);
        myPack.setNote1000(10);
        myPack.setNote2000(10);
        myPack.setNote5000(10);
        atm.putMoneyToCashbox(myPack);
        System.out.println("money in atm: " + atm.getSum());
        System.out.println(atm.getMoneyMin(2700));
        System.out.println("money in atm: " + atm.getSum());

    }
}
