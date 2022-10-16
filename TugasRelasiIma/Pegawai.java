public class Pegawai {
    private String namaPegawai;
    private String idPegawai;
    private String noHp;
    private Kamar[] arrayKamar;

    public Pegawai(String namaPegawai, String idPegawai, String noHp,int jumlah){
    this.namaPegawai = namaPegawai;
    this.idPegawai = idPegawai;
    this.noHp = noHp;
    this.arrayKamar = new Kamar[jumlah];
    this.initKamar();
    }

    
    private void initKamar(){
        for(int i=0;i<arrayKamar.length;i++){
            this.arrayKamar[i] = new Kamar(String.valueOf(i+1));

        }
    }

    public void setnamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }

    public String getnamaPegawai(){
        return namaPegawai;
    }
    

    public void setidPegawai(String idPegawai){
        this.idPegawai= idPegawai;
    }

    public String getidPegawai(){
        return idPegawai;
    }
    

    public void setnoHp(String noHp){
        this.noHp = noHp;
    }

    
    public String getnoHp(){
        return noHp;
    }

    public void setPelanggan(Pelanggan pelanggan, int noRuang){
        if(this.arrayKamar[noRuang - 1].getPelanggan() == null){
        this.arrayKamar[noRuang-1].setPelanggan(pelanggan);
        } else {
            for(int i=0;i < arrayKamar.length;i++){
                if(this.arrayKamar[noRuang - 1].getPelanggan() != null){
                    noRuang++;
                }
            }
            this.arrayKamar[noRuang - 1].setPelanggan(pelanggan);
        }
    }

    public Kamar[] getArrayKamar(){
        return arrayKamar;
    }

    public String info(){
        String info = "";
        info += "Id Pegawai: "+idPegawai+"\n";
        info += "Nama Pegawai: "+namaPegawai+"\n";
        info += "No HP: "+noHp+"\n";
        for(Kamar kamar : arrayKamar){
            info += kamar.info();
        }
        return info;
    } 

    

    

    


}
