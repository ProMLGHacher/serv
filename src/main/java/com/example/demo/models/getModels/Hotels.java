package com.example.demo.models.getModels;

import com.example.demo.models.HotelInfo;

import java.util.ArrayList;

public class Hotels {

    //Moscow
    HotelInfo cityHotel1905 = new HotelInfo(
            0,
            "City Hotel 1905",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/163362143.jpg?k=660c16405493478fa648e18524b3353fa434f353025c5bb14815d1e7575bd2a9&o=&hp=1",
            "3 Shmitovskiy Proyezd 3, Пресненский, Москва"
    );

    //Moscow
    HotelInfo corsaVita = new HotelInfo(
            1,
            "Corsa Vita",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/313532524.jpg?k=e4c68260f3c7c188db56d9f8042e06bad155f381083bd3b648fd6cc99c2055ac&o=&hp=1",
            "Ulitsa 1905 goda 10/1, Пресненский, Москва, Россия"
    );

    //Moscow
    HotelInfo filiHouseHotel = new HotelInfo(
            2,
            "Fili House Hotel",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/80369067.jpg?k=fd466de185c6c6b1a028b875fa0f15128ca8a0936537dc085ff6cc63ce84dd27&o=&hp=1",
            "ул. Тучковская, 11, корпус 2, Филевский парк, Москва, Россия"
    );

