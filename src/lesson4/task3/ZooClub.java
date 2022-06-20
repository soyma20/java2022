package lesson4.task3;

import java.util.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    //    first version
    public void setPerson(Person person) {
        club.put(person, new ArrayList<>());
    }

    //    second version
//    public void setPerson(String name) {
//        Person person = new Person(name);
//        club.put(person, new ArrayList<>());
//    }

    public void addPet(Person person, String name) {
        List<Pet> pets = club.get(person);
        pets.add(new Pet(name));
        club.replace(person, pets);
    }

    public void deletePetByPerson(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Pet next = iterator.next();
            if (next.getName() == pet.getName()) {
                iterator.remove();
            }
        }
    }

    public void deletePerson(Person person) {
        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            if (next.getKey() == person) {
                iterator.remove();
            }
        }
    }

    public void deletePetInEveryPerson(Pet pet) {
        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            List<Pet> pets = next.getValue();
            Iterator<Pet> petsIterator = pets.iterator();
            while (petsIterator.hasNext()) {
                Pet next1 = petsIterator.next();
                if (next1.getName() == pet.getName()) {
                    petsIterator.remove();
                }
            }
        }
    }
    public void showZooClub(){
        System.out.println(club);
    }


}
