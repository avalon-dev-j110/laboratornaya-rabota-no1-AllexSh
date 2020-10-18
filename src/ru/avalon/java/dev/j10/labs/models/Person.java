
package ru.avalon.java.dev.j10.labs.models;
//import ru.avalon.java.dev.j10.labs.commons.*;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person extends Passport{

	String fullName;// пременная для форматированного текста
	
    public Person(String strName, String strSurName, String strMidName, String strAdr) {
		super(strName, strSurName, strMidName, strAdr);
    }
	public Person(String strName, String strSecName, String strSurName, int intPassS, String strAdr) {
		super(strName, strSecName, strSurName, intPassS, strAdr);
	}
	public Person(String strName,String strSurName, String strAdr) {
		super(strName, strSurName, strAdr);
	}
		// TODO Auto-generated constructor stub
	

	/**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
	
	    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        //return null;
	    	if (strSecName == null & strMidName != null) 			//если второго имени нет и есть очество
	    		fullName = strName + "\n" + strSurName + "\n" + strMidName;
	    	else if (strMidName == strSecName) 						//если есть только имя и фамилия
	    		fullName = strName + "\n" + strSurName;
	    	else 													//если есть только второе имя
	    		fullName = strName + "\n" + strSecName.charAt(0)+"." + "\n" + strSurName;
	    	return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        //return null;
    	return strAdr;
    }
}