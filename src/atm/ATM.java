package atm;

public class ATM implements AlterCashbox{
    private Cashbox cashbox = new Cashbox();


    @Override
    public void putMoneyToCashbox(PackOfMoney pack) {
        cashbox.addPack(pack);
    }

    @Override
    public PackOfMoney getMoneyMin(int sum) {
        PackOfMoney pack = new PackOfMoney();
        if (cashbox.getSum() >= sum) {

            pack.setNote5000(sum / 5000);
            sum -= 5000 * (sum / 5000);
                pack.setNote2000(sum / 2000);
                sum -= 2000 * (sum / 2000);
                pack.setNote1000(sum / 1000);
                sum -= 1000 * (sum / 1000);
                pack.setNote500(sum / 500);
                sum -= 500 * (sum / 500);
                pack.setNote200(sum / 200);
                sum -= 200 * (sum / 200);
                pack.setNote100(sum / 100);
                sum -= 100 * (sum / 100);
                pack.setNote50(sum / 50);
                sum -= 50 * (sum / 50);
                cashbox.removePack(pack);
        }

        else  {
            System.out.println("Not enough money!");
        }
        return pack;
    }
    public int getSum() {
        return cashbox.getSum();
    }

    private int removeQuantity (PackOfMoney oneNote, int noteQuantty) {
        //if (cashbox.getNote50()
        return 0;
    }
}
