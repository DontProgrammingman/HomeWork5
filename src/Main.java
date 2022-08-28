public class Main {
    public static void main(String[] args) {
        int[] arrInt = new int[3];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i + 1;
        }
        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] newArrInt = {1, 3, 5};


        for (int i = 0; i < arrInt.length; i++) {
            if (i != arrInt.length - 1) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.println(arrInt[i]);
            }
        }
        for (int i = 0; i < arrDouble.length; i++) {
            if (i != arrDouble.length - 1) {
                System.out.print(arrDouble[i] + ", ");
            } else {
                System.out.println(arrDouble[i]);
            }
        }
        for (int i = 0; i < newArrInt.length; i++) {
            if (i != newArrInt.length - 1) {
                System.out.print(newArrInt[i] + ", ");
            } else {
                System.out.println(newArrInt[i]);
            }
        }

        for (int i = arrInt.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.println(arrInt[i]);
            }
        }
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrDouble[i] + ", ");
            } else {
                System.out.println(arrDouble[i]);
            }
        }
        for (int i = newArrInt.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(newArrInt[i] + ", ");
            } else {
                System.out.println(newArrInt[i]);
            }
        }

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i] = arrInt[i] + 1;
            }
            if (i != arrInt.length - 1) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.println(arrInt[i]);
            }
        }
    }
}