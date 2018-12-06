import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Podaj liczbe : ");
        Scanner scanner = new Scanner(System.in);

        Integer value = scanner.nextInt();
        DecimalToBinaryConverter decimalToBinaryConverter = new DecimalToBinaryConverter(value);

        System.out.println();
        new CellularAutomat(decimalToBinaryConverter.getBinaryArray());
    }
}
