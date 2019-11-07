package pl.aandrzey.wh40kdb.loader;

import org.apache.commons.csv.CSVRecord;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;

public interface CSVLoader {

    void loadData();

    default Integer getInteger(CSVRecord record, String columnName, int rowNumber) {
        String value = record.get(columnName);
        if(value == null || value.isEmpty()) {
            return null;
        }
        try {
            return Integer.valueOf(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Expected number in column " + columnName + " in row " + rowNumber + " (found input: " + value + ")", e);
        }
    }

    default void validate(Object object) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> result = validator.validate(object);

        if(result.isEmpty()) {
            return;
        }

        String error = result.stream()
                .map(violation -> violation.getPropertyPath().toString() + " " + violation.getMessageTemplate() + " " + violation.getMessage())
                .collect(Collectors.joining(", "));
        throw new RuntimeException("Constraint violation: " + error);
    }
}
