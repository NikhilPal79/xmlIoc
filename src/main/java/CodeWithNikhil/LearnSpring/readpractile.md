# create database connection manually [done][still need to mention two things in properties file]
else create a appConfig
create a method
@Bean
public DataSource datasource(){
new DataSourceBuilder.create().url(""").username().password().build.var
return ;
}
1. spring.h2.console.enabled=true
2. spring.h2.console.path=/h2-console
# create database connection based on properties files [need to mention4 things in properties file]
1. spring.h2.console.enabled=true
2. spring.h2.console.path=/h2-console
3. spring.datasource.url=
4. spring.datasource.username=
5. spring.datasource.password=


# FETCH DATA MANUALLY FROM DATA SOURCE 

1. make interface with queryConstant
2. Dao [make method]
3. service [make a method in which call the dao method ]
4. application page [call service method ]