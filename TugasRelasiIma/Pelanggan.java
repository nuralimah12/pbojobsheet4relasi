public class Pelanggan{
    private String nama;
    private String noKTP;
    private String alamat;

    public Pelanggan(String nama, String noKTP,String alamat){
        this.nama = nama;
        this.noKTP = noKTP;
        this.alamat = alamat;
    }

    public void setnoKTP(String noKTP){
        this.noKTP = noKTP;
    }

    public String getnoKTP(){
        return noKTP;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setAlamat(String alamat){
        this.alamat = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public String info(){
        String info = "";
        info += "Ktp: "+ noKTP +"\n";
        info += "Nama Tamu: "+ nama +"\n";
        info += "Alamat Tamu: "+ alamat +"\n";
        return info;
    }
 
}





