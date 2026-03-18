package ht.fds.mbds.michel.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;

/**
 * Classe responsable du traitement des questions
 * Pour ce TP, elle change simplement la casse et entoure de ||
 */
@Dependent
public class Modificateur implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Traite la question en changeant la casse et en l'entourant de ||
     * @param roleApi Le rôle de l'API sélectionné
     * @param question La question posée par l'utilisateur
     * @return La réponse traitée
     */
    public String traiter(String roleApi, String question) {
        if (question == null || question.isEmpty()) {
            return "";
        }

        // Inverser la casse (maiuscules -> minuscules et vice versa)
        String inverserCasse = inverserCasse(question);

        // Entourer avec ||
        return "|| " + inverserCasse + " ||";
    }

    /**
     * Inverse la casse des caractères
     * @param texte Le texte à inverser
     * @return Le texte avec la casse inversée
     */
    private String inverserCasse(String texte) {
        StringBuilder resultat = new StringBuilder();
        for (char c : texte.toCharArray()) {
            if (Character.isUpperCase(c)) {
                resultat.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                resultat.append(Character.toUpperCase(c));
            } else {
                resultat.append(c);
            }
        }
        return resultat.toString();
    }

    public String modifier(String question, String roleSystemePourModification) {

      return "";
    }
}
