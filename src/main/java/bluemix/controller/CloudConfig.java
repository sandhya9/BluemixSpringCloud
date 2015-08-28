package bluemix.controller;

import org.springframework.cloud.app.ApplicationInstanceInfo;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.service.ServiceInfo;
import org.springframework.cloud.service.PooledServiceConnectorConfig.PoolConfig;
import org.springframework.cloud.service.relational.DataSourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.apache.log4j.Logger;
import javax.sql.DataSource;

import bluemix.service.AccountService;

@Configuration
public class CloudConfig extends AbstractCloudConfig {

  @Bean
  public DataSource cloudDataSource() {
     return connectionFactory().dataSource();
  }

  @Bean ApplicationInstanceInfo applicationInf(){
    return cloud().getApplicationInstanceInfo();
  }
}
