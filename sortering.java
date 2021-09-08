//Kigger igennem alle talene og husk det tal med lavest værdi
//Byt tallets plads med den første plads i listen
//hvis der er flere tal i ræsten af listen
//Kigger igennem alle talene og husk det tal med lavest værdi
//Placere tallet på den næste plads
//gentag fra 3


public class sortering{

  public static void main(String[] args){
    int[] tal = {9,27,4,32,21,16,38,3,11,25,1,39,2,13,15};
    int lavPladsNr, lavPlads;

    for (int t = 0 ; t <tal.length ; t++) {
      lavPladsNr = tal[t];
      lavPlads = t;
      for(int i = t ; i <tal.length ; i++){
        if(lavPladsNr > tal[i]){
          lavPladsNr = tal[i];
          lavPlads = i;
        }
      }
      tal[lavPlads] = tal[t];
      tal[t] = lavPladsNr;
      System.out.println(tal[t]);
    }
  }
}
