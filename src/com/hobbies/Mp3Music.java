package com.hobbies;

public class Mp3Music {
    private SingMusic listMusic;
    public Mp3Music() {
        Music music1= new Music("COMO AGUAN EN EL DECIERTO","COGRGACIONAL","CULTA","GRUPO ESPERANZA");
        Music music2 = new Music("MI TIERRA QUERIDA","INSTRUMENTAL","FOLCKOR","LSO DEL PUEBLO");
        Music music3 = new Music("FREE SWIM IN THE OCEAN","SWING","CLASIC","LOS PICAPIEDRAS");
        Music music4 = new Music("DON'T GET COMFORTABLE","ROMANTIC","CLASIC","BRANDON HEATH KNELL");
       listMusic= new SingMusic();
        listMusic.getFavorites().addMusic(music1);
        listMusic.getFavorites().addMusic(music2);
        listMusic.getFavorites().addMusic(music3);
        listMusic.getFavorites().addMusic(music4);
    }

    public SingMusic getListMusic() {
        return listMusic;
    }
}
