package com.example.gofp.head_first.sol.structural.proxy.classes;

import java.util.HashMap;
import java.util.Map;

public class PersonDb {
    private static final class LazyHolder {
        private static final PersonDb INSTANCE = new PersonDb();
    }

    public static PersonDb getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static final String[] NAMES = {
            "Joe Crown", "Mike Street", "Sara Baker", "Jimmy Glasgow", "Luci Drake"
    };
    private static final String[] GENDERS = {
            "male", "male", "female", "male", "female"
    };

    private static final String[] INTERESTS = {
            "climbing, chess, language",
            "tennis, writing, archery",
            "swimming, sketching, yoga",
            "marathon, design, reading",
            "cycling, painting, theater"
    };

    private static final int[] RATINGS = {
            5, 12, 3, 7, 8
    };

    private Map<String, PersonBean> map;

    private PersonDb() {
        this.map = new HashMap<>();
        init();
    }

    private void init() {
        for (int i = 0; i < NAMES.length; i++) {
            PersonBean person = new PersonBeanImpl();
            person.setName(NAMES[i]);
            person.setGender(GENDERS[i]);
            person.setInterests(INTERESTS[i]);
            person.setHotOrNotRating(RATINGS[i]);
            String key = person.getName().replaceAll("\\s.*", "").toLowerCase();
            map.put(key, person);
        }
    }

    public PersonBean getPerson(String name) {
        return map.get(name);
    }

}
