package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class EscribaArcano implements EstrategiaDeMejora{
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Pergamino")) {
            int aux = artefacto.getNivelDePoder();
            if (aux < 30) {
                artefacto.setPoder(aux + 25);
            } else {
                artefacto.setPoder(aux - 10);
            }
        }
    }
}
