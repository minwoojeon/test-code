package com.marvrus.project.conf;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Configuration
public class QueryDslConfig {
	
    @PersistenceContext(name = "entityManager")
    private EntityManager entityManager;

    @Bean(name = "jpaQueryFactory")
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }
}
