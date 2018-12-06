class CellularAutomat {

    CellularAutomat(int binaryArray[]) {
        int[][] automatArray = new int[16][31];

        for (int j = 0; j < 16; j++) {
            for (int i = 0; i < 31; i++) {
                automatArray[j][i] = 0;
                if (j == 0 && i == 15) {
                    automatArray[j][i] = 1;
                }
            }
        }

        int neighbor1 = 0;
        int neighbor2 = 0;

        for (int x : binaryArray) {
            System.out.println(x);
        }

        /** PRZEJSCIE PO TABLICY I AUTOMAT Z REGULAMI */
        for (int j = 1; j < 16; j++) {
            for (int i = 0; i < 31; i++) {
                /** Wyznaczenie sasiadow na brzegach */
                if ((i == 0) || i == 30) {
                    if (i == 0) {
                        neighbor1 = automatArray[j - 1][30];
                    }
                    if (i == 30) {
                        neighbor2 = automatArray[j - 1][0];
                    }
                }
                if (i != 0 && i != 30) {
                    neighbor1 = automatArray[j - 1][i - 1];
                    neighbor2 = automatArray[j - 1][i + 1];
                }

                /** Ustalenie regul */
                if (neighbor1 == 1 && automatArray[j - 1][i] == 1 && neighbor2 == 1) {
                    automatArray[j][i] = binaryArray[0];
                }

                if (neighbor1 == 1 && automatArray[j - 1][i] == 1 && neighbor2 == 0) {
                    automatArray[j][i] = binaryArray[1];
                }

                if (neighbor1 == 1 && automatArray[j - 1][i] == 0 && neighbor2 == 1) {
                    automatArray[j][i] = binaryArray[2];
                }

                if (neighbor1 == 1 && automatArray[j - 1][i] == 0 && neighbor2 == 0) {
                    automatArray[j][i] = binaryArray[3];
                }

                if (neighbor1 == 0 && automatArray[j - 1][i] == 1 && neighbor2 == 1) {
                    automatArray[j][i] = binaryArray[4];
                }

                if (neighbor1 == 0 && automatArray[j - 1][i] == 1 && neighbor2 == 0) {
                    automatArray[j][i] = binaryArray[5];
                }

                if (neighbor1 == 0 && automatArray[j - 1][i] == 0 && neighbor2 == 1) {
                    automatArray[j][i] = binaryArray[6];
                }

                if (neighbor1 == 0 && automatArray[j - 1][i] == 0 && neighbor2 == 0) {
                    automatArray[j][i] = binaryArray[7];
                }
            }
        }

        /** Wypisanie tablicy */
        for (int j = 0; j < 16; j++) {
            for (int i = 0; i < 31; i++) {
                System.out.print(automatArray[j][i]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
