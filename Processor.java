public class Processor {
    private String merk;
    private double cache;

    public Processor(){

    }
    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }
    public void setMerk(String newMerk){
        this.merk = newMerk;
    }

    public void setCache(double newCache){
        this.cache = newCache;
    }

    public String getMerk(){
        return merk;
    }

    public double setCache(){
        return cache;
    }
    public void info(){
        System.out.printf ("Merk processor =  %s\n", merk);
        System.out.printf ("Cache Memory =  %.2f\n", cache);
    }
}
