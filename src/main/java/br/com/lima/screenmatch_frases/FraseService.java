/*
  By Sósthenes Oliveira lima
  Palmas-To - 16-01-2025
 */

package br.com.lima.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
            Frase frase = repositorio.buscaFraseAleatoria();
            return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
