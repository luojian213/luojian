package com.gongkongmall.user.generated.model;

import java.util.Date;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER.ID
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER.USER_NAME
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER.AGE
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	private Integer age;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER.REGISTER_DATE
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	private Date registerDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER.ID
	 * @return  the value of USER.ID
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER.ID
	 * @param id  the value for USER.ID
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER.USER_NAME
	 * @return  the value of USER.USER_NAME
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER.USER_NAME
	 * @param userName  the value for USER.USER_NAME
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER.AGE
	 * @return  the value of USER.AGE
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER.AGE
	 * @param age  the value for USER.AGE
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER.REGISTER_DATE
	 * @return  the value of USER.REGISTER_DATE
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER.REGISTER_DATE
	 * @param registerDate  the value for USER.REGISTER_DATE
	 * @mbg.generated  Sun Dec 04 21:06:03 CST 2016
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
}