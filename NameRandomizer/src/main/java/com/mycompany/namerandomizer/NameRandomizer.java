/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namerandomizer;

/**
 *
 * @author Students Account
 */

import java.util.ArrayList;
import java.util.Random;

public class NameRandomizer {

    public static void main(String[] args) {
        // first name list
        ArrayList<String> firstNames = new ArrayList<>();
        firstNames.add("Alice");
        firstNames.add("John");
        firstNames.add("Emma");
        firstNames.add("Liam");
        firstNames.add("Sophia");
        firstNames.add("Mary");
        firstNames.add("Maria");
        firstNames.add("Jocelyn");
        firstNames.add("Teresita");
        firstNames.add("Maricel");
        firstNames.add("Evelyn");
        firstNames.add("Josephine");
        firstNames.add("Marilyn");
        firstNames.add("Rowena");
        firstNames.add("Erlinda");
        firstNames.add("John");
        firstNames.add("Jose");
        firstNames.add("Mark");
        firstNames.add("Micheal");
        firstNames.add("Jose");
        firstNames.add("Mark");
        firstNames.add("Joel");
        firstNames.add("Romeo");
        firstNames.add("Antonio");
        firstNames.add("Reynaldo");
        firstNames.add("Rolando");
        firstNames.add("Danilo");
        firstNames.add("Angel");
        firstNames.add("Angelica");
        firstNames.add(" Nicole");
        firstNames.add("Angelo");
        firstNames.add("MaryJoy");
        firstNames.add("Mariel");
        firstNames.add("Delchi");
        firstNames.add("Jasmine");
        firstNames.add("Mary Grace");
        firstNames.add("Kimberly");
        firstNames.add("Stephanie");
        firstNames.add("Joshua");
        firstNames.add("John Paul");
        firstNames.add("Christian");
        firstNames.add("Justine");
        firstNames.add("John Mark");
        firstNames.add("John Lloyd");
        firstNames.add("Jerome");
        firstNames.add("Angelo");
        firstNames.add("Nikko");
        firstNames.add("Rhy");
        firstNames.add("Ken");
        
        
        
        
        
        

        // last name
        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Smith");
        lastNames.add("Velasco");
        lastNames.add("Miranda");
        lastNames.add("David");
        lastNames.add("dela Cruz");
        lastNames.add("Garcia");
        lastNames.add("Ramos");
        lastNames.add("Mendoza");
        lastNames.add("Santos");
        lastNames.add("Flores");
        lastNames.add("Gonzales");
        lastNames.add("Bautista");
        lastNames.add("Villanueva");
        lastNames.add("Fernandez");
        lastNames.add("Cruz");
        lastNames.add("de Gusman");
        lastNames.add("Lopez");
        lastNames.add("Perez");
        lastNames.add("Castillo");
        lastNames.add("Francisco");
        lastNames.add("Rivera");
        lastNames.add("Aquino");
        lastNames.add("Castro");
        lastNames.add("Sanchez");
        lastNames.add("Torres");
        lastNames.add("de Leon");
        lastNames.add("Domingo");
        lastNames.add("Martinez");
        lastNames.add("Rodriguez");
        lastNames.add("Santiago");
        lastNames.add("Soriano");
        lastNames.add("delos Santos");
        lastNames.add("Diaz");
        lastNames.add("Hernandez");
        lastNames.add("Tolentino");
        lastNames.add("Valdez");
        lastNames.add("Ramirez");
        lastNames.add("Morales");
        lastNames.add("Mercado");
        lastNames.add("Tan");
        lastNames.add("Aguilar");
        lastNames.add("Navarro");
        lastNames.add("Manalo");
        lastNames.add("Gomez");
        lastNames.add("Dizon");
        lastNames.add("del Rosario");
        lastNames.add("Javier");
        lastNames.add("Corpuz");
        lastNames.add("Gutierrez");
        lastNames.add("Salvador");
     
        
        
        
        
        
        
        

        // Generate
        Random random = new Random();
        String randomFirstName = firstNames.get(random.nextInt(firstNames.size()));
        String randomLastName = lastNames.get(random.nextInt(lastNames.size()));

 
        String fullName = randomFirstName + " " + randomLastName;
        System.out.println("Random Name: " + fullName);
        
    }
}