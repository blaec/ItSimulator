package org.itsimulator.germes.app.infra.exception.flow;

import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;

import org.itsimulator.germes.app.infra.exception.FlowException;

/**
 * {@link ValidationException} is raised when attribute values of the object
 * model violates business rules or restrictions
 * 
 * @author Morenets
 *
 */
public class ValidationException extends FlowException {
	private static final long serialVersionUID = 6858621613562789296L;

	public <T> ValidationException(String message, Set<ConstraintViolation<T>> constraints) {
		super(message + ":"
				+ constraints.stream().map(constraint -> constraint.getPropertyPath() + ":" + constraint.getMessage())
						.collect(Collectors.joining(",")));
	}

}
