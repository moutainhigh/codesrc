package com.jjb.unicorn.facility.meta;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface EnumInfo
{
	 String[] value();
}
