package hello;

import lombok.Data;

@Data
public class Employee {
	private String employeeId;
	private String employeeName;
	private int employeeAge;

}

// @Data
// メソッドを自動生成してくれる。（getter,setter,toString,hashCode,equals）