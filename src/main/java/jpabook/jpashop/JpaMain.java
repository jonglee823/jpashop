package jpabook.jpashop;

import jpabook.jpashop.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //CODE
        try{
//            Member member1 = new Member("jonghyeok", "seoul", "chung1", "123-456");
//
//            em.persist(member1);
//
//            Member member2 = new Member("sh", "seoul", "chung2", "777-456");
//            em.persist(member2);
//
//            Delivery delivery1 = new Delivery("seoul", "chung2", "777-456", DeliveryStatus.ACCEPT);
//            em.persist(delivery1);
//
//            Order order1 = new Order(member1, delivery1, OrderStatus.ORDER);
//            em.persist(order1);
//
//            em.flush();
//            em.clear();
//
//            Order findOrder = em.find(Order.class, order1.getId());
//            Delivery findDelivery = em.find(Delivery.class, delivery1.getId());
//
//            System.out.println("===== before =====");
//            System.out.println("fingetStatus(dOrder.getId() : " + findOrder.getId());
//            System.out.println("findOrder.getStatus() : " + findOrder.getStatus());
//            System.out.println("findDelivery.getOrder().getId() : " + findDelivery.getOrder().getId());
//            System.out.println("findDelivery.getOrder().getStatus() : " + findDelivery.getOrder().getStatus());
//
//            System.out.println("===== chagngevalue =====");
//            findOrder.setStatus(OrderStatus.CANCEL);
//
//            System.out.println("after findDelivery.getOrder().getId() : " + findDelivery.getOrder().getId());
//            System.out.println("after findDelivery.getOrder().getStatus() : " + findDelivery.getOrder().getStatus());



            tx.commit();
        } catch(
        Exception e)
        {
            e.getStackTrace();
            tx.rollback();
        }finally

        {
            em.close();
        }
        emf.close();
    }
}
