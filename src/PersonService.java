import java.util.Comparator;
import java.util.List;

public class PersonService {

    private List<Person> personList;

    public PersonService(List<Person> list) {
        this.personList = list;

    }


    public List<String> stringListOfPersonNames() {
        return personList.stream().map(person -> person.firstName() + " " + person.lastName()).toList();
    }

    public List<Person> personListOfMajors() {
        return personList.stream().filter(person -> person.age() > 18).toList();
    }

    public List<Person> personListCityOradea() {
        return personList.stream().filter(person -> person.city() == "Oradea").toList();
    }

    public List<Person> personListCityOradeaOrCluj() {
        return personList.stream().filter(person ->
                person.city() == "Oradea" || person.city() == "Cluj").toList();
    }

    public List<String> stringListAllFirstNames() {
        return personList.stream().map(person -> person.firstName().toUpperCase()).toList();
    }

    public List<String> stringListFirstNamePlusFirstLetterLN() {
        return personList.stream().map(person ->
                person.firstName() + " " + person.lastName().charAt(0) + ".").toList();
    }

    public List<Person> personListBetween18And60() {
        return personList.stream().filter(person ->
                person.age() >= 18).filter(person -> person.age() <= 60).toList();
    }


    public List<Person> personListNameStartingWithA() {
        return personList.stream().filter(person ->
                person.firstName().charAt(0) == 'A').toList();
    }

    public List<String> stringListUniqueFirstNames() {
        return personList.stream().map(Person::firstName).distinct().toList();
    }

    public List<Person> sortByFirstName() {
        return personList.stream().sorted(Comparator.comparing(Person::firstName)).toList();
    }

    public List<Person> sortByLastName() {
        return personList.stream().sorted(Comparator.comparing(Person::lastName)).toList();
    }

    public List<Person> sortByFNthenLNthenAGE() {
        return personList.stream().sorted(Comparator.comparing(Person::firstName).
                thenComparing(Person::lastName).thenComparing(Person::age)).toList();
    }
}
