class CarteiraDigital {
    private double saldo; // Armazena o saldo atual da carteira

    public CarteiraDigital() {
        // Inicializa o saldo como zero
        this.saldo = 0.0;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor; // Incrementa o saldo
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido! O valor deve ser maior que zero.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor; // Decrementa o saldo
            System.out.println("Pagamento realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Valor inválido! O valor deve ser maior que zero.");
        }
    }

    public double verificarSaldo() {
        return saldo; // Retorna o saldo atual
    }
}