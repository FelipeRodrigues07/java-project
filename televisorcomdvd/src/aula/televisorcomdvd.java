package aula;

public class televisorcomdvd {
    
    private String marca;
    private int tamanho; 
    private boolean dvdPlayer;

    
    televisorcomdvd() {
        marca = "LG";
        tamanho = 32; 
        dvdPlayer = true;
    }

    
    televisorcomdvd(String m, int t, boolean dvd) {
        marca = m;
        tamanho = t;
        dvdPlayer = dvd;
    }

   
    String getMarca() {
        return marca;
    }

   
    int getTamanho() {
        return tamanho;
    }

    
    boolean hasDvdPlayer() {
        return dvdPlayer;
    }

    public static void main(String[] args) {
        televisorcomdvd tv1 = new televisorcomdvd();
        televisorcomdvd tv2 = new televisorcomdvd("Samsung", 40, true);
        televisorcomdvd tv3 = new televisorcomdvd("Sony", 50, false);
        
        System.out.println("A TV tv1 é da marca " + tv1.getMarca() + ", tamanho " + tv1.getTamanho() + " polegadas e possui DVD player: " + tv1.hasDvdPlayer() + ".");
        System.out.println("A TV tv2 é da marca " + tv2.getMarca() + ", tamanho " + tv2.getTamanho() + " polegadas e possui DVD player: " + tv2.hasDvdPlayer() + ".");
        System.out.println("A TV tv3 é da marca " + tv3.getMarca() + ", tamanho " + tv3.getTamanho() + " polegadas e possui DVD player: " + tv3.hasDvdPlayer() + ".");
    }
}
