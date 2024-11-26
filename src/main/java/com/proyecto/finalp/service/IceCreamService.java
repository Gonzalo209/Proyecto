package com.proyecto.finalp.service;

import com.proyecto.finalp.model.IceCream;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class IceCreamService {

    private static int count = 0;
    private List<IceCream> todos = new ArrayList<>();

    {
        todos.add(new IceCream(++count, "Gonzalo", "Chocolate", "1000ml", "580"));
        todos.add(new IceCream(++count, "Gonzalo", "Vainilla", "850ml", "380"));
        todos.add(new IceCream(++count, "Gonzalo", "Fresa", "450ml", "290"));

    }

    public static int getCount() {

        return count;

    }

    public void add(String flavor, String capacity, String price) {

        todos.add(new IceCream(++count, "Gonzalo", flavor, capacity, price));

    }

    public void deleteById(int id) {

        Predicate<? super IceCream> predicate = e -> e.getId() == id;

        todos.removeIf(predicate);

    }

    public IceCream findById(int id) {

        return todos.stream().
                filter(p -> p.getId() == id).
                findFirst().get();

    }

    public List<IceCream> findByUsername(String nameCompany) {

        return todos;

    }

}