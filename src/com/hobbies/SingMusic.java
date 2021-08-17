package com.hobbies;


    public class SingMusic  {
       private LikeMusic favorites;
        public SingMusic() {
           favorites= new LikeMusic();
        }
        public Music ListenNusic(int index){
            Music music= (Music) favorites.getArrayList().get(index);
            return music;
        }
        public LikeMusic getFavorites(){
            return favorites;
        }
        public String sing(){
            return "LA LA LA LA LA ...LA LA LA LA.........";
        }

    }
