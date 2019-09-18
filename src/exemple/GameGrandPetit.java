package exemple;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Random;


@ManagedBean
@SessionScoped
public class GameGrandPetit {
   private int randomNumber;

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    private String help;
    private int nb;

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public GameGrandPetit() {
        this.randomNumber = new Random().nextInt(100);
    }

    public void helpPlayer(){
        if(nb < randomNumber){
            help =  "Trop petit";
        }else if(nb > randomNumber){
            help = "Trop Grand";
        }else if(nb == randomNumber){
            help =  "BRAVO";
        }else{
            help = "rentrez un nombre valide";
        }

    }


    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
}
