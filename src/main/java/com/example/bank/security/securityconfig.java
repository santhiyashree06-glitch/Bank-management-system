package com.example.bank.security;


import static org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityconfig {

@Bean
public InMemoryUserDetailsManager userdetailsservice()
{
	UserDetails user= withDefaultPasswordEncoder()
			.username("admin")
			.password("admin123")
			.roles("ADMIN")
			.build();
	return new InMemoryUserDetailsManager(user);
}
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception
{
	http
	.csrf(csrf->csrf.disable())
	.authorizeHttpRequests(auth->auth
	.anyRequest().authenticated()		
)
	.httpBasic(httpBasic->{});
	return http.build();
}
}