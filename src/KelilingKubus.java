import java.util.Scanner;

public class KelilingKubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi kubus");
        double sisi = input.nextDouble();

        double keliling = hitungKelilingKubus(sisi);
        System.out.println("Keliling kubus dengan sisi " + sisi + " adalah " + keliling);

        input.close();
        System.out.println();
    }

    /**
     *
     * @param sisi salah satu dari rumus untuk penginputan nilai ruas
     * @return untuk perhitungan keliling kubus tersebut
     */
    public static double hitungKelilingKubus(double sisi){

        return 12 * sisi;
    }

}