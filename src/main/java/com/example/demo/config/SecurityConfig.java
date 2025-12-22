@EnableWebSecurity
public class SecurityConfig {
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
http.csrf().disable()
.authorizeHttpRequests()
.requestMatchers("/auth/**", "/swagger-ui/**").permitAll()
.anyRequest().authenticated()
.and().httpBasic();
return http.build();
}
}