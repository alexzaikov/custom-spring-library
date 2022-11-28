package custom.spring.library;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootConfiguration
@ComponentScan
@EnableAspectJAutoProxy
@Slf4j
public class CustomLibraryConfiguration {
    CustomLibraryConfiguration() {
        log.info("CustomSpringLibrary loaded");
    }
}
