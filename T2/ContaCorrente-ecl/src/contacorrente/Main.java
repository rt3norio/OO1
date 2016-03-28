package contacorrente;

public class Main {
    public static void main(String[] args) {
        if(Teste1()) System.out.println("Teste1: OK!");
        else System.out.println("Teste1: ERRO!");
        if(Teste2()) System.out.println("Teste2: OK!");
        else System.out.println("Teste2: ERRO!");
        if(Teste3()) System.out.println("Teste3: OK!");
        else System.out.println("Teste3: ERRO!");
    }
    // Conta normal não pode ter saldo negativo
    public static boolean Teste1() {
        Cliente cli1=new Cliente(123456789,"João");
        Cliente cli2=new Cliente(987654321,"Ana");
        ContaNormal conta1=new ContaNormal(1,cli1);
        conta1.setClienteSecundario(cli2);
        conta1.depositar(100);
        boolean result=conta1.sacar(150); // Deve retornar false
        return !result;
    }
    // Conta especial pode ter saldo negativo, até o limite
    public static boolean Teste2() {
        Cliente cli1=new Cliente(987654321,"Ana");
        cli1.setNome("Ana Beatriz");
        ContaEspecial conta1=new ContaEspecial(1,cli1,200);
        conta1.depositar(100);
        boolean result=conta1.sacar(150); // retorna true
        return result;
    }
    // Conta especial pode ter saldo negativo, até o limite
    public static boolean Teste3() {
        Cliente cli1=new Cliente(987654321,"Ana");
        ContaEspecial conta1=new ContaEspecial(1,cli1,200);
        conta1.depositar(100);
        boolean result=conta1.sacar(350); // deve retornar false
        return !result;
    }
}