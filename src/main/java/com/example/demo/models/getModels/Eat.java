package com.example.demo.models.getModels;

import com.example.demo.models.EatInfo;


import java.util.ArrayList;

public class Eat {

    //Moscow
    EatInfo varenichnaya = new EatInfo(
            0,
            "Вареничная № 1",
            "https://www.restoran.ru/upload/resize_cache/iblock/fc0/1000_667_11a88371ca9e7ba72ce6f5767ba9eff1a/3v7a4263d82.jpg",
            "Никольская ул., 11-13с2, Москва, Россия"
    );

    //Moscow
    EatInfo stolovaya57 = new EatInfo(
            1,
            "Столовая № 57",
            "https://irecommend.ru/sites/default/files/imagecache/copyright1/user-images/1654978/es7bkqBLnfxn1IgxPuzgKQ.jpg",
            "Красная площадь, 3, Москва, Россия (ТЦ ГУМ, этаж 3)"
    );

    //Moscow
    EatInfo drShivago = new EatInfo(
            2,
            "Dr. Живаго",
            "https://msk.webbanket.ru/images/katalog/restoran/dr_jivago/dr_jivago_00014.jpg",
            "Моховая ул., 15/1, Москва, Россия"
    );

    public ArrayList<EatInfo> getMoscowEat() {
        ArrayList<EatInfo> returnArray = new ArrayList<>();
        returnArray.add(varenichnaya);
        returnArray.add(stolovaya57);
        returnArray.add(drShivago);
        return returnArray;
    }

    public EatInfo getVarenichnaya() {
        return varenichnaya;
    }

    public EatInfo getStolovaya57() {
        return stolovaya57;
    }

    public EatInfo getDrShivago() {
        return drShivago;
    }

    //Sochi
    EatInfo midPlace = new EatInfo(
            3,
            "Мидийное Место",
            "https://irecommend.ru/sites/default/files/imagecache/copyright1/user-images/1314767/DDHIB3OFWPJH2cKA2n4X3g.jpg",
            "Приморская ул., 17, микрорайон Центральный, Сочи, Россия"
    );

    //Sochi
    EatInfo fettuchine = new EatInfo(
            4,
            "Феттуччине",
            "https://d34gu9h9mtzjxz.cloudfront.net/lib/profiles/82578/hall_portfolio/p_82578_21412_dbf8dae95da7a3f26b7f9ea87ae54f6e1c24bb5b_x3.jpg",
            "Театральная ул., 11, микрорайон Центральный, Сочи, Россия"
    );

    //Sochi
    EatInfo cheHarcho = new EatInfo(
            5,
            "Чё? Харчо!",
            "https://api.parkseason.ru/images/styles/1440_auto/e6/ae/156005c5baf40ff51a327f1c34f2975b584f32ebebd2b091476594.jpg",
            "Приморская ул., 3/10, микрорайон Центральный, Сочи, Россия"
    );

    public ArrayList<EatInfo> getSochiEat() {
        ArrayList<EatInfo> returnArray = new ArrayList<>();
        returnArray.add(midPlace);
        returnArray.add(fettuchine);
        returnArray.add(cheHarcho);
        return returnArray;
    }

    public EatInfo getMidPlace() {
        return midPlace;
    }

    public EatInfo getFettuchine() {
        return fettuchine;
    }

    public EatInfo getCheHarcho() {
        return cheHarcho;
    }

    //Krasnodar
    EatInfo lovePech = new EatInfo(
            6,
            "Любим печь",
            "https://cafetyt.ru/wp-content/uploads/2021/01/common-5673.jpeg",
            "ул. Ломоносова, 90, Центральный округ, микрорайон Центральный, Краснодар, Россия"
    );

    //Krasnodar
    EatInfo cafeKrasnodar = new EatInfo(
            7,
            "Cafe Krasnodar",
            "https://s3.yugopolis.ru/media/media/cache/longrid2x/data/img/3548184ecd9b928a2d4254a7fdfab739/281799.jpg",
            "ул. Разведчика Леонова, 4, Краснодар, Россия (Парк Краснодар)"
    );

    //Krasnodar
    EatInfo petrushka = new EatInfo(
            8,
            "Petrushka",
            "https://23krasnodar.fra1.cdn.digitaloceanspaces.com/2019/11/Petrushka-restoran-Kommunarov-268.jpg",
            "Красная ул., 154, Краснодар, Россия (этаж цокольный)"
    );

