package cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.Serializable;


@ApplicationScoped
public class ApplicationBean implements Serializable {
    public static int contador=0;

    public ApplicationBean (){
        contador++;
    }
}

