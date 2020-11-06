package com.hhodzhov.gateway;

import com.hhodzhov.gateway.model.Currency;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class FixerIoCustomRepository {

    @PersistenceContext
    private EntityManager em;

    public void persist(Currency currency) {
        //TODO :: check NullPointer here
        Session session = em.unwrap(Session.class);
        session.persist(currency);
        session.flush();
        session.clear();
    }
}
