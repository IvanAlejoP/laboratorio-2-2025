package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora{
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Poción")){
            int aux= artefacto.getNivelDePoder();
            if(aux<80){
                artefacto.setPoder(aux+20);
            }else{
                artefacto.setPoder(100);
            }
        }
    }
}
