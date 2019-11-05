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
public class CarroConcreteFactory implements CarroFactory {

    @Override
    public CarroPopular criarCarroPopular() {
        return new CarroPopular();
    }

    @Override
    public CarroLuxo criarCarroLuxo() {
        return new CarroLuxo();
    }

    
    
}
