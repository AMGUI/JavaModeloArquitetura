package model;


import com.google.gson.annotations.SerializedName;

public class Movies {

    @SerializedName("movieId")
    public  int movieId;
    @SerializedName("title")
    public String title;
    @SerializedName("genres")
    public String genres;


}
