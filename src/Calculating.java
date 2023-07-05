public class Calculating {
    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void addAllNumber() {
        int tambah = number1 + number2;
        System.out.println("Hasil penjumlahan: " + tambah);
    }

    public void multiplyNumber(int nmbr1, int nmbr2) {
        int kali = nmbr1 * nmbr2;
        System.out.println("Hasil perkalian: " + kali);
    }

    public static void main(String[] args) {
        Calculating z = new Calculating();
        z.setNumber1(6);
        z.setNumber2(90);
        z.addAllNumber();
        z.multiplyNumber(z.getNumber1(), z.getNumber2());
    }
}
