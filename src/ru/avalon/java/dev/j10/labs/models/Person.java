
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

	private Address address;
	private Passport passport;
	private String fullName;

	public Person(Address address, Passport passport) {
		this.passport = passport;
		this.address = address;
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
		if (passport.getStrSecName() == null & passport.getStrMidName() != null) // если второго имени нет и есть
																					// очество
			fullName = passport.getStrName() + "\n" + passport.getStrSurName() + "\n" + passport.getStrMidName();
		else if (passport.getStrMidName() == passport.getStrSecName()) // если есть только имя и фамилия
			fullName = passport.getStrName() + "\n" + passport.getStrSurName();
		else // если есть только второе имя
			fullName = passport.getStrName() + "\n" + passport.getStrSecName().charAt(0) + "." + "\n"
					+ passport.getStrSurName();
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
	public String getStrAddress() {
		return address.getStrAdr();
	}
}