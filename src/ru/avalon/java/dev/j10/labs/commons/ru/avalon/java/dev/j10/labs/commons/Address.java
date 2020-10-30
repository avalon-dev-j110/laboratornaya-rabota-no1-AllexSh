
package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address {
	private String strStreet;
	private String strHouse;
	private String strAdr;

	public Address (String strStreet, String strHouse){
		this.strStreet = strStreet;
		this.strHouse = strHouse;
	}
	public void setStrHouse(String strHouse) {
		this.strHouse = strHouse;
	}
	public void setStrStreet(String strStreet) {
		this.strStreet = strStreet;
	}
	
	public String getStrAdr() {
		strAdr = strStreet +" "+ strHouse;
		return strAdr;
	}
	
}