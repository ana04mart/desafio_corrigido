package classes;

import java.util.InputMismatchException;
public class Pessoa {
   
    private String nome;
    private String cpf;
    private char sexo;
    private Aeronave nave;
    
    public Pessoa ( Aeronave nave){
        this.nave = nave ;
     }
    
    public Aeronave getNave (){
        return nave;
    }
    public void setNave (Aeronave nave){
        this.nave = nave;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && cpf.matches("\\d{11}")){
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("O CPF deve ter 11 dígitos");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if("MmFf".indexOf(sexo) > -1) {
            this.sexo = sexo;
        } else {
            throw new InputMismatchException("Sexo só pode ser M ou F");
        }
        
    }

    @Override
    public String toString(){
        return String.format("Nome: %s - CPF: %s - nave: %s ", getNome(), getCpf(), getNave());
    }
    
    public Pessoa(String nome, String cpf, Aeronave nave) {
        this.nome = nome;
        this.cpf = cpf;
        this.nave = nave;
        nave.setPiloto(this);
    }


    public String cumprimentar() {
        return "Olá, desconhecido. Meu nome é " + nome;
    }

    public String cumprimentar(String nomeOutraPessoa) {
        return "Olá, " + nomeOutraPessoa + ". Meu nome é " + nome;
    }

    public void acelerar(){
        nave.acelerar();
    }
    
    public void acelerar(int limite){
        nave.acelerar(limite);
    }
}