    public ArrayList<HotelInfo> getMoscowHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(cityHotel1905);
        returnArray.add(corsaVita);
        returnArray.add(filiHouseHotel);
        return returnArray;
    }

    public HotelInfo getCityHotel1905() {
        return cityHotel1905;
    }

    public HotelInfo getCorsaVita() {
        return corsaVita;
    }

    public HotelInfo getFiliHouseHotel() {
        return filiHouseHotel;
    }

    //Сочи
    HotelInfo рiLoftHostel = new HotelInfo(
            3,
            "HiLoft Hostel",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/318731599.jpg?k=62afdf384326df9a5c60fe97356d928aa8f87c0fcd16504c412a89b1aeb20253&o=&hp=1",
            "Chernomorskaya 15/1, Сочи, Россия"
    );

    //Сочи
    HotelInfo apartHotelHouse = new HotelInfo(
            4,
            "Апарт-отель House",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/311441515.jpg?k=d63dcec29426fc1785a6e268eec5668899b500e8c3e2c19bcb1cf1f0fb099c9c&o=&hp=1",
            "39 улица Бытха, Сочи, Россия"
    );

    //Сочи
    HotelInfo hostelAlpiyskaya = new HotelInfo(
            5,
            "Гостиница Alpyskaya",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/247556020.jpg?k=cc1eacc5ae585eac434b9ee8e5d8a770cd537568a8b84c76f07210d2dbdac55d&o=&hp=1",
            "Ulitsa Alpiyskaya 27 A, Сочи, Россия"
    );

    public ArrayList<HotelInfo> getSochiHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(рiLoftHostel);
        returnArray.add(apartHotelHouse);
        returnArray.add(hostelAlpiyskaya);
        return returnArray;
    }

    public HotelInfo getРiLoftHostel() {
        return рiLoftHostel;
    }

    public HotelInfo getApartHotelHouse() {
        return apartHotelHouse;
    }

    public HotelInfo getHostelAlpiyskaya() {
        return hostelAlpiyskaya;
    }

    //Краснодар
    HotelInfo parallelHotelAndConferenceKrasnodar = new HotelInfo(
            6,
            "Parallel Hotel & Conference Krasnodar",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/233219230.jpg?k=2c2814f9ae3bc1467e8216ab1a1501c5aaaf6bca9e61d21d3647aa81c16b2d2b&o=&hp=1",
            "Ulitsa Imeni bryusova 145, Краснодар, Россия"
    );

    //Краснодар
    HotelInfo parkHotel = new HotelInfo(
            7,
            "Парк Отель",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/159674467.jpg?k=abe6b1742f024db4fb09777f5501700cc8d0ec9d7a5a29df3e3542cc17cae600&o=&hp=1",
            "Улица Береговая 28А, Краснодар, Россия"
    );

    //Краснодар
    HotelInfo pushkinApartments = new HotelInfo(
            8,
            "Pushkin Apartments",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/287487742.jpg?k=4feb10970d9549a217885f8d9a17cc91e3602945b0bb684f12f3c13841c244b8&o=&hp=1",
            "ул. Пушкина, 2, Краснодар, Россия"
    );

    public ArrayList<HotelInfo> getKrasnodarHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(parallelHotelAndConferenceKrasnodar);
        returnArray.add(parkHotel);
        returnArray.add(pushkinApartments);
        return returnArray;
    }

    public HotelInfo getParallelHotelAndConferenceKrasnodar() {
        return parallelHotelAndConferenceKrasnodar;
    }

    public HotelInfo getParkHotel() {
        return parkHotel;
    }

    public HotelInfo getPushkinApartments() {
        return pushkinApartments;
    }

    //Анапа
    HotelInfo hotelOrionPlus = new HotelInfo(
            9,
            "Hotel Orion Plus",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/248316833.jpg?k=300830eb6f56e5dd9f3fbf89e51d030c725f268a729478566c988e135d41c843&o=&hp=1",
            "Ulitsa Lenina121, Анапа, Россия"
    );

    //Анапа
    HotelInfo makarenaGuestHouse = new HotelInfo(
            10,
            "MAKARENA Guest House",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/156572205.jpg?k=fdcdebe9a779660fe0ef1db5553e32ae32a8f5e30b7f675e1f739b4d74928b18&o=&hp=1",
            "Ulitsa Samburova 156, Анапа, Россия"
    );

    //Анапа
    HotelInfo hotelWarmSea = new HotelInfo(
            11,
            "Отель Тёплое море",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/299624258.jpg?k=aa0b5c47c49017799ed8ac1eb5eec52d4993ae2572093d71856c1a4ea280ba0f&o=&hp=1",
            "Chernomorskaya ulitsa 16a, Анапа, Россия"
    );

    public ArrayList<HotelInfo> getAnapaHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(hotelOrionPlus);
        returnArray.add(makarenaGuestHouse);
        returnArray.add(hotelWarmSea);
        return returnArray;
    }

    public HotelInfo getHotelOrionPlus() {
        return hotelOrionPlus;
    }

    public HotelInfo getMakarenaGuestHouse() {
        return makarenaGuestHouse;
    }

    public HotelInfo getHotelWarmSea() {
        return hotelWarmSea;
    }

    //Питер
    HotelInfo strawberryDuckStPetersburg = new HotelInfo(
            12,
            "Strawberry Duck St. Petersburg",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/242131728.jpg?k=282c5c188bf885e19529e42cf607ff71b3d5ddee6ede88ec60afb0960a8fabee&o=&hp=1",
            "Лермонтовский проспект 43/1, Адмиралтейский район, Санкт-Петербург, Россия"
    );

    //Питер
    HotelInfo wolfsHotel = new HotelInfo(
            13,
            "Отель Волков",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/170417621.jpg?k=67a25ed15b6056fa1d06e5b1a73f8a42c6ab70a94ea0829247bef94bf7b6c871&o=&hp=1",
            "Измайловский проспект 17, Адмиралтейский район, Санкт-Петербург, Россия"
    );

    //Питер
    HotelInfo margaritaHotel = new HotelInfo(
            14,
            "Margarita Hotel",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/199179346.jpg?k=29ec0806c06bcf161ebcaab9ea3a36cdc6848aeeddb89906422f37be1a03579d&o=&hp=1",
            "14 Srednyaya Pod'yacheskaya Ulitsa, Адмиралтейский район, Санкт-Петербург, Россия"
    );

    public ArrayList<HotelInfo> getPiterHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(strawberryDuckStPetersburg);
        returnArray.add(wolfsHotel);
        returnArray.add(margaritaHotel);
        return returnArray;
    }

    public HotelInfo getStrawberryDuckStPetersburg() {
        return strawberryDuckStPetersburg;
    }

    public HotelInfo getWolfsHotel() {
        return wolfsHotel;
    }

    public HotelInfo getMargaritaHotel() {
        return margaritaHotel;
    }

    //Ростов-на-Дону
    HotelInfo hotelMone = new HotelInfo(
            15,
            "Hotel Mone",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/282794751.jpg?k=2c3fe7623d319dee4c0f1f2293e5b870cb7e4c85fd229f6a05af4dfba0c74536&o=&hp=1",
            "Michurinskaya Ulitsa 12, Ростов-на-Дону, Россия"
    );

    //Ростов-на-Дону
    HotelInfo villaRio = new HotelInfo(
            16,
            "Villa Rio",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/252415255.jpg?k=eacbfcd79f2ded805ca4c350f6a63896d3080e491043ad52a5aa779381d5548d&o=&hp=1",
            "Michurinskaya Ulitsa 12, Ростов-на-Дону, Россия"
    );

    //Ростов-на-Дону
    HotelInfo villaDiego = new HotelInfo(
            17,
            "Вилла Диего",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/157248172.jpg?k=d7c76248ff4a0c51504fc411ca00db117424e89f63a7ef824de9087edc744595&o=&hp=1",
            "Улица Плиева 65, Ростов-на-Дону, Россия"
    );

    public ArrayList<HotelInfo> getRostovHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(hotelMone);
        returnArray.add(villaRio);
        returnArray.add(villaDiego);
        return returnArray;
    }

    public ArrayList<HotelInfo> getHotels() {
        ArrayList<HotelInfo> returnArray = new ArrayList<>();
        returnArray.add(cityHotel1905);
        returnArray.add(corsaVita);
        returnArray.add(filiHouseHotel);
        returnArray.add(рiLoftHostel);
        returnArray.add(apartHotelHouse);
        returnArray.add(hostelAlpiyskaya);
        returnArray.add(parallelHotelAndConferenceKrasnodar);
        returnArray.add(parkHotel);
        returnArray.add(pushkinApartments);
        returnArray.add(hotelOrionPlus);
        returnArray.add(makarenaGuestHouse);
        returnArray.add(hotelWarmSea);
        returnArray.add(strawberryDuckStPetersburg);
        returnArray.add(wolfsHotel);
        returnArray.add(margaritaHotel);
        returnArray.add(hotelMone);
        returnArray.add(villaRio);
        returnArray.add(villaDiego);
        return returnArray;
    }

}
