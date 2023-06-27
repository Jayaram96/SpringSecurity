package com.securitysec2.securitysec2;

import java.security.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

		/**
		 * Default configurations which will secure all the requests
		 */
		/*((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)http.authorizeRequests().anyRequest()).
				authenticated();
		http.formLogin();
		http.httpBasic();
		return (SecurityFilterChain)http.build();*/

		/**
		 * Custom configurations as per our requirement
		 */
		http.authorizeHttpRequests( (auth)->auth
				.requestMatchers("/account","/balance","/loan","/cards").authenticated()
				.requestMatchers("/notices","/contact").permitAll()
		).httpBasic(Customizer.withDefaults());
		return http.build();

	}
}
