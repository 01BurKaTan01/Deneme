package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 9999; i < 100000; i++) {
            if (lynchbell(i)) {
                System.out.println(i);
            }
        }

    }


    public static boolean lynchbell(int sayi) {

        String sayiStr = String.valueOf(sayi);
        if(sayiStr.contains("0")){
            return false;
        }


        for (int i = 0; i < sayiStr.length(); i++) {  // sayının bütün rakamlarına bölen metod
            if (sayiStr.charAt(i) != '0') { // ArithmeticException önlemi
                if (sayi % Integer.parseInt(String.valueOf(sayiStr.charAt(i))) != 0) {  // eğer o anki rakama bölümü 0 değilse lynchbell değil
                    return false;
                }
            }
        }

        return true;

    }

}
