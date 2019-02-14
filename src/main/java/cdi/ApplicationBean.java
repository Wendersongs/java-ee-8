package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.time.LocalDateTime;


@ApplicationScoped
public class ApplicationBean implements Serializable {
    private static Integer contador=0;

    public ApplicationBean (){
        contador++;
    }

    public String getContador () {
        return contador.toString();
    }

    @PostConstruct
    private void watchNascimento () {
        System.out.println("ApplicationBean: Fui criado!" + LocalDateTime.now());
    }

    @PreDestroy
    private void watchMorte () {
        System.out.println("ApplicationBean: Morrendo..." + LocalDateTime.now());
    }
}

