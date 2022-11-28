package custom.spring.library;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;


@SpringBootConfiguration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:lib.properties")
@Slf4j
public class CustomLibraryConfiguration {
    CustomLibraryConfiguration() {
        log.info("CustomSpringLibrary loaded");
    }
}
