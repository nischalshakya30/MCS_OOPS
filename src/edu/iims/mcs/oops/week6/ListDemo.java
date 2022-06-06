package edu.iims.mcs.oops.week6;

import java.util.ArrayList;
import java.util.List;


class NotFoundException extends Exception {

    public NotFoundException(String message) {
        super(message);
    }
}

public class ListDemo {

    public static final List<Person> persons = new ArrayList<>();

    static void save(Person person) {
        persons.add(person);
    }

    static List<Person> findAll() {
        return persons;
    }

    static Person findOne(Long id) throws NotFoundException {
        for (Person p : persons) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        throw new NotFoundException("Person with given id not found");
    }

    static void delete(Long id) {
        try {
            Person prevPerson = findOne(id);
            persons.remove(prevPerson);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    static void update(Long id, Person person) {
        try {
            Person prevPerson = findOne(id);
            prevPerson.setFirstName(person.getFirstName());
            prevPerson.setLastName(person.getLastName());
            prevPerson.setContact(person.getContact());

            int prevIndex = persons.indexOf(prevPerson);
            persons.set(prevIndex, prevPerson);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person person = new Person(1L, "Ram", "Shrestha", 984156789L);
        save(person);

        for (Person p : findAll()) {
            System.out.println(p.toString());
        }

        Person personTwo = new Person(1L, "Nischal", "Shakya", 984156789L);
        update(personTwo.getId(), personTwo);

        delete(1L);

        for (Person p : findAll()) {
            System.out.println(p.toString());
        }
    }
}
