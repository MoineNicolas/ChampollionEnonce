package champollion;

public class Enseignant extends Personne {

// TODO : rajouter les autres méthodes présentes dans le diagramme UML

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
// TODO: Implémenter cette méthode // throw new UnsupportedOperationException("Pas encore implémenté");
        int heureEquivalentTD() = new heuresPrevues;
        heureEquivalentTD = (1,5*CM + TD + 0,75*TP);
        return heureEquivalentTD;

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
// TODO: Implémenter cette méthode // throw new UnsupportedOperationException("Pas encore implémenté");
        int heureEquivalentTDUE() = new heuresPrevuesPourUE;
        heureEquivalentTDUE = (1,5*UE.CM + UE.TD + 0,75*UE.TP);
        return heureEquivalentTDUE;
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
// TODO: Implémenter cette méthode // throw new UnsupportedOperationException("Pas encore implémenté");
        String enseignement() = new enseignement.UE();
        
    }
    public void ajouteIntervention(TypeIntervention inter) {
// TODO: Implémenter cette méthode //throw new UnsupportedOperationException("Pas encore implémenté");
        enum inter = new typeIntervention;
        return inter;
    }
    public int resteAPlanifier(UE ue,TypeIntervention inter) {
// TODO: Implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
    }