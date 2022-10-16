public class MainTugas {
    public static void main(String[] args) {
        Pelanggan pl = new Pelanggan("Ariana Grande","123345","USA");
        Pegawai pegawai = new Pegawai("Demi Lovato","001","084325678",10);
        pegawai.setPelanggan(pl,1);
        System.out.println(pegawai.info());
        Pelanggan l = new Pelanggan("Kendal Jenner","54321","USA");
        pegawai.setPelanggan(l,2);
        System.out.println(pegawai.info());
        
        
 
    }
}
