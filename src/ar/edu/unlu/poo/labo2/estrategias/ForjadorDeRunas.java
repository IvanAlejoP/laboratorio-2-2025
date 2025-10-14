package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class ForjadorDeRunas implements EstrategiaDeMejora{
    public void mejorar(Artefacto artefacto){
        if(artefacto.getTipo().equals("Varita")){
            int aux=artefacto.getNivelDePoder();
            artefacto.setPoder(aux+15);
        }
    }
}
