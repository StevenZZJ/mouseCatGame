/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD5;

import TD5.controler.AbstractControler;
import TD5.controler.Controler;
import TD5.model.AbstractModel;
import TD5.model.Model;
import TD5.vue.Vue;

/**
 *
 * @author david
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractModel model = new Model(); //à instancier
        AbstractControler controler = new Controler(model); //à instancier
        Vue v = new Vue(model,controler);
        model.addObservateur(v);
        v.setVisible(true);
        while(!model.partieTerminer()){
            controler.calculerStepSuivant();
        }
    }
    
}
