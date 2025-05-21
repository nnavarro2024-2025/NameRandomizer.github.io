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
        //firstNameIndex
        int firstNameIndex = random.nextInt(firstNames.size());
        int firstNameIndex2 = random.nextInt(firstNames.size());
        int firstNameIndex3 = random.nextInt(firstNames.size());
        int firstNameIndex4 = random.nextInt(firstNames.size());
        int firstNameIndex5 = random.nextInt(firstNames.size());
        
        //lastNameIndex
        int lastNameIndex = random.nextInt(lastNames.size());
        int lastNameIndex2 = random.nextInt(lastNames.size());
        int lastNameIndex3 = random.nextInt(lastNames.size());
        int lastNameIndex4 = random.nextInt(lastNames.size());
        int lastNameIndex5 = random.nextInt(lastNames.size());
        
        
        String randomFirstName = firstNames.get(firstNameIndex); 
        String randomFirstName2 = firstNames.get(firstNameIndex2); 
        String randomFirstName3 = firstNames.get(firstNameIndex3); 
        String randomFirstName4 = firstNames.get(firstNameIndex4); 
        String randomFirstName5 = firstNames.get(firstNameIndex5); 
        
        
        String randomLastName = lastNames.get(lastNameIndex);
        String randomLastName2 = lastNames.get(lastNameIndex2);
        String randomLastName3 = lastNames.get(lastNameIndex3);
        String randomLastName4 = lastNames.get(lastNameIndex4);
        String randomLastName5 = lastNames.get(lastNameIndex5);
      
        
        //firstName Remove after selected
        firstNames.remove(firstNameIndex);
        firstNames.remove(firstNameIndex2);
        firstNames.remove(firstNameIndex3);
        firstNames.remove(firstNameIndex4);
        firstNames.remove(firstNameIndex5);
        
        
        
        //lastName Remove after selected
        lastNames.remove(lastNameIndex);
        lastNames.remove(lastNameIndex2);
        lastNames.remove(lastNameIndex3);
        lastNames.remove(lastNameIndex4);
        lastNames.remove(lastNameIndex5);

 
        String fullName = randomFirstName + " " + randomLastName;
        String fullName2 = randomFirstName2 + " " + randomLastName2;
        String fullName3 = randomFirstName3 + " " + randomLastName3;
        String fullName4 = randomFirstName4 + " " + randomLastName4;
        String fullName5 = randomFirstName5 + " " + randomLastName5;
        
        System.out.println("Random Name 1: " + fullName);
        System.out.println("Random Name 2: " + fullName2);
        System.out.println("Random Name 3: " + fullName3);
        System.out.println("Random Name 4: " + fullName4);
        System.out.println("Random Name 5: " + fullName5);

        
    }
}