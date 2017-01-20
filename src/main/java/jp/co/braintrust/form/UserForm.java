package jp.co.braintrust.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class UserForm {

	/** ���O */
	@NotEmpty
	private String name;

	/** �N�� */
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	private Integer age;

	/** ���� */
	private String memo;


	public String toString() {
		return "name:" + name + ", age:" + age + ", memo:" + memo;
	}

	/**
	 * name ���擾���܂��B
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name ���Z�b�g���܂��B
	 * @param name �Z�b�g���� name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * age ���擾���܂��B
	 * @return age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * age ���Z�b�g���܂��B
	 * @param age �Z�b�g���� age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * memo ���擾���܂��B
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * memo ���Z�b�g���܂��B
	 * @param memo �Z�b�g���� memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
