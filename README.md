**[Why the `@Transactional` annotation is being ignored](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootWhyTransactionalIsIgnored)**
 
**Description:** This application is an example of fixing the case when `@Transactional` annotation is ignored. Most of the time, this annotation is ignored in the following scenarios:

1. `@Transactional` was added to a `private`, `protected` or `package-protected` method
2. `@Transactional` was added to a method defined in the same class where it is invoked

**Key points:**
- write a helper service and move the `@Transactional` methods there
- ensure that these methods are declared as `public`
- call `@Transactional` methods from other services
     
-----------------------------------------------------------------------------------------------------------------------    
<table>
     <tr><td><b>If you need a deep dive into the performance recipes exposed in this repository then I am sure that you will love my book "Spring Boot Persistence Best Practices"</b></td><td><b>If you need a hand of tips and illustrations of 100+ Java persistence performance issues then "Java Persistence Performance Illustrated Guide" is for you.</b></td></tr>
     <tr><td>
<a href="https://www.apress.com/us/book/9781484256251"><p align="left"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Spring%20Boot%20Persistence%20Best%20Practices.jpg" height="500" width="450"/></p></a>
</td><td>
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="right"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="500" width="450"/></p></a>
</td></tr></table>

-----------------------------------------------------------------------------------------------------------------------    
# HibernateSpringBootWhyTransactionalIsIgnored
