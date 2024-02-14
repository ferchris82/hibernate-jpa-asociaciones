package org.chrisferdev.hibernateapp;

import jakarta.persistence.EntityManager;
import org.chrisferdev.hibernateapp.entity.Cliente;
import org.chrisferdev.hibernateapp.entity.ClienteDetalle;
import org.chrisferdev.hibernateapp.util.JpaUtil;

public class HibernateAsociacionesOneToOne {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        try {

            em.getTransaction().begin();

            Cliente cliente = new Cliente("Cata", "Edu");
            cliente.setFormaPago("paypal");
            em.persist(cliente);

            ClienteDetalle detalle = new ClienteDetalle(true, 5000L);

            em.persist(detalle);

            cliente.setDetalle(detalle);
            em.getTransaction().commit();

            System.out.println(cliente);
        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
