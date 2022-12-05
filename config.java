@Configuration 
@EnableSwagger2
public class SpringFoxConfig{

@Bean
  public Docket api(){
	return new Docket(DocumentationType.SWAGGER_2)
.selec()
.apis(RequestHandlerSelectors.any())
.paths(PathSelectors.any())
.Build();
}
}