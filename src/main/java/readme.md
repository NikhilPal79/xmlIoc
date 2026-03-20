# SPRING [Spring Framework is a Java application framework that provides infrastructure support for building enterprise Java applications]
# SPRING BOOT [Spring Boot is built **ON TOP of Spring Framework]

# Difference BETWEEN THEM
Spring Framework provides core features like IOC, DI, and MVC
but requires lots of manual configuration.
Spring Boot is Spring Framework with autoconfiguration, embedded server,
and starter dependencies — so you focus on code, not setup!

# BEAN []

# LIFE CYCLE OF BEAN []
1. INIT ==>[this gets printed when Application context initialized ]
2. POST INIT
3. PRE DESTROY 
4. DESTROY 


# IOC [INVERSION OF CONTROL]
1. XML [show us the exception@ run time ][bcz this file pass at the run time ][OUTSIDE THE JAVA CLASS]
[pass init-method= , destroy method = , scope = ]

2. @CONFIG ANNOTATION 
[alse mention @bean annotation]
[BEAN WILL BE IN TERMS OF METHOD ]
[mehtod name will be bean name]
[not best practice bcz of lots of config packages][either you can provide specific class, base package]

3. @COMPONENT 

# APPLICATION CONTEXT [MAKES THE BEAN]

# SPRING CONTAINER [TREAT IT  LIKE  A SHELL WHERE ALL THE BEANS STAY]


# LAZY LOADING
Lazy loading creates beans only when first needed — fast startup, less memory.
First request is slow and errors caught at runtime.
Use @Lazy selectively for heavy or rarely used services!

# EAGER LOADING
Eager loading creates ALL beans at startup — slow start but fast requests, errors caught early, high memory.
Default is Eager

# APPLICATION CLOSED 

# APPLICATION KILLED 

# SPRING BOOT APPLICATION ANNOTATION consist of 3 annotation combined 
1. Component [scans for Component, Service, Repository][finds bean automatically(scanning)]
[Use when YOU own the class.Class has @Component etc.Your own services / repos Standard Spring MVC layers Most common approach]

2. EnableAutoConfiguration [triggers auto-config][creates bean manually(defining)]

3. Configuration [ marks as config class ]
[Use when You DON'T own the class Third-party libraries Custom init logic needed DataSource, RestTemplate etc.Infrastructure / config beans]

# SCOPE [SIGNLETON][PROTOTYPE][SESSION][REQUEST]

# DEPENDENCY INJECTION 

CONSTRUCTOR BASED > SETTER BASED [AUTOWIRE]

QUESTION => HOW TO CHECK HOW MANY PEOPLE LOGGED IN YOUR SYSTEM ? # SESSIONS 

# @VALUE ANNOTATION 

# SPEL- SPRING EXPRESSION LANGUAGE 
# TOMCAT 
# HIKARI POOL 
# JDBC 
# H2 

# WHAT ROW MAPPER / BEAN PROPERTY ROW MAPPER DO ?





