
### Simple Spring project with multi modules
This is sample project created based on https://spring.io/guides/gs/multi-module/  
There are 2 modules.  
1. Library  - which has a class (StringTypeFinder.java) to find the type of strings in a given list (OOTB it provides 2 types, Empty & Text both are implementing IType interface)
2. Application - which has a webservice that invokes the method in StringTypeFinder with a list of strings.   
Also note that application module has a class PalindromeType which implements IType to detect a Palindrome string

The expected behavior is that the result should consider all the implementations of IType in a given order

### How to bootstrap

1. mkdir springmultimodule
2. cd springmultimodule
3. mkdir stringtypelib
4. mkdir application
5. touch pom.xml (for content refer pom.xml)

6. Launch any IDE to create a simple spring project and give destination springmultimodule/stringtypelib
7. Remove the spring-boot-maven-plugin from pom.xml
8. Similarly create another simple spring project and give destination springmultimodule/application
9. You have to reatin the spring-boot-maven-plugin
10. Add dependency (refer application/pom.xml here)


### Dependency Injection

1. In library module, StringTypeFinder.java, all implementations of IType is injected
2. You can implement IType in application module as well

### How application can get classes of library

There are 2 ways. See SampleApplication.java for reference

1. Use @ComponentScan
2. Use @Import  

### Problems to explore

1. How to achieve this capability without spring
