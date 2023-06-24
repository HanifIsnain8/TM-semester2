import java.util.ArrayList;

public class Fibonacci {
      public static void main(String[] args) {
            ArrayList<Integer> genap = new ArrayList<>();
            int first = 10;
            int second = 11;

            System.out.println("Deret Fibonacci dari 10 sampai dengan 4500:");
            for (int i = 1; first + second <= 4500; i++) {
                  System.out.print(first+(","));
                  int next = first + second;
                  if(next  % 2==0){
                        genap.add(next);
                  }
                  first = second;
                  second = next;
            }

            int sum = 0;
            for (int i = 0; i < genap.size(); i++) {
                  sum += genap.get(i);
            }

            System.out.println("\n\nada "+genap.size()+" bilangan genap dari bilangan fibonacci diatas");
            System.out.println("yaitu"+genap);
            System.out.println("Hasil penjumlahan bilanan bifonaccci genap :" + sum);
      }
}
