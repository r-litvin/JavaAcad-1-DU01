import java.time.LocalDate;

public class Seller {
    public String name, surname; // Jméno a příjmení prodejce
    public LocalDate birthday; // Datum narození prodejce.
    public int numberContracts; // Počet dosud sjednaných smluv.
    public double totalCarrotTons;// Celkové množství prodané mrkve v tunách.
    public String city; // Název města, kde prodejce sídlí.
    public char[] carSPZ = "0000000".toCharArray();// Registrační značka vozidla („SPZ“).
    public double fuelConsumption; // Spotřeba firemního vozidla v litrech na 100 km.
    public char[] companyIPAddress; // IP adresa verze 4 firemního počítače.

    public Seller(){
        name = "Mr";
        surname = "Impossible";
        birthday = LocalDate.of(1900, 1, 1);
        numberContracts = 0;
        totalCarrotTons = 0d;
        city = "Racoon city";
        fuelConsumption = 10d;
        setIPAddress("000.000.000.000");
    }

    public String giveName(){
        return name+" "+surname;
    }

    public void giveIPAddress(){
        String IPaddress = ""; //breaking the naming rules?
        for(int i=0;i<4;i++){
            for(int j=0; j<3;j++){
                IPaddress += String.valueOf(companyIPAddress[i*3+j]);
            }
            IPaddress += ".";
        }
        System.out.println("IP address is " + IPaddress);

    }
    public void setIPAddress(String inputIP){
        char[] outputIP = "000000000000".toCharArray();
        if (inputIP.length() != 15) {
            System.out.println("setIPAddress error: incorrect input string length (should be 15)");
            return;
        }
        int posx = 0;
        for (int i=0;i<15;i++) {
            if ((i + 1) % 4 == 0) {
                if (inputIP.charAt(i) != '.') {
                    System.out.println("i=" + i + "setIPAddress error: incorrect input string format");
                    return;
                }
            }
            if ((i + 1) % 4 != 0) {
                outputIP[posx] = inputIP.charAt(i);
                posx++;
            }
        }
        companyIPAddress = outputIP;
    }
}
