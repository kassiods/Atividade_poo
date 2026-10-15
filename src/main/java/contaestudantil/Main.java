package contaestudantil;

public class Main {

    public static void main(String[] args) {
        Aluno carlos = new Aluno("2026001", "Carlos Silva", "carlos.silva@aluno.ifpi.edu.br");
        Aluno beatriz = new Aluno("2026002", "Beatriz Souza", "beatriz.souza@aluno.ifpi.edu.br");

        ContaEstudantil contaDoCarlos = new ContaEstudantil("1001", carlos, 50.0);
        ContaEstudantil contaDaBeatriz = new ContaEstudantil("1002", beatriz, 0.0);

        System.out.println(carlos.exibirPerfil());
        System.out.println(beatriz.exibirPerfil());

        System.out.println("\n--- Depósito e validação ---");
        contaDoCarlos.depositar(-50.0);
        System.out.println("Saldo após depósito negativo (rejeitado): " + contaDoCarlos.getSaldo());
        contaDoCarlos.depositar(100.0);
        System.out.println("Saldo após depósito de 100.00: " + contaDoCarlos.getSaldo());

        System.out.println("\n--- Pagamento com limite ---");
        boolean pagamentoAutorizado = contaDoCarlos.pagar(130.0);
        System.out.println("Pagamento de 130.00 autorizado? " + pagamentoAutorizado);
        System.out.println("Saldo do Carlos após pagamento: " + contaDoCarlos.getSaldo());

        System.out.println("\n--- Transferência entre contas ---");
        boolean transferenciaRealizada = contaDoCarlos.transferir(contaDaBeatriz, 20.0);
        System.out.println("Transferência de 20.00 realizada? " + transferenciaRealizada);
        System.out.println("Saldo final do Carlos: " + contaDoCarlos.getSaldo());
        System.out.println("Saldo final da Beatriz: " + contaDaBeatriz.getSaldo());
    }
}
