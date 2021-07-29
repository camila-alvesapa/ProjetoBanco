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
public class ProjetoContaBanco {

    
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1001);
        pessoa1.setDono("Ciclano");
        pessoa1.abrirConta("CC");
              
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(1002);
        pessoa2.setDono("Beltrano");
        pessoa2.abrirConta("CP");
        
        pessoa1.depositar(300);
        pessoa2.depositar(500);
        
        pessoa2.sacar(100);
        pessoa2.sacar(600);
        
        pessoa2.fecharConta();
                
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
        
    }
    
}
