package br.org.spcbrasil.prova.persistence.db.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/*
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "br.org.spcbrasil.prova.persistence.db.entity", entityManagerFactoryRef = "dbEntityManagerFactory", transactionManagerRef = "dbTransactionManager")
public abstract class DBDataSource {

    @Bean
    @Primary
    PlatformTransactionManager dbTransactionManager() {
        return new JpaTransactionManager(dbEntityManagerFactory().getObject());
    }

    @Bean
    @Primary
    abstract LocalContainerEntityManagerFactoryBean dbEntityManagerFactory();


    @Bean
    @Primary
    @ConfigurationProperties(prefix = "db.datasource")
    public DataSource dbDataSource() {
        return DataSourceBuilder.create().build();
    }

}
*/