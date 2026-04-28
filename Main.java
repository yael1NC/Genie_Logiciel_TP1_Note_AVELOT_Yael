public class Main {
    public static void main(String[] args) {

        System.out.println(" Création du rédacteur ");
        Redacteur redacteur = new Redacteur("Avelot", "Yael");
        System.out.println(redacteur);


        System.out.println("\n Création du quiz ");
        Quiz quiz = new Quiz("Cultures du monde", Categorie.CULTURE_GENERALE, redacteur);
        System.out.println(quiz);


        System.out.println("\n Ajout des questions ");

        
        Question q1 = new Question("Quelle est la capitale de la Nouvelle Calédonie ?");
        q1.ajouterReponse(new Reponse("Paita", false, Position.A));
        q1.ajouterReponse(new Reponse("Bourail", false, Position.B));
        q1.ajouterReponse(new Reponse("Dumbéa", false, Position.C));
        q1.ajouterReponse(new Reponse("Nouméa", true, Position.D));
        quiz.ajouterQuestion(q1);
        System.out.println(q1);
        q1.getReponses().forEach(r -> System.out.println(" " + r));

        
        Question q2 = new Question("Combien y a-t-il de communes en NC ?");
        q2.ajouterReponse(new Reponse("11", false, Position.A));
        q2.ajouterReponse(new Reponse("22", false, Position.B));
        q2.ajouterReponse(new Reponse("33", true, Position.C));
        q2.ajouterReponse(new Reponse("44", false, Position.D));
        quiz.ajouterQuestion(q2);
        System.out.println(q2);
        q2.getReponses().forEach(r -> System.out.println(" " + r));
        
        Question q3 = new Question("Quel est le plus grand océan du monde ?");
        q3.ajouterReponse(new Reponse("Atlantique", false, Position.A));
        q3.ajouterReponse(new Reponse("Indien", false, Position.B));
        q3.ajouterReponse(new Reponse("Arctique", false, Position.C));
        q3.ajouterReponse(new Reponse("Pacifique", true, Position.D));
        quiz.ajouterQuestion(q3);
        System.out.println(q3);

        q3.getReponses().forEach(r -> System.out.println(" " + r));

        
        Question q4 = new Question("En quelle année a eu lieu la prise de possession de la Nouvelle Calédonie ?");
        q4.ajouterReponse(new Reponse("1853", true, Position.A));
        q4.ajouterReponse(new Reponse("1804", false, Position.B));
        q4.ajouterReponse(new Reponse("1026", false, Position.C));
        q4.ajouterReponse(new Reponse("1815", false, Position.D));
        quiz.ajouterQuestion(q4);
        System.out.println(q4);

        q4.getReponses().forEach(r -> System.out.println(" " + r));

        
        Question q5 = new Question("Quel est le sommet le plus haut de Nouvelle caledonie ?");
        q5.ajouterReponse(new Reponse("Mont Panié", true, Position.A));
        q5.ajouterReponse(new Reponse("Mont Koghi", false, Position.B));
        q5.ajouterReponse(new Reponse("Col de Mouirange", false, Position.C));
        q5.ajouterReponse(new Reponse("Mont Humboldt", false, Position.D));
        quiz.ajouterQuestion(q5);
        System.out.println(q5);
        q5.getReponses().forEach(r -> System.out.println(" " + r));

        System.out.println("\n[INFO] Quiz final : " + quiz);

        
        System.out.println("\n Création des joueurs ");
        Joueur joueur1 = new Joueur("Lachaud", "Lucas");
        Joueur joueur2 = new Joueur("Guo", "Thierry");
        System.out.println(joueur1);
        System.out.println(joueur2);

        
        System.out.println("\n Création des parties ");
        Partie partie1 = new Partie(joueur1, quiz, 4);
        Partie partie2 = new Partie(joueur2, quiz, 2);
        System.out.println(partie1);
        System.out.println(partie2);

        
        System.out.println("\n Récapitulatif ");
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println("Quiz rédigés par " + redacteur.getPrenom() + " : " + redacteur.getQuizRediges().size());
    }
}
