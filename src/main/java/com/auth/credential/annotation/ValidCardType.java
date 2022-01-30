//package com.auth.credential.annotation;
//
//import org.springframework.messaging.handler.annotation.Payload;
//
//import javax.validation.Constraint;
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import static java.lang.annotation.ElementType.FIELD;
//import static java.lang.annotation.ElementType.METHOD;
//import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//@Constraint(validatedBy = {ConsistentDateParameterValidator.class})
//@Documented
//@Target({ANNOTATION_TYPE, METHOD, FIELD})
//@Retention(RUNTIME)
//public @interface ValidCardType {
//    String message() default "Invalid Access Request";
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//}