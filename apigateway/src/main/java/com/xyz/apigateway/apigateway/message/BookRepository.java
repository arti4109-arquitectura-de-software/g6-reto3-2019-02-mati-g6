package com.xyz.apigateway.apigateway.message;


import org.springframework.data.repository.CrudRepository;

import com.xyz.apigateway.apigateway.parser.MetaClient;

import java.util.List;

public interface BookRepository extends CrudRepository<MetaClient, Long> {

   //1 List<MetaClient> buscarNombre(String nombre);

}