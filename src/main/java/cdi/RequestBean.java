package cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;


@RequestScoped
public class RequestBean implements Serializable {
    public static int contador=0;

    public RequestBean (){
        contador++;
    }
}
