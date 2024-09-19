package aula;

public class Televisor {
    
    private String marca;
    private int tamanho; // em polegadas
    private boolean dvdPlayer;

    // Construtor padrão
    Televisor() {
        marca = "LG";
        tamanho = 32; // tamanho padrão
        dvdPlayer = true; // inicia com DVD player
    }

    // Construtor com parâmetros
    Televisor(String m, int t, boolean dvd) {
        marca = m;
        tamanho = t;
        dvdPlayer = dvd;
    }

    // Método para obter a marca
    String getMarca() {
        return marca;
    }

    // Método para obter o tamanho
    int getTamanho() {
        return tamanho;
    }

    // Método para verificar se tem DVD player
    boolean hasDvdPlayer() {
        return dvdPlayer;
    }

    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor("Samsung", 40, true);
        Televisor tv3 = new Televisor("Sony", 50, false);
        
        System.out.println("A TV tv1 é da marca " + tv1.getMarca() + ", tamanho " + tv1.getTamanho() + " polegadas e possui DVD player: " + tv1.hasDvdPlayer() + ".");
        System.out.println("A TV tv2 é da marca " + tv2.getMarca() + ", tamanho " + tv2.getTamanho() + " polegadas e possui DVD player: " + tv2.hasDvdPlayer() + ".");
        System.out.println("A TV tv3 é da marca " + tv3.getMarca() + ", tamanho " + tv3.getTamanho() + " polegadas e possui DVD player: " + tv3.hasDvdPlayer() + ".");
    }
}