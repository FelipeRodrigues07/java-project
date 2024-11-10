package aula;

public class fogao {
    
    private String marca;
    private int numeroDeBocas;''
    private boolean ligado;

    
    fogao() {
        marca = "Consul";
        numeroDeBocas = 4; 
        ligado = false; 
    }

    fogao(String m, int n) {
        marca = m;
        numeroDeBocas = n;
        ligado = false; 
    }

    
    String getMarca() {
        return marca;
    }

   
    int getNumeroDeBocas() {
        return numeroDeBocas;
    }

    
    void ligar() {
        ligado = true;
        System.out.println("Fogão ligado.");
    }

    
    void desligar() {
        ligado = false;
        System.out.println("Fogão desligado.");
    }

    public static void main(String[] args) {
        fogao fogao1 = new fogao();
        fogao fogao2 = new fogao("Brastemp", 5);
        fogao fogao3 = new fogao("Electrolux", 4);
        
        System.out.println("O fogão fogao1 é da marca " + fogao1.getMarca() + " com " + fogao1.getNumeroDeBocas() + " bocas.");
        System.out.println("O fogão fogao2 é da marca " + fogao2.getMarca() + " com " + fogao2.getNumeroDeBocas() + " bocas.");
        System.out.println("O fogão fogao3 é da marca " + fogao3.getMarca() + " com " + fogao3.getNumeroDeBocas() + " bocas.");
    }
}
