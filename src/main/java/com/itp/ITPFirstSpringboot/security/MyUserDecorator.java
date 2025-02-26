package com.itp.ITPFirstSpringboot.security;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.itp.ITPFirstSpringboot.entity.Role;
import com.itp.ITPFirstSpringboot.entity.User;

public class MyUserDecorator implements UserDetails {

	User user;
	public MyUserDecorator(User user)
	{
		this.user=user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roles = user.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
         
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRolename()));
        }
         
        return authorities;

	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		LocalDate todaysDate=LocalDate.now();
		LocalDate accountExpiryDate=user.getAccountExpiryDate();
		if(accountExpiryDate.isAfter(todaysDate))
			return true;
		else
			return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		int lockedStatus=user.getAccountLockedStatus();
		if(lockedStatus==1)
		return true;
		else
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		LocalDate todaysDate=LocalDate.now();
		LocalDate credExpiryDate=user.getCredentialExpiryDate();
		if(credExpiryDate.isAfter(todaysDate))
			return true;
		else
			return false;
	}

	@Override
	public boolean isEnabled() {
		int enabledStatus=user.getAccountEnabledStatus();
		if(enabledStatus==1)
		return true;
		else
		return false;
	}

}
