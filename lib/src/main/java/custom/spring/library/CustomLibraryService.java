package custom.spring.library;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomLibraryService {

    @LogExecutionTime
    public void printSome(String val) {
        System.out.println("!!! + " + val);
    }
}
