package jp.co.braintrust.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class UserForm {

	/** 名前 */
	@NotEmpty
	private String name;

	/** 年齢 */
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	private Integer age;

	/** メモ */
	private String memo;


	public String toString() {
		return "name:" + name + ", age:" + age + ", memo:" + memo;
	}

	/**
	 * name を取得します。
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name をセットします。
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * age を取得します。
	 * @return age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * age をセットします。
	 * @param age セットする age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * memo を取得します。
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * memo をセットします。
	 * @param memo セットする memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
