package di;

import lombok.Data;
import lombok.NonNull;

@Data
public class DTO {
	@NonNull				//유효성 검사를 알아서 한다. 
	private int num;
	private String name;
	
}
