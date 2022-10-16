public class Kamar {
    private String noRuang;
    private Pelanggan pelanggan;

    public Kamar(String noRuang){
        this.noRuang = noRuang;
    }

    public void setnoRuang(String noRuang){
        this.noRuang = noRuang;
    }

    public String getnoRuang(){
       return noRuang;
    }

    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan(){
       return pelanggan;
    }

    public String info(){
        String info = "";
        info += "Nomor Kamar: "+ noRuang+ "\n";
        if(this.pelanggan!= null){
            info += "Pelanggan:\n"+pelanggan.info()+"\n";
        }
        return info;
    }
}
