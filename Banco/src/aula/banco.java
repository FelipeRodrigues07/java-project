package aula;

public class automovel {
    
    private String marca;
    private String modelo;
    private int ano;

  
    automovel() {
        marca = "Fiat";
        modelo = "Uno";
        ano = 2020; 
    }

   
    automovel(String m, String mod, int a) {
        marca = m;
        modelo = mod;
        ano = a;
    }

    
    String getMarca() {
        return marca;
    }

    
    String getModelo() {
        return modelo;
    }

    
    int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        automovel car1 = new automovel();
        automovel car2 = new automovel("Chevrolet", "Onix", 2021);
        automovel car3 = new automovel("Volkswagen", "Gol", 2019);
        
        System.out.println("O automóvel car1 é da marca " + car1.getMarca() + ", modelo " + car1.getModelo() + " e ano " + car1.getAno() + ".");
        System.out.println("O automóvel car2 é da marca " + car2.getMarca() + ", modelo " + car2.getModelo() + " e ano " + car2.getAno() + ".");
        System.out.println("O automóvel car3 é da marca " + car3.getMarca() + ", modelo " + car3.getModelo() + " e ano " + car3.getAno() + ".");
    }
}