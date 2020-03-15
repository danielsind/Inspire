package com.moringa.myinspire.model;

public class Quote {
    public String quote;
    public String author;
    public String image_inspiration;

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

    public String getImage_inspiration() {
        return image_inspiration;
    }

    public void setImage_inspiration(String image_inspiration) {
        this.image_inspiration = image_inspiration;
    }
}

//[
//        {
//        "id": 1,
//        "quote": "Never give up",
//        "author": "Daniel",
//        "image_inspiration": "/media/rose_bouquet_buds_115307_1280x720.jpg"
//        },
//        {
//        "id": 2,
//        "quote": "Be a peacemaker",
//        "author": "Danny",
//        "image_inspiration": "/media/guitar_music_strings_musical_instrument_111863_1280x720.jpg"
//        }
//        ]