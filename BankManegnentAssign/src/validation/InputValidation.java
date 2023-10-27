package validation;

import java.time.LocalDate;

import com.bank.AccType;
import com.bank.Account;

import Custom_exeption.InvalidInput;



public class InputValidation {
public static AccType parshAndValidateType(String accType)throws IllegalArgumentException {
	
		return AccType.valueOf(accType.toUpperCase());
	
}
public static LocalDate parseDate(String date) throws InvalidInput {
	LocalDate openingDate = LocalDate.parse(date);
	// parsing success --> validations
	LocalDate checkDate = LocalDate.of(2000, 1, 1);
	if (openingDate.isBefore(checkDate))
		throw new InvalidInput("Manu date must be after 1st Jan 2022");
	return openingDate;
	
}
public static Account validateAllInputs(String accNo, String name, String acType, long balance, String accOpeningDate) throws InvalidInput {
	AccType validatedType = parshAndValidateType(acType);
	
	LocalDate date = parseDate(accOpeningDate);
	return new Account(accNo,name,validatedType,balance, date);
}





}
