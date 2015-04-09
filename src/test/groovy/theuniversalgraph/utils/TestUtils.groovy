package groovy.theuniversalgraph.utils

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import groovy.json.JsonSlurper

class TestUtils {

    static parseJsonFromFile(String jsonName) {
        def url = TestUtils.class.getClassLoader().getResource('json/' + jsonName);
        File f = new File(url.toURI())
        return new JsonSlurper().parseText(f.getText())
    }


    static String toJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

    static Object fromJson(String response, Class<?> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response, clazz);
    }
    
}
