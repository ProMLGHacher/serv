package com.example.demo;


import com.example.demo.models.CityInfo;
import com.example.demo.models.OnCityInfo;
import com.example.demo.models.getModels.Attractions;
import com.example.demo.models.getModels.Cities;
import com.example.demo.models.getModels.Hotels;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityController {

    Cities cities = new Cities();
    Hotels hotels = new Hotels();
    Attractions attractions = new Attractions();

    @GetMapping("/city/{id}")
    public OnCityInfo getCityInfoFromId(@PathVariable("id") int id) {
        return cities.getCitiesArray().get(id);
    }

    @GetMapping("/city")
    public ArrayList yep() {

        ArrayList<CityInfo> returnList = new ArrayList<>();

        returnList.add(new CityInfo(
                0,
                "Москва",
                "https://rustur.ru/wp-content/uploads/2019/12/Russia_Moscow_Temples_445419-scaled.jpg"
        ));

        returnList.add(new CityInfo(
                1,
                "Сочи",
                "https://xn--h1aaawkeh.xn--p1ai/wp-content/uploads/2018/10/image-2.jpg"
        ));

        returnList.add(new CityInfo(
                2,
                "Краснодар",
                "https://pilothub.ru/datas/folio/4960-stadion-krasnodar.jpg"
        ));

        returnList.add(new CityInfo(
                3,
                "Анапа",
                "https://www.miraterra.ru/wp-content/uploads/2020/03/Anapa-Resort-3.jpg"
        ));

        returnList.add(new CityInfo(
                4,
                "Санкт-Петербург",
                "https://kipmu.ru/wp-content/uploads/pchspnzptr-1920x1197.jpg"
        ));

        returnList.add(new CityInfo(
                5,
                "Ростов на Дону",
                "https://rostof.ru/sites/default/files/field/image/article/agyz-skduji.jpg"
        ));

        return returnList;
    }

}
