package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDateTime;


@SessionScoped
public class SessionBean implements Serializable {
    private static Integer contador=0;

    public SessionBean (){
        contador++;
    }

    public String getContador () {
        return contador.toString();
    }

    @PostConstruct
    private void watchNascimento () {
        System.out.println("SessionBean: Fui criado!" + LocalDateTime.now());
    }

    @PreDestroy
    private void watchMorte () {
        System.out.println("SessionBean: Morrendo..." + LocalDateTime.now());
    }
}
