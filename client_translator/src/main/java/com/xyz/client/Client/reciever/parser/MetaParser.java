package com.xyz.client.Client.reciever.parser;

import com.xyz.client.Client.reciever.entities.Client;
import com.xyz.client.Client.reciever.entities.MetaClient;

public class MetaParser {

    public static MetaClient parseClient(Client client) {
        MetaClient metaClient = new MetaClient();
        metaClient.setNombre(client.getName());
        metaClient.setGenero(client.getGender());
        metaClient.setId(client.getIdentification());
        metaClient.setEdad(Integer.parseInt(client.getAge()));
        return metaClient;
    }

}
