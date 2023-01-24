package ru.netology.utils;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateCity() {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Москва");
        cityList.add("Щелково");
        cityList.add("Подольск");
        cityList.add("Климовск");
        cityList.add("Обнинск");
        cityList.add("Чехов");
        cityList.add("Малоярославец");
        cityList.add("Домодедово");
        cityList.add("Серпухов");
        cityList.add("Пущино");
        cityList.add("Протвино");
        cityList.add("Кашира");
        cityList.add("Таруса");
        cityList.add("Тула");
        cityList.add("Алексин");
        cityList.add("Калуга");
        cityList.add("Ступино");
        cityList.add("Воскресенск");
        Collections.shuffle(cityList);
        String city = cityList.get(10);
        return city;
    }

    public static String generateDate(int days) {
        LocalDate date = LocalDate.now().plusDays(days);
        String newDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return newDate;
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String name = faker.name().fullName();
        return name;
    }

    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String phone = faker.numerify("+7##########");
        return phone;
    }
}