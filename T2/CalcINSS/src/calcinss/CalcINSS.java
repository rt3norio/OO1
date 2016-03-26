package calcinss;


import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class CalcINSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario[] func = new Funcionario[1];
        Scanner scan = new Scanner(System.in);
                
        for (Funcionario f:func){
            f = new Funcionario();
            System.out.println("Insira o nome do Funcionario :");
            f.setNome(scan.next());
            System.out.println("Insira a matricula do Funcionario :");
            f.setMatricula(scan.nextInt());
            System.out.println("Insira o salário do Funcionario :");
            f.setSalario(scan.nextDouble());
            System.out.println();
        }
        System.out.println(func[0].getNome());
        for (Funcionario func1 : func) {
            System.out.print(func1.getNome() + ": " + "INSS: R$" + func1.calcularInss());
        }
    }
    
}
/*
até 720,00 paga 7,65%; de 720,01 até 1200,00 paga 9%; e de 1200,01 até 2400,00 paga 11%. 
*/
class Funcionario{
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario() {
        this.matricula = 0;
        this.nome = "nome";
        this.salario = 0.0;
    }
    
    public double calcularInss(){
        if (this.salario<=720.0){
            return this.salario * 0.0765;
        }
        else if (this.salario <= 1200.0){
            return this.salario * 0.09;
        }
        else if (this.salario <= 2400.0){
            return this.salario * 0.11;
        }
        return 0.0;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}