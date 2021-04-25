package chapters.ch01;

import com.arakelian.faker.model.Person;
import com.arakelian.faker.service.RandomPerson;

public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[100];

        for (int i = 0; i < names.length; i++){
            Person person = RandomPerson.get().next();
            names[i] = person.getFirstName().toLowerCase();
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
