public class Main {
    public static void main(String[] args) {

        Cliente thiago = new Cliente();
        thiago.setNome("Thiago");

        Conta cc = new ContaCorrente(thiago);
        Conta poupanca = new ContaPoupanca(thiago);

        cc.depositar(100);
        cc.tranferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
