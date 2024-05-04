package com.accommodationbooking.annotation;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@PreAuthorize("hasRole('ROLE_ADMIN')")
public @interface AdminAccessLevel {
}
