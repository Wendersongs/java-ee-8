package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.time.LocalDateTime;


@RequestScoped
public class RequestBean implements Serializable {
    private static Integer contador=0;

    public RequestBean (){
        contador++;
    }

    public String getContador () {
        return contador.toString();
    }

    @PostConstruct
    private void watchNascimento () {
        System.out.println("RequestBean: Fui criado!" + LocalDateTime.now());
    }

    @PreDestroy
    private void watchMorte () {
        System.out.println("RequestBean: Morrendo..." + LocalDateTime.now());
    }
}
