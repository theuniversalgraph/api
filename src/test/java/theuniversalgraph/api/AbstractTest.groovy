package theuniversalgraph.api

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification
import theuniversalgraph.api.rest.RestApplication

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = RestApplication.class)
@WebAppConfiguration
@IntegrationTest
    abstract class AbstractTest extends Specification {

    public static final String API_VERSION = "/v1/";
}
