package com.quiz.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig 
{
		@Bean
		public InMemoryUserDetailsManager userDetailsService()
		{
			UserDetails user = User.withDefaultPasswordEncoder()
					.username("test")
					.password("tops")
					.roles("USER")
					.build();
			return new InMemoryUserDetailsManager(user);
		}
		
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
		{
			http.authorizeHttpRequests((authz) -> authz
					.requestMatchers("/msg").authenticated()).httpBasic();
			
			return http.build();
			
		}
}
