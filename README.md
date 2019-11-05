# g6-reto3-2019-02-mati-g6
g6-reto3-2019-02-mati-g6 created by GitHub Classroom

# Reto 3 (Flexibilidad e interoperabilidad)

## Prueba de Flexibilidad

Prueba de cambio de formato entre sintaxis de la empresa y el canónico.
 - *spring-boot-zuul-gateway-proxy* : coniene el api gateway para exponer el servicio del translator.
 - *client_translator* : Contiene el servicio de transformar los diferentes tipos de clientes en los formatos  que cada empresa tenga y los envia transformados al leguaje canónico al RabbitMQ

## Prueba de Interoperabilidad

Prueba que permite leer mensajes en Soap y convertirlos a un lengujae canonico. A su vez tiene otro micro que permite escribir mensajes en rest con Json.  Y por ultimo existe otro servicio que lee todo lo publicado en lenguaje canonico.
 - *Apí Gateway* : coniene los 3 servicios descritos con anterioridad, este entrega los mensajes al Rabbit MQ y ahi un cliente que esta leyendo y almacenando en memoria estos mensajes. 
 
