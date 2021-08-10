package programa;
import java.util.Scanner;

import classes.Aeronave;
import classes.Pessoa;

public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
    
    Aeronave nave = new Aeronave (1000, "0022N", "Airbus");
    Pessoa piloto = new Pessoa ("0130202050408101", "João", nave);

    System.out.println ("PILOTO: Sejam bem-vindos a bordo ao voo 187 para Chicago.Nosso tempo de viagem nessa manhã será de, aproximadamente, uma hora e quinze minutos.");    
    System.out.println ("AEROMOÇAS: Pedimos para que todos os aparelhos eletrônicos sejam desligados e guardados nesse momento.");
    System.out.println("PILOTO: Senhoras e senhores, estamos prestes a decolar. Por favor, sentem-se e ponham os cintos de segurança.");
    System.out.println("PILOTO: Acelerando até 1000 km/h !!!!!! ");
    piloto.acelerar(1000);
    System.out.printf("Velocidade atual: %d", piloto.getNave().getVelocidadeAtual());
   
 sc.close();
    }
}
