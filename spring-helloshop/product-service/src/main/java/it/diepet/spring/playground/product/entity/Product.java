package it.diepet.spring.playground.product.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product implements Serializable {

	private static final long serialVersionUID = 1488916583581705419L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	@EqualsAndHashCode.Include
	private Long id;
	
	@NonNull
	private String code;
	
	@NonNull
	private String description;
	
	
}
