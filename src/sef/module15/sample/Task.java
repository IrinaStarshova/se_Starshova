package sef.module15.sample;

import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Task{
	String task();
	String date();
	String assignedTo();
}
