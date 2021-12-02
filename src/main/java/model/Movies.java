package model;


import com.google.gson.annotations.SerializedName;

public class Movies {
    @SerializedName("movieId")
     int movieId;
    @SerializedName("title")
     String title;
    @SerializedName("genres")
     String genres;


}
