
public class Bank {
    private String nama;
    private String[] daftarNasabah;
    private int jumlahNasabah;
    private Rekening[] daftarRekening;
    private int jumlahRekening;
    private Transaksi[] daftarTransaksi;
    private int jumlahTransaksi;

    public Bank(String nama, int maxJumlahNasabah, int maxJumlahTransaksi) {
        this.nama = nama;
        daftarNasabah = new String[maxJumlahNasabah];
        daftarRekening = new Rekening[maxJumlahNasabah * 5];
        daftarTransaksi = new Transaksi[maxJumlahTransaksi];
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahRekening() {
        return jumlahRekening;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
    
    public void tambahNasabah(String nasabah){
        daftarNasabah[jumlahNasabah] = nasabah;
        jumlahNasabah++;
    }
    
    public void buatRekening(int idxNasabah, int noRek, double saldo) {
        if (saldo > 500000) {
            daftarRekening[jumlahRekening] = new Rekening(daftarNasabah[idxNasabah], noRek, saldo);
            jumlahRekening++;
        }
    }
    
    public Rekening getRekening(int i) {
        return daftarRekening[i];
    }
    
    public void tambahTransaksi(int jnsTransaksi, double jumlah, Rekening rek) {
        if (jnsTransaksi == 0) {
            if (rek.getSaldo() > jumlah) {
                rek.tarikUang(jumlah);
            }
        } else {
            rek.setorUang(jumlah);
        }
    }
    
    public Transaksi getTransaksi(int i) {
        return daftarTransaksi[i];
    }
    
}
