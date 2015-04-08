package theuniversalgraph.api
import groovy.json.JsonSlurper
import spock.lang.Shared
import theuniversalgraph.utils.TestUtils

import static com.jayway.restassured.RestAssured.get
import static com.jayway.restassured.RestAssured.with
import static com.jayway.restassured.http.ContentType.JSON
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class NodeApiTest extends AbstractTest {

    @Shared
    def globals = [:]

    def "should create node"() {
        setup:
        def request = TestUtils.parseJsonFromFile('node.json')

        when:
        def response = with().contentType(JSON).body(request).when().post(API_VERSION)
        def responseAsJson = new JsonSlurper().parseText(response.asString())
        globals.createdNode = responseAsJson

        then:
        assertEquals(response.statusCode, 201)
        assertNotNull(responseAsJson.id)
    }

    def "should get node by id"(){
        when:
        def response = get(API_VERSION + globals.createdNode.id)
        def responseAsJson = new JsonSlurper().parseText(response.asString())

        then:
        assertEquals(response.statusCode, 200)
        assertEquals(globals.createdNode.id, responseAsJson.id)
    }

}
