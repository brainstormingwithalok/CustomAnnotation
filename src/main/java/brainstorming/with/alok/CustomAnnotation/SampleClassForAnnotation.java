package brainstorming.with.alok.CustomAnnotation;


public class SampleClassForAnnotation {

	private int id;
	@AnnotationForConstructor(name="This is constructor")
	public SampleClassForAnnotation(int id) {
		this.id=id;
	}
	
	@AnnotationForMethod(name="This is method")
	public void getName() {
		
	}
}
