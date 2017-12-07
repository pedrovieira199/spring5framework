package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String bdurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(bdurl);

        return fakeDataSource;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer sourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return sourcesPlaceholderConfigurer;
    }
}
