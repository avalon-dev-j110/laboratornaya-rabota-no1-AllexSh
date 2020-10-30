
package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
	private String strName, strSurName, strMidName, strSecName;
	private int intPassS;
	private String fullName;// пременная для форматированного текста

	public Person(String strName, String strSurName, String strMidName, String strStreet, String strHouse) {
		this.strName = strName;
		this.strSurName = strSurName;
		this.strMidName = strMidName;

		Passport passport1 = new Passport(strName, strSurName, strMidName);
		passport1.setStrName(strName);
		passport1.setStrSurName(strSurName);
		passport1.setStrMidName(strMidName);

		Address address1 = new Address(strStreet, strHouse);
		address1.setStrStreet(strStreet);
		address1.setStrHouse(strHouse);
		address1.getStrAdr();
	}

	public Person(String strName, String strSecName, String strSurName, int intPassS, String strStreet,
			String strHouse) {
		this.strName = strName;
		this.strSecName = strSecName;
		this.strSurName = strSurName;
		this.intPassS = intPassS;

		Passport passport2 = new Passport(strName, strSecName, strSurName, intPassS);
		passport2.setStrName(strName);
		passport2.setStrSecName(strSecName);
		passport2.setStrSurName(strSurName);
		passport2.setIntPassS(intPassS);

		Address address2 = new Address(strStreet, strHouse);
		address2.setStrStreet(strStreet);
		address2.setStrHouse(strHouse);
		address2.getStrAdr();
	}

	public Person(String strName, String strSurName, String strStreet, String strHouse) {
		this.strName = strName;
		this.strSurName = strSurName;

		Passport passport3 = new Passport(strName, strSurName);
		passport3.setStrName(strName);
		passport3.setStrSurName(strSurName);

		Address address3 = new Address(strStreet, strHouse);
		address3.setStrStreet(strStreet);
		address3.setStrHouse(strHouse);
		address3.getStrAdr();
	}
	// TODO

	/**
	 * Возврвщает полное имя человека.
	 * <p>
	 * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
	 * Отчество, разделённые пробелом.
	 * <p>
	 * Если у человека нет Отчества, но есть второе имя, то возвращает Имя, Первую
	 * букву второго имени, и Фамилию, разделённые пробелом. После Инициала второго
	 * имени должна стоять точка. Например, "Джером К. Джером".
	 * <p>
	 * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
	 * Фамилия, то возвращает их, разделённые пробелом.
	 *
	 * @return имя человека в виде строки.
	 */

	public String getFullName() {
		/*
		 * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
		 */
		// return null;
		if (strSecName == null & strMidName != null) // если второго имени нет и есть очество
			fullName = strName + "\n" + strSurName + "\n" + strMidName;
		else if (strMidName == strSecName) // если есть только имя и фамилия
			fullName = strName + "\n" + strSurName;
		else // если есть только второе имя
			fullName = strName + "\n" + strSecName.charAt(0) + "." + "\n" + strSurName;
		return fullName;
	}

	/**
	 * Возвращает адрес, по которому проживает человек.
	 * <p>
	 * Возвращаемый адрес соответствует месту постоянной регистрации человека,
	 * согласно паспортным данным.
	 * 
	 * @return адрес регистрации в виде строки.
	 */

//	public String getAddress() {
//		/*
//		 * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
//		 */
//		// return null;
//		
//	}
//	public String getStrAddress() {
//		this.strAddress = Address.getStrAdr();
//		return strAddress;
//	}
}