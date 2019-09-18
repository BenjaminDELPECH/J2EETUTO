package exemple;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Random;

@Named
@RequestScoped
public class GameGrandPetit {
    public int getRandomNumber() {
        return randomNumber;
    }

    

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String indication(){
        if(givenNb > randomNumber){
            return "TropGrand";
        }else if(givenNb < randomNumber){
            return "Trop Petit";
        }else{
            return "Vous avez gagné!!";
        }
    }



    public int getGivenNb() {
        return givenNb;
    }

    public void setGivenNb(int givenNb) {
        this.givenNb = givenNb;
    }

    final int randomNumber = new Random().nextInt(100);
    int givenNb;
    String test = "tt";

}
