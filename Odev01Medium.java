package tasks10;

import java.util.Random;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    public static int randomNum(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);

    }

    public static void main(String[] args) {
        int max = 20;
        int rd1 = randomNum(max);
        System.out.println("o ile 20 arasinda rastgle bir sayi elde ettiniz" + max+ ":" + rd1);

    }

}
