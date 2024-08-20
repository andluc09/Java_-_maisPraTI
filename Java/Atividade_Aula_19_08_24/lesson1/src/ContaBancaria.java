package Java.Atividade_Aula_19_08_24.lesson1.src;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private String numeroConta;

    private String nomeTitular;

    private String tipoConta;

    private String agencia;

    private double saldo;

    private String statusConta;

    private String dataAbertura;

    private double limiteCredito;

    private List<String> historicoTransacao;

    public ContaBancaria(String numeroConta, String nomeTitular, String tipoConta, String agencia, double saldo, String statusConta, String dataAbertura, double limiteCredito) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.statusConta = statusConta;
        this.dataAbertura = dataAbertura;
        this.limiteCredito = limiteCredito;
        this.historicoTransacao = new ArrayList<>();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public List<String> getHistoricoTransacao() {
        List<String> formatadoHistoricoTransacao = new ArrayList<>();
        for (String transacao: historicoTransacao) {
            if (historicoTransacao.get(0) == transacao) {
                formatadoHistoricoTransacao.add(transacao.replace("\n", ""));
            } else {
                formatadoHistoricoTransacao.add(transacao);
            }
        }
        return formatadoHistoricoTransacao;
    }

    public void setHistoricoTransacao(List<String> historicoTransacao) {
        this.historicoTransacao = historicoTransacao;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.historicoTransacao.add("\nSaque: -" + valor);
            return true;
        } else {
            System.out.println("\nSaldo insuficiente para saque.");
            return false;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.historicoTransacao.add("\nDepósito: +" + valor);
        } else {
            System.out.println("\nValor de depósito inválido.");
        }
    }

    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            this.historicoTransacao.add("\nTransferência para conta " + contaDestino.getNumeroConta() + ": -" + valor);
            return true;
        } else {
            System.out.println("\nTransferência não realizada.");
            return false;
        }
    }

    public void extrato() {
        System.out.println("\nExtrato da Conta: " + this.numeroConta);
        for (String transacao : this.historicoTransacao) {
            System.out.println(transacao);
        }
        System.out.println("\nSaldo atual: " + this.saldo);
    }
}
