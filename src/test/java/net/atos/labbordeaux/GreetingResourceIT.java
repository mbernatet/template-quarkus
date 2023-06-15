package net.atos.labbordeaux;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.junit.jupiter.api.Test;

@QuarkusIntegrationTest
public class GreetingResourceIT extends GreetingResourceTest {
    // Execute the same tests but in packaged mode.


    @Test
    public void testFailed() {
        throw new RuntimeException("mspldfkmsdlfk");
    }
}
