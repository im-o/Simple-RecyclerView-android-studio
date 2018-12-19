package com.example.user.tes061212;
import java.util.ArrayList;

public class FlowersData {
    public static String[][] ini_data = new String[][]{
            {"Nusa Dua Beach", "Denpasar, Bali", "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cms/best-beaches-in-bali-nusa-dua-1518082996-735X412.jpg"},
            {"Kuta Beach", "Bali", "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cms/best-beaches-in-bali-kuta-1518082812-1000X561.jpg"},
            {"Senggigi Beach", "Lombok", "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cms/indonesia-beaches-senggigi-1519634750-1000X561.jpg"},
            {"Pangandaran Beach", "West Java", "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cms/indonesia-beaches-pangandaran-1519635018-1000X561.jpg"},
            {"Sanur Beach", "Bali", "https://d3hne3c382ip58.cloudfront.net/files/uploads/bookmundi/resized/cms/best-beaches-in-bali-sanur-1518083360-1000X561.jpg"}
    };
    public static ArrayList<Flowers> getListData(){ //ArrayList<com.example.user.tes061212.Flowers> set data ke class com.example.user.tes061212.Flowers.java
        Flowers flowers = null;
        ArrayList<Flowers> ini_list = new ArrayList<>();
        for (int i = 0; i < ini_data.length; i++){
            flowers = new Flowers();
            flowers.setName(ini_data[i][0]);
            flowers.setComment(ini_data[i][1]);
            flowers.setPhoto(ini_data[i][2]);
            ini_list.add(flowers);
        }
        return ini_list;
    }
}
