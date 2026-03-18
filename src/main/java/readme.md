# SPRING [Spring Framework is a Java application framework that provides infrastructure support for building enterprise Java applications]
# SPRING BOOT [Spring Boot is built **ON TOP of Spring Framework]

# Difference BETWEEN THEM
Spring Framework provides core features like IOC, DI, and MVC
but requires lots of manual configuration.
Spring Boot is Spring Framework with autoconfiguration, embedded server,
and starter dependencies — so you focus on code, not setup!

# BEAN []

# LIFE CYCLE OF BEAN []

# IOC [INVERSION OF CONTROL]
1. XML [show us the exception@ run time ][bcz this file pass at the run time ]
2. @CONFIG ANNOTATION 
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

# HOMEWORK
1. XML BASED IOC IN LIST AND MAP 


