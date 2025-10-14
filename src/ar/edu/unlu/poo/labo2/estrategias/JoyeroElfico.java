package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora {
    public void mejorar(Artefacto artefacto){
        if(artefacto.getTipo().equals("Amuleto")){
            int aux=artefacto.getNivelDePoder();
            if(aux<50){
                artefacto.setPoder(aux*2);
            }else{
                double porcentaje=aux*0.25;
                artefacto.setPoder(aux+(int)porcentaje);
            }

        }
    }
}
