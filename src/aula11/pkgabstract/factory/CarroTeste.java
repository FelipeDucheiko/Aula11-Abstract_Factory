/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.pkgabstract.factory;

/**
 *
 * @author felip
 */
public class CarroTeste {
    
    public static void main(String[] args){
        Carro carroPopular = Carro.fabricarCarro("popular");
        carroPopular.exibirInfo();
        System.out.println("");
        
        System.out.println("===================================================");
        
        Carro carroLuxo = Carro.fabricarCarro("luxo");
        carroLuxo.exibirInfo();
        System.out.println("");
    }
    
}
