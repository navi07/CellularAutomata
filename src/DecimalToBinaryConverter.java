class DecimalToBinaryConverter {

    private int[] binaryArray = new int[8];

    DecimalToBinaryConverter(int value) {
        int[] tempArray = new int[32];
        int k = 7;
        int z = 0;
        for (byte wrt = Integer.SIZE - 1; wrt >= 0; --wrt)
            tempArray[z++] = Integer.parseInt(String.valueOf(Character.forDigit((value >>> wrt) & 1, 2)));
        int dlugoscTabTemp = tempArray.length;

        for (int i = 0; i < 8; i++) {
            binaryArray[k--] = tempArray[--dlugoscTabTemp];
        }

        System.out.print("Wartosc binarna = ");
        for (int aBinaryArray : binaryArray) {
            System.out.print(aBinaryArray);
        }

    }

    int[] getBinaryArray() {
        return binaryArray;
    }
}
