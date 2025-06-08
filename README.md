# README

## Tuts Projects
- Spring REST (MVC, WebFlux)
- Spring GraphQL
- Spring Data JPA
- Spring Data R2DBC
- Spring Data MongoDB
- Spring Data Cassandra
- Spring Data Envers
- Spring Data Neo4j
- Spring Security, OAuth 2.0
- Spring Batch
- Spring Integration
- Spring AMQP
- Spring for Kafka
- Spring Cloud
- Spring Modulith
- Spring Shell / CLI
- Spring AI

## Adapted Ideas
- Project PetClinic
- Project BookShop
- Project Tutorials from Baeldung

## starters Projects

Spring Boot provides a comprehensive set of official starter dependencies to streamline the development of various types of applications. These starters bundle commonly used dependencies, allowing developers to get started quickly without manually specifying each library. Here’s an organized list of the current official Spring Boot starters:

### ✅ Core Starter
- spring-boot-starter: The primary starter, including auto-configuration support, logging, and YAML configuration. ￼

### 🌐 Web and API Starters
- spring-boot-starter-web: For building web applications, including RESTful services, using Spring MVC. Uses Tomcat as the default embedded container.
- spring-boot-starter-webflux: For building reactive web applications using Spring WebFlux.
- spring-boot-starter-websocket: For building WebSocket applications.
- spring-boot-starter-jersey: An alternative to Spring MVC, using JAX-RS and Jersey.
- spring-boot-starter-rsocket: For building RSocket clients and servers.
- spring-boot-starter-graphql: For building GraphQL applications with Spring GraphQL.
- spring-boot-starter-web-services: For using Spring Web Services. ￼ ￼

### 🛠️ Data Access Starters
- spring-boot-starter-data-jpa: For using Spring Data JPA with Hibernate.
- spring-boot-starter-data-jdbc: For using Spring Data JDBC.
- spring-boot-starter-data-rest: For exposing Spring Data repositories over REST.
- spring-boot-starter-data-mongodb: For using MongoDB with Spring Data MongoDB.
- spring-boot-starter-data-mongodb-reactive: For using MongoDB with Spring Data MongoDB Reactive.
- spring-boot-starter-data-cassandra: For using Cassandra with Spring Data Cassandra.
- spring-boot-starter-data-cassandra-reactive: For using Cassandra with Spring Data Cassandra Reactive.
- spring-boot-starter-data-redis: For using Redis with Spring Data Redis and the Lettuce client.
- spring-boot-starter-data-redis-reactive: For using Redis with Spring Data Redis Reactive and the Lettuce client.
- spring-boot-starter-data-elasticsearch: For using Elasticsearch with Spring Data Elasticsearch.
- spring-boot-starter-data-neo4j: For using Neo4j with Spring Data Neo4j.
- spring-boot-starter-data-ldap: For using LDAP with Spring Data LDAP.
- spring-boot-starter-data-r2dbc: For using reactive relational database connectivity with Spring Data R2DBC.
- spring-boot-starter-jooq: For using jOOQ to access SQL databases. ￼ ￼

### 🔐 Security and Authentication Starters
- spring-boot-starter-security: For using Spring Security.
- spring-boot-starter-oauth2-client: For using Spring Security’s OAuth2/OpenID Connect client features.
- spring-boot-starter-oauth2-resource-server: For using Spring Security’s OAuth2 resource server features.
- spring-boot-starter-oauth2-authorization-server: For using Spring Authorization Server features. ￼ ￼

### 📧 Messaging and Integration Starters
- spring-boot-starter-activemq: For JMS messaging using Apache ActiveMQ.
- spring-boot-starter-amqp: For using Spring AMQP and RabbitMQ.
- spring-boot-starter-artemis: For JMS messaging using Apache Artemis.
- spring-boot-starter-integration: For using Spring Integration.
- spring-boot-starter-mail: For using Java Mail and Spring Framework’s email sending support.
- spring-boot-starter-pulsar: For using Spring for Apache Pulsar.
- spring-boot-starter-pulsar-reactive: For using Spring for Apache Pulsar Reactive. ￼

### 🖥️ View Template Starters
- spring-boot-starter-thymeleaf: For building MVC web applications using Thymeleaf views.
- spring-boot-starter-freemarker: For building MVC web applications using FreeMarker views.
- spring-boot-starter-mustache: For building web applications using Mustache views.
- spring-boot-starter-groovy-templates: For building MVC web applications using Groovy Templates views. ￼ ￼

### 📊 Monitoring and Management Starters
- spring-boot-starter-actuator: For using Spring Boot’s Actuator, which provides production-ready features to help you monitor and manage your application. ￼

### 🧪 Testing Starter
- spring-boot-starter-test: For testing Spring Boot applications with libraries including JUnit Jupiter, Hamcrest, and Mockito. ￼

### ⚙️ Technical Starters
- spring-boot-starter-aop: For aspect-oriented programming with Spring AOP and AspectJ.
- spring-boot-starter-batch: For using Spring Batch.
- spring-boot-starter-cache: For using Spring Framework’s caching support.
- spring-boot-starter-jdbc: For using JDBC with the HikariCP connection pool.
- spring-boot-starter-quartz: For using the Quartz scheduler.
- spring-boot-starter-validation: For using Java Bean Validation with Hibernate Validator.
- spring-boot-starter-hateoas: For building hypermedia-based RESTful web applications with Spring MVC and Spring HATEOAS.
- spring-boot-starter-json: For reading and writing JSON. ￼ ￼ ￼

### 🖥️ Embedded Server Starters
- spring-boot-starter-tomcat: Default servlet container starter used by spring-boot-starter-web.
- spring-boot-starter-jetty: An alternative to Tomcat.
- spring-boot-starter-undertow: Another alternative to Tomcat.
- spring-boot-starter-reactor-netty: For using Reactor Netty as the embedded reactive HTTP server. ￼ ￼

## Spring REST MVC
- Spring Boot: 'starter' dependencies, production-ready features (metrics, health checks, externalized configuration)
- Core technologies: dependency injection, events, resources, i18n, validation, data binding, type conversion, SpEL, AOP
- Testing: mock objects, TestContext framework, Spring MVC Test, WebTestClient
- Integration: remoting, JMS, JCA, JMX, email, tasks, scheduling, cache and observability

### Spring App Configuration
- Properties and Configuration: https://docs.spring.io/spring-boot/how-to/properties-and-configuration.html
- Externalized Configuration: https://docs.spring.io/spring-boot/reference/features/external-config.html
- Resources: https://docs.spring.io/spring-framework/reference/core/resources.html
- Using the Plugin: https://docs.spring.io/spring-boot/maven-plugin/using.html

### Profiles
- https://docs.spring.io/spring-boot/reference/features/profiles.html

### Auto-configuration and Troubleshooting
- https://docs.spring.io/spring-boot/reference/features/developing-auto-configuration.html

### Spring MVC
- https://docs.spring.io/spring-boot/how-to/spring-mvc.html

### Spring Beans and Dependency Injection

## Spring REST WebFlux

## Spring Data JPA
- Data access: transactions, DAO support, JDBC, ORM, Marshalling XML