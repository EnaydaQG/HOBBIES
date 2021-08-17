package com.hobbies;

import java.util.*;

public class LikeMusic {

    private ArrayList<Music> playMusic;
    public void addMusic(Music music){
     playMusic.add(music);
    }
    /*private String toString(String autorMusic, String nameMusic, String genreMusic, String typeMusic){
      return "Nombre de la musica:" +nameMusic+"Autor de la musica"+autorMusic+"Genero de la musica"+genreMusic+"Tipo de la musica"+typeMusic;
    }*/
    public LikeMusic(){
     playMusic= new ArrayList<Music>();
    }
    public ArrayList getArrayList(){
        return playMusic;
    }

    }


