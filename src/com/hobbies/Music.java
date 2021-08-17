package com.hobbies;

public class Music {
    String nameMusic;
    String typeMusic;
    String genreMusic;
    String autorMusic;

    public Music(String nameMusic, String typeMusic, String genreMusic, String autorMusic) {
        this.nameMusic = nameMusic;
        this.typeMusic = typeMusic;
        this.genreMusic = genreMusic;
        this.autorMusic = autorMusic;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public String getTypeMusic() {
        return typeMusic;
    }
    public String getGenreMusic() {
        return genreMusic;
    }
    public String getAutorMusic() {
        return autorMusic;
    }
}
