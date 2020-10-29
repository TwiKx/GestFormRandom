package service;

import java.util.ArrayList;
import java.util.Random;


public class RandomInRange {
	
    ArrayList<String> listStrg = new ArrayList<String>();

    public ArrayList<String> getListInt(Integer listSize) {
        try {
            for (int i=0; i < listSize; i++){
                Random r = new Random();
                int newEntry = r.nextInt((1000 - (-1000)) + 1 ) - 1000;
                if (newEntry % 3 == 0 && newEntry % 5 == 0){
                    this.listStrg.add("Gestform : " + Integer.toString(newEntry));
                }
                else if (newEntry % 3 == 0){
                    this.listStrg.add("Geste : " + Integer.toString(newEntry));
                }
                else if (newEntry % 5 == 0){
                    this.listStrg.add("Forme : " + Integer.toString(newEntry));
                }
                else {
                    this.listStrg.add(Integer.toString(newEntry));
                }
            }
        } catch (Exception e){
            System.out.println("Woops someting went wrong : " + e);
        }

        return this.listStrg;
    }
    
}
