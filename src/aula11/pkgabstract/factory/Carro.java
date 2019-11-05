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
public abstract class Carro {
    String rodas;
    String som;
    String ar;
    String sistemaEstacionamento;
    
    public static Carro fabricarCarro(String tipo){
        Carro carro = null;
        
        switch (tipo){
            case "popular":
                carro = new CarroConcreteFactory().criarCarroPopular();
                break;
            case "luxo":
                carro = new CarroConcreteFactory().criarCarroLuxo();
                break;      
        }
        
        return carro;
    }
    
    public void exibirInfo(){
        System.out.println("Informações Carro:");
        System.out.println("Rodas: " + rodas);
        System.out.println("Som: " + som);
        System.out.println("Ar: " + ar);
        System.out.println("Sistema Estacionamento: " + sistemaEstacionamento);
    }
}
