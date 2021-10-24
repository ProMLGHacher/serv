package com.example.demo.models.getModels;

import com.example.demo.models.AttractionInfo;

import java.util.ArrayList;

public class Attractions {

    //Moscow
    AttractionInfo kreml = new AttractionInfo(
            0,
            "Московский Кремль",
            "https://7deti.ru/wp-content/uploads/2018/05/kreml.jpg",
            "Россия, Москва, Ивановская площадь"
    );

    //Moscow
    AttractionInfo tretiakovaskayaGallery = new AttractionInfo(
            1,
            "Государственная Третьяковская галерея",
            "https://ianed.ru/wp-content/uploads/2019/08/gallery_2_391_693799.jpg",
            "Россия, Москва, Ивановская площадь"
    );

    //Moscow
    AttractionInfo gum = new AttractionInfo(
            2,
            "ГУМ",
            "https://i1.wallbox.ru/wallpapers/main/201433/38b4007e15a35ed.jpg",
            "Красная площадь, 3, Москва, Россия"
    );

    public ArrayList<AttractionInfo> getMoscowAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();
        returnArray.add(kreml);
        returnArray.add(tretiakovaskayaGallery);
        returnArray.add(gum);
        return returnArray;
    }

    public AttractionInfo getKreml() {
        return kreml;
    }

    public AttractionInfo getTretiakovaskayaGallery() {
        return tretiakovaskayaGallery;
    }

    public AttractionInfo getGum() {
        return gum;
    }

    //Sochi
    AttractionInfo fisht = new AttractionInfo(
            3,
            "Олимпийский Стадион «Фишт»",
            "https://s15.stc.all.kpcdn.net/russia/wp-content/uploads/2019/02/Stadion-2048.jpg",
            "Олимпийский просп., 15, Сочи"
    );

    //Sochi
    AttractionInfo sportComplex = new AttractionInfo(
            4,
            "Дворец спорта Большой",
            "https://i.archi.ru/i/213916.jpg",
            "Олимпийский просп., 7, п. г. т. Сириус"
    );

    //Sochi
    AttractionInfo brilliantHand = new AttractionInfo(
            5,
            "Памятник героям фильма Бриллиантовая рука",
            "https://tochka-na-karte.ru/modules/photo/images/4786-Pamjatnik-gerojam-filma-Brilliantovaja-ruka-v-Sochi.jpg",
            "ул. Войкова, 1/1, микрорайон Центральный, Сочи"
    );

    public ArrayList<AttractionInfo> getSochiAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();
        returnArray.add(fisht);
        returnArray.add(sportComplex);
        returnArray.add(brilliantHand);
        return returnArray;
    }

    public AttractionInfo getFisht() {
        return fisht;
    }

    public AttractionInfo getSportComplex() {
        return sportComplex;
    }

    public AttractionInfo getBrilliantHand() {
        return brilliantHand;
    }

    //Krasnodar
    AttractionInfo ozMoll = new AttractionInfo(
            6,
            "OZ МОЛЛ",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/16/1e/37/7d/oz.jpg?w=1100&h=-1&s=1",
            "ул. Крылатая, 2, Краснодар 350910 Россия"
    );

    //Krasnodar
    AttractionInfo galitckPark = new AttractionInfo(
            7,
            "Парк Галицкого",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/16/ed/54/82/photo3jpg.jpg?w=1200&h=-1&s=1",
            "улица Разведчика Леонова, Краснодар 350059 Россия"
    );

    //Krasnodar
    AttractionInfo rosha = new AttractionInfo(
            8,
            "Чистяковская роща",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/04/98/27/62/caption.jpg?w=1200&h=-1&s=1",
            "ул. Колхозная, д. 86, Краснодар 350010 Россия"
    );

    public ArrayList<AttractionInfo> getKrasnodarAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();
        returnArray.add(ozMoll);
        returnArray.add(galitckPark);
        returnArray.add(rosha);
        return returnArray;
    }

    public AttractionInfo getOzMoll() {
        return ozMoll;
    }

    public AttractionInfo getGalitckPark() {
        return galitckPark;
    }

    public AttractionInfo getRosha() {
        return rosha;
    }

    //Anapa
    AttractionInfo naberezhnaya = new AttractionInfo(
            9,
            "Набережная Анапы",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/11/57/75/ed/caption.jpg?w=1200&h=-1&s=1",
            "Набережная Анапы"
    );

    //Anapa
    AttractionInfo whiteCap = new AttractionInfo(
            10,
            "Памятник Белой шляпе",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/17/10/88/50/caption.jpg?w=1200&h=-1&s=1",
            "парк 30-летия Победы, Анапа 353440 Россия"
    );

    //Anapa
    AttractionInfo sunIsland = new AttractionInfo(
            11,
            "Парк \"Солнечный Остров\"",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/14/08/59/2d/caption.jpg?w=1200&h=-1&s=1",
            "Пионерский проспект, 38А, Анапа 353450 Россия"
    );

    public ArrayList<AttractionInfo> getAnapaAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();
        returnArray.add(naberezhnaya);
        returnArray.add(whiteCap);
        returnArray.add(sunIsland);
        return returnArray;
    }

    public AttractionInfo getNaberezhnaya() {
        return naberezhnaya;
    }

    public AttractionInfo getWhiteCap() {
        return whiteCap;
    }

    public AttractionInfo getSunIsland() {
        return sunIsland;
    }

    //Piter
    AttractionInfo museum = new AttractionInfo(
            12,
            "Государственный Музей-Заповедник Царское Село",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/18/32/28/23/predio-principal-do-tsarskoe.jpg?w=1000&h=-1&s=1",
            "ул. Садовая, д. 7, Пушкин, Санкт-Петербург 196601 Россия"
    );

    //Piter
    AttractionInfo museumComplex = new AttractionInfo(
            13,
            "Музейный комплекс \"Государственный музей-памятник \"",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/06/ab/7c/63/caption.jpg?w=1200&h=-1&s=1",
            "Исаакиевская площадь, 4 м. Невский проспект, Санкт-Петербург 190000 Россия"
    );

    //Piter
    AttractionInfo orenienbaum = new AttractionInfo(
            14,
            "Ораниенбаум",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0f/a7/14/17/caption.jpg?w=1200&h=-1&s=1",
            "пр. Дворцовый, 46, Ломоносов, Санкт-Петербург 198412 Россия"
    );

    public ArrayList<AttractionInfo> getPiterAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();
        returnArray.add(museum);
        returnArray.add(museumComplex);
        returnArray.add(orenienbaum);
        return returnArray;
    }

    public AttractionInfo getMuseum() {
        return museum;
    }

    public AttractionInfo getMuseumComplex() {
        return museumComplex;
    }

    public AttractionInfo getOrenienbaum() {
        return orenienbaum;
    }

    //Rostov
    AttractionInfo lukSlaboda = new AttractionInfo(
            15,
            "Лукова Слобода",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0b/9e/ce/bc/caption.jpg?w=1200&h=-1&s=1",
            "ул. Достоевского, 39, Ростов 152155 Россия"
    );

    //Rostov
    AttractionInfo zapovednikRostov = new AttractionInfo(
            16,
            "Государственный музей-заповедник Ростовский кремль",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/13/5a/19/14/caption.jpg?w=1100&h=-1&s=1",
            "ул. Петровичева, 1 Ростовский кремль, Ростов 152151 Россия"
    );

    //Rostov
    AttractionInfo frogPrincessMuseum = new AttractionInfo(
            17,
            "Музей Царевны-лягушки",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/96/e2/91/caption.jpg?w=1200&h=-1&s=1",
            "ул. Ленинская, 20, Ростов 152155 Россия"
    );

    public ArrayList<AttractionInfo> getRostovAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();
        returnArray.add(lukSlaboda);
        returnArray.add(zapovednikRostov);
        returnArray.add(frogPrincessMuseum);
        return returnArray;
    }

    public AttractionInfo getLukSlaboda() {
        return lukSlaboda;
    }

    public AttractionInfo getZapovednikRostov() {
        return zapovednikRostov;
    }

    public AttractionInfo getFrogPrincessMuseum() {
        return frogPrincessMuseum;
    }

    public ArrayList<AttractionInfo> getAttractions() {
        ArrayList<AttractionInfo> returnArray = new ArrayList<>();

        returnArray.add(kreml);
        returnArray.add(tretiakovaskayaGallery);
        returnArray.add(gum);

        returnArray.add(fisht);
        returnArray.add(sportComplex);
        returnArray.add(brilliantHand);

        returnArray.add(ozMoll);
        returnArray.add(galitckPark);
        returnArray.add(rosha);

        returnArray.add(naberezhnaya);
        returnArray.add(whiteCap);
        returnArray.add(sunIsland);

        returnArray.add(museum);
        returnArray.add(museumComplex);
        returnArray.add(orenienbaum);

        returnArray.add(lukSlaboda);
        returnArray.add(zapovednikRostov);
        returnArray.add(frogPrincessMuseum);

        return returnArray;
    }

}
