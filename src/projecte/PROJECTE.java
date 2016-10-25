/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.awt.Image;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PROJECTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner entrada = new Scanner(System.in);
        
       
        
        
        System.out.println("1.Veure festivals");    
        System.out.println("2.Afegir festivals");
        System.out.println("3.Borrar festivals");
        System.out.println("4.Modificar festivals");
        System.out.println("5.Sortir de l'aplicació");
    
    int opcio = 0;
    boolean animalsPermesos = false;
    double preuEntrada = 0.0;
    String comunitat = null;
    String zona = null;
    int num = 0;
                //var imatge =" ";
    
    switch (opcio=entrada.nextInt()) {
        
            case 1:
                
//                 comunitat = entrada.next();
                
                System.out.println("1.Veure festivals");
                    
                
                    System.out.println("Si vols veure sol els de una Comunitat Autònoma, escolleix:");
                        System.out.println("1.Andalusia");
                        System.out.println("2.Catalunya");
                        System.out.println("3.Comunitat de Madrid");
                        System.out.println("4.País Valencià");
                        System.out.println("5.Galícia");
                        System.out.println("6.País Basc");
                        System.out.println("7.Castella i Lleó");
                        System.out.println("8.Castella - La Manxa");
                        System.out.println("9.Illes Canaries");
                        System.out.println("10.Regió de Murcia");
                        System.out.println("11.Aragó");
                        System.out.println("12.Illes Balears");
                        System.out.println("13.Extremadura");
                        System.out.println("14.Principat d'Astúries");
                        System.out.println("15.Navarra");
                        System.out.println("16.Cantabria");
                        System.out.println("17.La Rioja");
                   
                    int comu=entrada.nextInt();   
                            switch (comu) {
                                    
                                     
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        break;
                                    case 7:
                                        break;    
                                    case 8:
                                        break;
                                    case 9:
                                        break;
                                    case 10:
                                        break;
                                    case 11:
                                        break;
                                    case 12:
                                        break;
                                    case 13:
                                        break;
                                    case 14:
                                        break;
                                    case 15:
                                        break;
                                    case 16:
                                        break;    
                                    case 17:
                                        break;
                                                    
                            }
                     
                            
            case 2:
                System.out.println("2.Afegir festivals");
                //camps festival 
                    System.out.println("Afegeix el nom del festival");
                    String nomfestival;
                    System.out.println("En quina Comunitat Autònoma es fa?");
                    comunitat=entrada.next();
                    System.out.println("Saps l'adreça exacta? (zona o carrer i nº)");
                    zona = entrada.next();
                    num = entrada.nextInt();
                    
                    double preuentrada;
                 
                break;
            case 3:
                System.out.println("3.Borrar festivals");
                break;
            case 4:
                System.out.println("4.Modificar festivals");
                break;
            case 5:
                System.out.println("5.Sortir de l'aplicació");
                break;
            
            default:
                System.out.println("");
    
    
    
    }
    
    }
    
}

//string  - double/float - var/int - boolean - char(opcional)
//festival: String

//comunitat: String 

//Adreça -> zona: String / num: int

//preuEntrada: double

//Data Festival -> dia: int / mes: String / any: int

//animalsPermesos: boolean-