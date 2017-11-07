
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank = new Bank("Bank Amal", 4, 50);
        bank.tambahNasabah("Roro");
        bank.tambahNasabah("Shishi");
        bank.tambahNasabah("Ucup");
        bank.buatRekening(0, 13120040, 1000000);
        bank.buatRekening(0, 13120041, 1500000);
        bank.buatRekening(1, 13120044, 650000);
        bank.buatRekening(2, 13120042, 850000);
        bank.tambahTransaksi(0, 940000, bank.getRekening(0));
        bank.tambahTransaksi(0, 45000, bank.getRekening(1));
        bank.tambahTransaksi(0, 10000, bank.getRekening(2));
        bank.tambahTransaksi(0, 90000, bank.getRekening(2));
        bank.tambahTransaksi(0, 800000, bank.getRekening(3));
        
        for (int i = 0; i < bank.getJumlahRekening(); i++) {
            System.out.println((i+1) + ".\tNama     : " + bank.getRekening(i).getNasabah());
            System.out.println("\tNo Rek   : " + bank.getRekening(i).getNoRek());
            System.out.println("\tSaldo    : " + bank.getRekening(i).getSaldo());
            System.out.println("\tDaftar Transaksi");
            for (int j = 0; j < bank.getRekening(i).getJumlahTransaksi(); j++) {
                System.out.println("\t" + (j + 1) + ".\tJenis Transaksi : " + bank.getRekening(i).getTransaksi(j).getJenis());
                System.out.println("\t\tSebesar : " + bank.getRekening(i).getTransaksi(j).getJumlah());
            }
            System.out.println("");
        }
        
    }
    
}
