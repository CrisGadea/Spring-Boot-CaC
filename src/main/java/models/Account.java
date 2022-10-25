package models;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import utils.AccountType;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	private Long id;
	private String accountName;
	private Double amount;
	private String Owner;
	private AccountType type;
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(id, other.id);
	}
	
}
