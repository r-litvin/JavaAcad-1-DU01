/**
 * Java Academy Engeto 2023-09-14
 * Ukol 1
 */
import java.math.BigDecimal;
public class Main {

    public static void ukol1() {
        System.out.println("\nEngeto Java Academy \nDomaci ukol 1");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        String pocetLekci = "10";
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0d;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.valueOf(0); // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
        // fixed now, this is a good example of the binary<->decimal issue
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!"); // missing `static` in declaration ?
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        //Evidence prodejců
        Seller seller1 = new Seller();
        seller1.name = "Josef";
        seller1.surname = "Vomáčka";
        seller1.setIPAddress("192.000.000.001");
        seller1.totalCarrotTons = 1.21e3d;
        seller1.numberContracts = 13;

        // check methods
//        seller1.giveIPAddress();

        // calculate carrots per contract
        String carrotsPerContractNice = String.format("%.1f",seller1.totalCarrotTons/seller1.numberContracts);
        String award = "\"Seller of the Month\"";
        System.out.println("\nSeller "+seller1.giveName()+" has sold "+carrotsPerContractNice+" tons of carrots per contract and wins the "+award+" award!");
        System.out.println("\nEnd OK.");
    }
}