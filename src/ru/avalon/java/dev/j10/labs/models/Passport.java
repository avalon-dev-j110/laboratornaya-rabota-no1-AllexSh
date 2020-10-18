
package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.*;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport extends Address {
	
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
		int intPassS, intPassN; // серия, номер паспорта
		String strName, strSurName, strMidName, strSecName, strBday, strRecDate, strGov;
		// имя, фамилия, отчество, второе имя, дата рождения, дата выдачи, орган выдачи
		
		
		//три перегрузки конструктора для всех случаев задачи
		public Passport(String strName, String strSurName, String strMidName,String strAdr) {
			this.strName = strName; 
			this.strSurName = strSurName; 
			this.strMidName = strMidName; 
			super.strAdr = strAdr;//переменная адреса
			}
		public Passport(String strName, String strSecName, String strSurName, int intPassS, String strAdr) {
			this.strName = strName;
			this.strSecName = strSecName;
			this.strSurName = strSurName;
			this.intPassS = intPassS;// доп инициализация для избежания конфликта создания одинаковых конструкторов
			super.strAdr = strAdr;
			}
		public Passport(String strName,String strSurName, String strAdr) {
			this.strName = strName;
			this.strSurName = strSurName;
			super.strAdr = strAdr;
			}
		
}
		


