package cdi;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@SessionScoped
public class SessionBean implements Serializable {
    public static int contador=0;

    public SessionBean (){
        contador++;
    }
}
