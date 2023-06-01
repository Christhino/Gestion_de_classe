import entity.Prof;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Prof prof = new Prof();
            prof.setCodeProf(1);
            prof.setNom("Dalia");
            prof.setPrenom("Abo Sheasha");
            prof.setGrade("Enseigant");
            entityManager.merge(prof);

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
