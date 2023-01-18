package com.example.cserepesuzlet.persistency.repo;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import org.springframework.stereotype.Component;

@Component
public class MemCserepesVirag extends CserepesViragRepoInst{

    public MemCserepesVirag () {
        CserepesVirag csp1 = new CserepesVirag();
        CserepesVirag csp2 = new CserepesVirag();
        CserepesVirag csp3 = new CserepesVirag();
        CserepesVirag csp4 = new CserepesVirag();
        csp1.setId("1");
        csp2.setId("2");
        csp3.setId("3");
        csp4.setId("4");
        csp1.setName("Cserepes Azalea");
        csp2.setName("Cserepes Afrikai Ibolya");
        csp3.setName("Cserepes Fokfoldi Kankalin");
        csp4.setName("Cserepes Koszorufutoka");
        entities.add(csp1);
        entities.add(csp2);
        entities.add(csp3);
        entities.add(csp4);
    }
}
