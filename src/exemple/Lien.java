package exemple;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Lien {
    public String lelien(){
        return "lien";
    }
}
