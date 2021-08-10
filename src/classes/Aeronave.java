package classes;

public class Aeronave {   
        private int quantidadePassageiros;
        private String numeroSerie;
        private String modelo;
        private Pessoa piloto;
        private int velocidadeAtual;

        public int getVelocidadeAtual() {
            return velocidadeAtual;
        }

        public int getQuantidadePassageiros() {
            return quantidadePassageiros;
        }
    
        public void setQuantidadePassageiros(int quantidadePassageiros) {
            this.quantidadePassageiros = quantidadePassageiros;
        }
    
        public String getNumeroSerie() {
            return numeroSerie;
        }
    
        public void setNumeroSerie(String numeroSerie) {
            this.numeroSerie = numeroSerie;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public Pessoa getPiloto() {
            return piloto;
        }
    
        public void setPiloto(Pessoa piloto) {
            this.piloto = piloto;
        }
        
        
@Override
        public String toString(){
     return String.format("modelo: %s - numeroSerie: %s - piloto: %s - quantidadePassageiros: %d", getModelo(), getNumeroSerie(), getPiloto(), getQuantidadePassageiros());
        }

        public Aeronave(int quantidadePassageiros, String numeroSerie, String modelo) {
            this.quantidadePassageiros = quantidadePassageiros;
            this.numeroSerie = numeroSerie;
            this.modelo = modelo;
        }
    void acelerar(){
        velocidadeAtual ++;
    }
    void acelerar(int velocidade){
        for (int i = 0; i < velocidade; i++) {
        acelerar();
        };
    }
  }

