package brainstorming.with.alok.CustomAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ProcessTheAnnotation {

	public static void main(String[] args) {
		Class annotation=SampleClassForAnnotation.class;
	
		for(Constructor cons:annotation.getConstructors()) {
			if(cons.isAnnotationPresent(AnnotationForConstructor.class)) {
				AnnotationForConstructor annotationForClass=(AnnotationForConstructor) cons.getAnnotation(AnnotationForConstructor.class);
				System.out.println(annotationForClass.name());
			}
		}
		
		for(Method method:annotation.getMethods()) {
			if(method.isAnnotationPresent(AnnotationForMethod.class)) {
				AnnotationForMethod annotationForMethod=method.getAnnotation(AnnotationForMethod.class);
				System.out.println(annotationForMethod.name());
			}
		}

	}

}
