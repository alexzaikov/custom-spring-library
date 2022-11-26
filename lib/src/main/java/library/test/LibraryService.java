package library.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LibraryService {

    @LogExecutionTime
    public void printSome(String val) {
        System.out.println("!!! + " + val);
    }
}
