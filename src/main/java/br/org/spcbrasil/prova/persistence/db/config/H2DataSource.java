package br.org.spcbrasil.prova.persistence.db.config;

/*
import br.org.spcbrasil.prova.persistence.db.config.DBDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Profile({"test"})
@Configuration
public class H2DataSource extends DBDataSource {

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean dbEntityManagerFactory() {

        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setDatabase(Database.H2);
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setShowSql(true);

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

        factoryBean.setDataSource(dbDataSource());
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("br.org.spcbrasil.prova.persistence.db.entity");
        factoryBean.setPersistenceUnitName("DB_PU");

        return factoryBean;
    }
}


 */