package sam.web.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String prefix;
	
	@Override
	public void initialize(CourseCode arg0) {
		prefix = arg0.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		boolean result= false;
		if(theCode != null) {
			result = theCode.startsWith(prefix);
		}
		return result;
	}

}
