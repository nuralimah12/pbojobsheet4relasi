public class MainPercobaan3 {
    public static void main(String[] args) throws Exception {
       Pegawai masinis = new Pegawai("1234","Spongebob");
       Pegawai asisten = new Pegawai("34567","Patric Star");
       KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masinis,asisten);
       System.out.println(keretaApi.info());
    }
}
