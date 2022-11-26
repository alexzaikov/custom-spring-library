/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package library.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class LibraryTests {

    @Autowired
    LibraryService libraryService;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void someTest() {
        LibraryService libraryService1 = (LibraryService) applicationContext.getBean("libraryService");
        libraryService1.printSome("!!!");
        doSome();
        libraryService.printSome("dfssf");
    }

    @LogExecutionTime
    private void doSome() {

    }
}
