package atm;

public class PackOfMoney {
    private int note50;
    private int note100;
    private int note200;
    private int note500;
    private int note1000;
    private int note2000;
    private int note5000;

    public void setNote50(int note50) {
        this.note50 = note50;
    }

    public void setNote100(int note100) {
        this.note100 = note100;
    }

    public void setNote200(int note200) {
        this.note200 = note200;
    }

    public void setNote500(int note500) {
        this.note500 = note500;
    }

    public void setNote1000(int note1000) {
        this.note1000 = note1000;
    }

    public void setNote2000(int note2000) {
        this.note2000 = note2000;
    }

    public void setNote5000(int note5000) {
        this.note5000 = note5000;
    }

    public int getNote50() {
        return note50;
    }

    public int getNote100() {
        return note100;
    }

    public int getNote200() {
        return note200;
    }

    public int getNote500() {
        return note500;
    }

    public int getNote1000() {
        return note1000;
    }

    public int getNote2000() {
        return note2000;
    }

    public int getNote5000() {
        return note5000;
    }
    @Override
    public String toString() {
        return  "note50: " + note50 + "\n" +
                "note100: " + note100 + "\n" +
                "note200: " + note200 + "\n" +
                "note500: " + note500 + "\n" +
                "note1000: " + note1000 + "\n" +
                "note2000: " + note2000 + "\n" +
                "note5000: " + note5000;
    }
}
