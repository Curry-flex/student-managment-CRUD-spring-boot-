package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
	@Bean
	AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return provider;
	}

	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.authenticationProvider(authProvider());
	}



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	   http
	     .authorizeRequests()
	     //.antMatchers("/delete/*").hasAuthority("ADMIN")
	    // .antMatchers("/student/add").hasAuthority("ADMIN")
	     //.antMatchers("/student/edit/*").hasAnyAuthority("ADMIN","USER")
	     .anyRequest().authenticated()
	     .and()
	     .formLogin().permitAll()
	     .and()
	     .logout().permitAll()
	     .and();
	     //.exceptionHandling().accessDeniedPage("/403");
	   
	   
	}
	
	
	

}
