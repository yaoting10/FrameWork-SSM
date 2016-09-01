package com.owner.core.cfg;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.owner.core.mappers")
public class MyBatisConfig implements TransactionManagementConfigurer{

    @Value("${dataSource.driverClassName}")
    private String driver;

    @Value("${dataSource.url}")
    private String url;

    @Value("${dataSource.username}")
    private String username;

    @Value("${dataSource.password}")
    private String password;

    @Value("${connection.use.unicode}")
    private boolean useUnicode;

    @Value("${connection.character.encoding}")
    private String connectionEncoding;

    @Value("${db.pool.initial.size}")
    private int poolInitialSize;

    @Value("${db.pool.max.active}")
    private int poolMaxActive;

    @Value("${db.pool.max.idle}")
    private int poolMaxIdle;

    @Value("${db.pool.min.idle}")
    private int poolMinIdle;

    @Value("${db.pool.max.wait}")
    private int poolMaxWait;

    @Value("${db.pool.log.abandoned}")
    private boolean poolLogAbandoned;

    @Value("${db.pool.remove.abandoned}")
    private boolean poolRemoveAbandoned;

    @Value("${db.pool.remove.abandoned.timeout}")
    private int poolRemoveAbandonedTimeout;

    @Value("${db.pool.default.autocommit}")
    private boolean poolDefaultAutocommit;

    @Bean(destroyMethod = "close")
    public DataSource configureDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(poolInitialSize);
        dataSource.setMaxActive(poolMaxActive);
        dataSource.setMaxIdle(poolMaxIdle);
        dataSource.setMinIdle(poolMinIdle);
        dataSource.setMaxWait(poolMaxWait);
        dataSource.setLogAbandoned(poolLogAbandoned);
        dataSource.setRemoveAbandoned(poolRemoveAbandoned);
        dataSource.setRemoveAbandonedTimeout(poolRemoveAbandonedTimeout);
        dataSource.setDefaultAutoCommit(poolDefaultAutocommit);
        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory configSqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(configureDataSource());

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mappers/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }


    @Bean(name="transactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager(){
        return new DataSourceTransactionManager(configureDataSource());
    }

}
