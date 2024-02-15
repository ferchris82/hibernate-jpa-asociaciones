package org.chrisferdev.hibernateapp;

import jakarta.persistence.EntityManager;
import org.chrisferdev.hibernateapp.entity.Cliente;
import org.chrisferdev.hibernateapp.util.JpaUtil;


import java.util.List;

public class HibernateFetchResultList {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("SELECT DISTINCT c FROM Cliente c LEFT OUTER JOIN FETCH c.direcciones LEFT OUTER JOIN FETCH c.detalle", Cliente.class).getResultList();

        clientes.forEach(c -> System.out.println(c.getNombre() + ", direcciones: " + c.getDirecciones()));
        em.close();
    }
}
