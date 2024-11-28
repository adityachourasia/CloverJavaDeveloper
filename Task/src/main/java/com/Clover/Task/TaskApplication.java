package com.Clover.Task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}

    
}
@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
		System.out.println("Ajay Application is running");
		 
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();

        
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        
        User user = new User();
        user.setName("John Doe");
        session.save(user);

        session.getTransaction().commit();
        session.close();
	}

}

