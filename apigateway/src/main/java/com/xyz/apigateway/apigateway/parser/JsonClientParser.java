package com.xyz.apigateway.apigateway.parser;

import com.xyz.apigateway.apigateway.entities.Client;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class JsonClientParser {

    public Client parseClient(String data) {

        RestTemplate restTemplate = new RestTemplate();
        String resp = restTemplate.getForObject(data, String.class);

        JsonParser springParser = JsonParserFactory.getJsonParser();
        Map<String, Object> map = springParser.parseMap(resp);

        String mapArray[] = new String[map.size()];
        System.out.println("Items found: " + mapArray.length);
        int i = 0;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            i++;
        }
        Client client = new Client("","","","");
        return client;
    }
}
