package com.lzcge.Entity;

import com.lzcge.Common.Validates.Add;
import com.lzcge.Common.Validates.Update;
import lombok.Data;


import javax.validation.constraints.NotNull;


import java.io.Serializable;


@Data
public class User implements Serializable{

	@NotNull(message = "id不能为空", groups = {Update.class})
	private Integer userId;
	@NotNull(message = "用户名不能为空", groups = {Update.class,Add.class})
	private String username;
	@NotNull(message = "密码不能为空", groups = {Update.class,Add.class})
	private String password;
	@NotNull(message = "年龄不能为空", groups = {Update.class,Add.class})
	private Integer age;


}
