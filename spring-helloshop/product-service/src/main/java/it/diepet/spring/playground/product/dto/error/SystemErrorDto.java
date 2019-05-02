package it.diepet.spring.playground.product.dto.error;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class SystemErrorDto implements Serializable {

	private static final long serialVersionUID = -5414167946000410074L;

	@NonNull
	String errorId;

	final String code = "system-error";
	
	String message;

}
