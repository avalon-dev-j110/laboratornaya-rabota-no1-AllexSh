
package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.models.Person;



public class Main {
	public static void main (String[] args) {
		
    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    //Main() {

        Person ivanov = new Person ("Иван", "Иванов", "Иванович", "Хрустицкого 14");
        
                System.out.println(ivanov.getFullName());
                System.out.println(ivanov.getAddress());
                
        Person smith = new Person ("John", "Edvard", "Smith", 4224, "st.James ave. 43");
        
                System.out.println(smith.getFullName());
                System.out.println(smith.getAddress());
                
        Person wiener = new Person ("Norbert", "Wiener", "North Alpine Drive 116");
                
                System.out.println(wiener.getFullName());
                System.out.println(wiener.getAddress());
	}
}
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
