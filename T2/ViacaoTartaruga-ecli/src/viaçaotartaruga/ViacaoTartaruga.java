/*
 * [ViacaoTartaruga] A viação tartaruga possui um frota de 12 veículos.
Cada veículo tem uma capacidade única de passageiros, um estado de origem
(RJ, SP, MG, etc.) e um de destino. Quando cada veículo for criado, deveremos 
iniciar essas variáveis somente pelo construtor da classe Veículo. A classe
veículo deve implementar o método comprar,

que aloca um dos assentos do veículo
(se disponível), retornando um valor lógico, indicando se houve sucesso ou não,
o método 

getNumAssentosDisponiveis, que retorna o número de assentos ainda não 
vendidos, e o método 

getNumAssentos, que retorna o total de assentos que o 
veículo dispõe.


Faça um programa principal que crie a frota de veículos num array de 12 
posições, com valores fictícios e diferentes entre si para cada objeto.
A partir de então, inicie um repetição que exibe a lista de ocupação de 
cada ônibus (mostrada abaixo) e espere no console que o usuário digite o
número do ônibus. Ao digitar o número do ônibus, o programa deverá vender
um assento e mostrar novamente a lista de ocupação. Quando o usuário digitar
0, o programa deve ser finalizado:
01: RJ-SP (5 assentos disponíveis de 20)
02: MG-RS (10 assentos disponíveis de 15)
03: MS-RO (3 assentos disponíveis de 21)
04: BA-SE (6 assentos disponíveis de 10)
05: SC-RJ (1 assentos disponíveis de 20)
06 AM-AC (0 assentos disponíveis de 60)
07: AL-CE (20 assentos disponíveis de 20)
09: RR-GO (14 assentos disponíveis de 45)
10: RN-PE (1 assentos disponíveis de 30)
11: SP-BA (30 assentos disponíveis de 40)
12: SC-ES (0 assentos disponíveis de 10)
 * 
 */
package viaçaotartaruga;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ViacaoTartaruga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Veiculo[] veiculo = new Veiculo[12];
        veiculo[0] = new Veiculo("RJ", "SP", 20, 5);
        veiculo[1] = new Veiculo("MG", "RS", 15, 10);
        veiculo[2] = new Veiculo("MS", "RO", 21, 3);
        veiculo[3] = new Veiculo("BA", "SE", 10, 6);
        veiculo[4] = new Veiculo("SC", "RJ", 20, 1);
        veiculo[5] = new Veiculo("AM", "AC", 60, 0);
        veiculo[6] = new Veiculo("AL", "CE", 20, 20);
        veiculo[7] = new Veiculo("SP", "RJ", 5, 3);
        veiculo[8] = new Veiculo("RR", "GO", 45, 14);
        veiculo[9] = new Veiculo("RN", "PE", 30, 1);
        veiculo[10] = new Veiculo("SP", "BA", 40, 30);
        veiculo[11] = new Veiculo("SC", "ES", 10, 0);

//01: RJ-SP (5 assentos disponíveis de 20) 
        while(true){
            Integer i=1;
            for (Veiculo v:veiculo){
                
                System.out.println(i.toString().format("%02d",i)+": "+v.getOrigem()+"-"+v.getDestino()+" ("+v.getNumAssentosDisponiveis()+" assentos disponíveis de "+v.getNumAssentos()+")");
                i++;
        }    
            System.out.println("Insira a linha para fazer a compra(1-12): ");
            Integer escolha  = scan.nextInt();
            if (escolha == 0){
                System.out.println("ATÉ BREVE!");
                return;
            }
            if(veiculo[escolha-1].comprar()){
                System.out.println("\n\n\n\n\n");
                System.out.println("Compra realizada com sucesso!! ");
                scan.nextLine();
                scan.nextLine();
            }
            else{
                System.out.println("\n\n\n\n\n");
                System.out.println("Falha ao comprar! verifique as informacoes!");
                scan.nextLine();
                scan.nextLine();
            }
            i=1;
        }
        
    }
    
}

class Veiculo{

    public Veiculo(String origem, String destino, Integer numAssentos, Integer numAssentosDisponiveis) {
        this.origem = origem;
        this.destino = destino;
        this.numAssentos = numAssentos;
        this.numAssentosDisponiveis = numAssentosDisponiveis;
    }
    private String origem;
    private String destino;
    private Integer numAssentos;
    private Integer numAssentosDisponiveis;
    
    public Boolean comprar(){
        if (this.getNumAssentosDisponiveis() > 0){
            this.numAssentosDisponiveis--;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Integer getNumAssentos(){
        return this.numAssentos;
    }
    public Integer getNumAssentosDisponiveis(){
        return this.numAssentosDisponiveis;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}