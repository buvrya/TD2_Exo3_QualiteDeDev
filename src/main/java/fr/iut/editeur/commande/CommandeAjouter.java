package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe CommandeAjouter : Permet d'ajouter du texte dans la classe Document.
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur de la casse CommandeAjouter.
     * @param document -> Objet de la classe Document.
     * @param parameters -> Chaîne de caractères qui sera ajoutée.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Récupère et lit l'entrée standard puis exécute la méthode adéquate.
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
