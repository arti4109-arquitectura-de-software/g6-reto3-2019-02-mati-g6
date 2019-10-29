package com.xyz.client.Client.reciever.reader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonSchemaReader {
    static Map<String, JsonNode> elementsMap = new HashMap<>();

    public static void Execute(File file) {
        JsonNode root = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            root = mapper.readTree(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonNode rootNode = root.path("properties");
        FillTheElementMap(rootNode);
    }

    private static void FillTheElementMap(JsonNode rootNode) {
        for (JsonNode cNode : rootNode) {
            if (cNode.path("type").toString().toLowerCase().contains("array")) {
                for (JsonNode ccNode : cNode.path("items")) {
                    FillTheElementMap(ccNode);
                }
            } else if (cNode.path("type").toString().toLowerCase().contains("object")) {
                FillTheElementMap(cNode.path("properties"));
            } else {
                elementsMap.put(cNode.path("id").asText(), cNode);
            }
        }
    }
}
