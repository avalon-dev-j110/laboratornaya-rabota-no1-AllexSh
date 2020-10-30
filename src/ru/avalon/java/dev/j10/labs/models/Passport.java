
package ru.avalon.java.dev.j10.labs.models;

//import ru.avalon.java.dev.j10.labs.commons.*;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li>серию и номер документа;
 * <li>имя;
 * <li>фамилию;
 * <li>отчество;
 * <li>второе имя;
 * <li>день рождения;
 * <li>дату выдачи;
 * <li>орган, выдавший документ.
 * </ol>
 */
public class Passport { // extends Address {

	/*
	 * TODO(Студент): Закончить определение класса.
	 *
	 * 1. Объявить атрибуты класса.
	 *
	 * 2. Определить необходимые методы класса. Подумайте о том, какие методы должны
	 * существовать в классе, чтобы обеспечивать получение всей необходимой
	 * информации о состоянии объектов данного класса. Все ли поля обязательно будут
	 * проинициализированы при создании экземпляра?
	 *
	 * 3. Создайте все необходимые конструкторы класса.
	 *
	 * 4. Помните о возможности существования перегруженных конструкторов.
	 *
	 * 5. Обеспечте возможность использования класса за пределами пакета.
	 */
	private int intPassS, intPassN; // серия, номер паспорта
	private String strName, strSurName, strMidName, strSecName, strBday, strRecDate, strGov;
	// имя, фамилия, отчество, второе имя, дата рождения, дата выдачи, орган выдачи

	// три перегрузки конструктора для всех случаев задачи
	public Passport(String strName, String strSurName, String strMidName) {
		this.strName = strName; //setStrName();
		this.strSurName = strSurName; //getStrSurName();
		this.strMidName = strMidName; //getStrMidName();
	}
	public Passport(String strName, String strSecName, String strSurName, int intPassS) {
		this.strName = strName; //getStrName();
		this.strSecName = strSecName; //getStrSecName();
		this.strSurName = strSurName; //getStrSurName();
		this.intPassS = intPassS; //getIntPassS();// доп инициализация для избежания конфликта создания одинаковых конструкторов
	}
	public Passport(String strName, String strSurName) {
		this.strName = strName; //getStrName();
		this.strSurName = strSurName; //getStrSurName();
	}

	public void setIntPassS(int intPassS) {
		this.intPassS = intPassS;
	}

	public void setIntPassN(int intPassN) {
		this.intPassN = intPassN;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public void setStrSurName(String strSurName) {
		this.strSurName = strSurName;
	}

	public void setStrMidName(String strMidName) {
		this.strMidName = strMidName;
	}

	public void setStrSecName(String strSecName) {
		this.strSecName = strSecName;
	}

	public String getStrName() {
		return strName;
	}

	public String getStrSurName() {
		return strSurName;
	}

	public String getStrMidName() {
		return strMidName;
	}

	public String getStrSecName() {
		return strSecName;
	}
	public int getIntPassS() {
		return intPassS;
	}
}
