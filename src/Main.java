import java.util.List;

public class Main {


    public static void main(String[] args) {

        PersonService personService = new PersonService(List.of(
                new Person("Vlad", "Muresan", 17, "Cluj"),
                new Person("Vlad", "Cornescu", 17, "Cluj"),
                new Person("Ioana", "Barton", 16, "Oradea"),
                new Person("Maria", "Comaneci", 22, "Oradea"),
                new Person("Nicu", "Tandari", 44, "Cluj"),
                new Person("Daniel", "Otava", 67, "Bucuresti"),
                new Person("Alex", "Nemerovschi", 30, "Sibiu"),
                new Person("Alex", "Nemerovschi", 55, "Sibiu")
        ));

        //Pentru a pastra clasa Main cat mai curata (curata = cod putin), am creat in clasa PersonService
        //cate o functie pentru fiecare stream.


        //list all the persons names: firstName lastName   => List<String>
        System.out.println(personService.stringListOfPersonNames());

        //list all persons that are major    => List<Person>
        System.out.println(personService.personListOfMajors());

        //list all persons from Oradea    => List<Person>
        System.out.println(personService.personListCityOradea());

        //list all persons from Oradea OR Cluj    => List<Person>
        System.out.println(personService.personListCityOradeaOrCluj());

        //list all firstNames CAPITALIZED    => List<String>
        System.out.println(personService.stringListAllFirstNames());

        //list all person names: firstName firstletter from last name    => List<String>
        System.out.println(personService.stringListFirstNamePlusFirstLetterLN());

        //list all persons with 18 < age < 60     => List<Person>
        System.out.println(personService.personListBetween18And60());

        //list all persons having first name starting with A    => List<Person>
        System.out.println(personService.personListNameStartingWithA());

        //list all first names UNIQUELY    => List<String>
        System.out.println(personService.stringListUniqueFirstNames());

        //sort the persons by first name
        System.out.println(personService.sortByFirstName());

        //sort the persons by last name
        System.out.println(personService.sortByLastName());

        //sort the persons by first name, last name and then age
        System.out.println(personService.sortByFNthenLNthenAGE());




    }
}

record Person(String firstName, String lastName, int age, String city) {

}