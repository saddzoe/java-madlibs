# java-madlibs
// This is a simple java madlibs program from codecademy

public class MadLibs {
  /*
  This is a program about a mad libbed story
  Author: Mohammed
  Date: 5/12/2021
  */
  	public static void main(String[] args){

      String name1 = "Saint Pier";
      String adjective1 = "big";
      String adjective2 = "fast";
      String adjective3 = "hard";
      String verb1 = "run";
      String noun1 = "Johnny";
      String noun2 = "car";
      String noun3 = "church";
      String noun4 = "home";
      String noun5 = "garage";
      String noun6 = "ball";
      String name2 = "Timmy Turner";
      int number = 2446;
      String place1 = "museum";

      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}

