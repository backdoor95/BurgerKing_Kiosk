package kr.ac.burgerking.kiosk;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BurgerkingRepository {
    @PersistenceContext
    EntityManager em;

    public Long save(BurgerkingMember member)
    {
        em.persist(member);
        return member.getId();
    }

    public BurgerkingMember find(Long id)
    {
        return em.find(BurgerkingMember.class, id);
    }
}
