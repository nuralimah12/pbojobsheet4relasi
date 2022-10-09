public class MainPercobaan4 {
    public static void main(String[] args) throws Exception {
        Penumpang p = new Penumpang("12345","Mr.Krab");
        Gerbong gerbong = new Gerbong("A",10);
        Penumpang budi = new Penumpang("56789","Ima");
        gerbong.setPenumpang(p,1);
        System.out.println(gerbong.info());
        gerbong.setPenumpang(budi,1);
        System.out.println(gerbong.info());
        }
}
