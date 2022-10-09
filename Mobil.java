public class Mobil {
    private String nama;
    private int biaya;
    private String merk;

    public Mobil(){

    }

    public Mobil(String nama, int biaya){
    this.nama = nama;
    this.biaya = biaya;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaMobil(int hari) { 
        return biaya * hari; 
    } 
 
 
}
