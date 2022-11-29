package custom.spring.library;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomLibraryService {

    @Value("${custom.library.value}")
    private String propertyValue;

    @LogExecutionTime
    public void printSome(String val) {
        System.out.println(String.format("!!! %s %s", propertyValue, val));
    }
}
