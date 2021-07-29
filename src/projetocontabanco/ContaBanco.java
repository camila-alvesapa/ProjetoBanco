/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocontabanco;

/**
 *
 * @author camil
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual(){
        System.out.println("Informações da Conta:");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String tip){
        this.setTipo(tip);
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso");
        if (tip.equals("CC")){
            this.setSaldo(50);
        }
        else if (tip.equals("CP")){ 
            this.setSaldo(150);
        }
        
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta de " + this.getDono() + " com dinheiro, favor sacar para fechar conta.");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta de " + this.getDono() + " em débito, favor realizar pagamento para fechar conta.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso.");
        }
    
    }
    
    public void depositar(float valor){
        if (this.isStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de " + valor + " reais realizado na conta de " + this.getDono());
        }
        else {
            System.out.println("Impossível fazer depósito em uma conta inexistente.");
        }
    
    }
    
    public void sacar( float valor){
        if (this.isStatus() == true){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque de " + valor + " reais realizado na conta de " + this.getDono());
            }
            else if((this.getSaldo() < valor) && (this.getSaldo() >= 0)){
                System.out.println("Saldo da conta de " + this.getDono() + " no valor de " + this.getSaldo() + ", insuficiente para o saque desejado.");    
            }
            else {
                System.out.println("Conta de " + this.getDono() + " em débito, saque não realizado.");
            }
    
        }
        else {
            System.out.println("Impossível sacar de uma conta inexistente.");
        }
    }
    
    public void pagarManutencao(){
        if (this.isStatus() == true){
            if (this.getTipo().equals("CC")){
                this.setSaldo(this.getSaldo() - 12);
            }
            else if (this.getTipo().equals("CP")){
                this.setSaldo(this.getSaldo() - 20);
            }
        }
        
        else {
            System.out.println("Impossível pagar manutenção de uma conta inexistente.");
        }
    
    }

    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
