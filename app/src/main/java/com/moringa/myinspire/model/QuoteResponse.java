
package com.moringa.myinspire.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class QuoteResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("image_inspiration")
    @Expose
    private String imageInspiration;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QuoteResponse() {
    }

    /**
     * 
     * @param quote
     * @param author
     * @param id
     * @param imageInspiration
     */
    public QuoteResponse(Integer id, String quote, String author, String imageInspiration) {
        super();
        this.id = id;
        this.quote = quote;
        this.author = author;
        this.imageInspiration = imageInspiration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageInspiration() {
        return imageInspiration;
    }

    public void setImageInspiration(String imageInspiration) {
        this.imageInspiration = imageInspiration;
    }

}