    public ArrayList<EatInfo> getKrasnodarEat() {
        ArrayList<EatInfo> returnArray = new ArrayList<>();
        returnArray.add(lovePech);
        returnArray.add(cafeKrasnodar);
        returnArray.add(petrushka);
        return returnArray;
    }

    public EatInfo getLovePech() {
        return lovePech;
    }

    public EatInfo getCafeKrasnodar() {
        return cafeKrasnodar;
    }

    public EatInfo getPetrushka() {
        return petrushka;
    }

    //Anapa
    EatInfo stolovochka = new EatInfo(
            9,
            "Столовочка",
            "https://i9.photo.2gis.com/images/branch/74/10414574183010784_7c87.jpg",
            "Краснодарская ул., 40, Анапа, Россия"
    );

    //Anapa
    EatInfo shpinat = new EatInfo(
            10,
            "Shpinat",
            "https://i9.photo.2gis.com/images/branch/74/10414574169841479_f09c.jpg",
            "Астраханская ул., 21, Анапа, Россия (эт. 1)"
    );

    //Anapa
    EatInfo letov = new EatInfo(
            11,
            "Летов",
            "https://baryha.ru/wp-content/uploads/2020/02/common-4831.jpeg",
            "ул. Ленина, 30А, Анапа, Россия"
    );

    public ArrayList<EatInfo> getAnapaEat() {
        ArrayList<EatInfo> returnArray = new ArrayList<>();
        returnArray.add(stolovochka);
        returnArray.add(shpinat);
        returnArray.add(letov);
        return returnArray;
    }

    public EatInfo getStolovochka() {
        return stolovochka;
    }

    public EatInfo getShpinat() {
        return shpinat;
    }

    public EatInfo getLetov() {
        return letov;
    }

    //Piter
    EatInfo koreana = new EatInfo(
            12,
            "Кореана",
            "https://storage.googleapis.com/tblr-images/d2d2318c-c0b7-34ae-9c6f-65d4eae99703.jpg",
            "просп. Испытателей, 37, Санкт-Петербург, Россия"
    );

    //Piter
    EatInfo ultramen = new EatInfo(
            13,
            "Ultramen",
            "https://i5.photo.2gis.com/images/branch/38/5348024603804566_da53.jpg",
            "наб. реки Фонтанки, 59, Санкт-Петербург, Россия"
    );

    //Piter
    EatInfo meal = new EatInfo(
            14,
            "Meal",
            "https://a-a-ah-ru.s3.amazonaws.com/uploads/items/151760/313276/large_%D0%B91.jpg",
            "Литейный просп., 17-19, Санкт-Петербург, Россия (пом. 9Н)"
    );

    public ArrayList<EatInfo> getPiterEat() {
        ArrayList<EatInfo> returnArray = new ArrayList<>();
        returnArray.add(koreana);
        returnArray.add(ultramen);
        returnArray.add(meal);
        return returnArray;
    }

    public EatInfo getKoreana() {
        return koreana;
    }

    public EatInfo getUltramen() {
        return ultramen;
    }

    public EatInfo getMeal() {
        return meal;
    }

    //Postov
    EatInfo raksAndGads = new EatInfo(
            15,
            "Раки и Гады",
            "https://assets.allcafe.ru/k/places/1920x1080/pic/places/30090/577b670052799d4610237dc64a31b200.jpeg",
            "ул. Шаумяна, 57, Ростов-на-Дону, Россия"
    );

    //Postov
    EatInfo choliBurgers = new EatInfo(
            16,
            "Choli Burgers",
            "https://i7.photo.2gis.com/images/branch/24/3377699757557203_66f2.jpg",
            "Красноармейская ул., 104, Ростов-на-Дону, Россия (эт. 1)"
    );

    //Postov
    EatInfo arisa  = new EatInfo(
            17,
            "Лариса жарит",
            "https://azur.ru/data/newfotos1/big/26/155326.jpg",
            "пер. Семашко, 113, Ростов-на-Дону, Россия"
    );

    public ArrayList<EatInfo> getRostovEat() {
        ArrayList<EatInfo> returnArray = new ArrayList<>();
        returnArray.add(raksAndGads);
        returnArray.add(choliBurgers);
        returnArray.add(arisa);
        return returnArray;
    }

    public EatInfo getRaksAndGads() {
        return raksAndGads;
    }

    public EatInfo getCholiBurgers() {
        return choliBurgers;
    }

    public EatInfo getArisa() {
        return arisa;
    }


}
