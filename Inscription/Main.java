import java.util.Scanner;
Public class Main {
             Public static void main( String args[]{
public static


   do {
                  System.out.println("1- Ajouter Classe");
                  System.out.println("2-Lister Classe")
                  System.out.println("3-Inscrire Etudiant")
                  System.out.println("4-Lister Etudiant")
                  System.out.println("5-Affecter Professeur")
                  System.out.println("6-Lister Professeur")
                  System.out.println("7-Quitter")
                  System.out.println("Entrer libelle classe");
                    choix=clavier.nextLine;
                  
                  swich(choix){

                    case "1":
         
                    System.out.println("Entrer libelle classe");
                    String libelle=clavier.nextLine();
                    Classe cl=new Classe();
                    cl.setLibelle(libelle);

                    service.ajouterClasse(cl);
                    
                    break;
                    case "2":
                    System.out.println("-------------########-------------");
                    service.listerClasse();
                    System.out.println("-------------########-------------");
                    break;



                      }

             }while (choix!="7")
}