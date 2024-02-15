package org.chrisferdev.hibernateapp;

import jakarta.persistence.EntityManager;
import org.chrisferdev.hibernateapp.entity.Cliente;
import org.chrisferdev.hibernateapp.util.JpaUtil;

public class HibernateFetchLazyOneToManyJoinFetch {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        Cliente cliente = em.createQuery("SELECT c FROM Cliente c LEFT JOIN FETCH c.direcciones LEFT JOIN FETCH c.detalle WHERE c.id=:id",Cliente.class)
                .setParameter("id", 1L)
                .getSingleResult();
        System.out.println(cliente.getNombre() + ", direcciones: " + cliente.getDirecciones());
        System.out.println(cliente.getNombre() + ", direcciones: " + cliente.getDetalle());
        em.close();
    }
}
