package com.example.Yash_5806;

@Configuration
@ComponentScan(basePackages = "com.example.Yash_5806")  
public class BeanConfig {
  @Bean
  public Doctor doctor(){
    return new Doctor();
}
