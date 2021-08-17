package com.hobbies;

public class Main {

    public static void main(String[] args) {
	Mp3Music mp3like=new Mp3Music();
		for (int i = 0; i < mp3like.getListMusic().getFavorites().getArrayList().size(); i++) {
			System.out.printf("MY FAVORITE MUSIC IS:");
			System.out.println("---------------------------------------------");
			Music aux= (Music) mp3like.getListMusic().getFavorites().getArrayList().get(i);
			System.out.println("NAME OF MUSIC IS:"+" "+aux.getNameMusic());
			System.out.println("AUTHOR OF MUSIC IS:"+" "+aux.getAutorMusic());
			System.out.println("GENDER OF THE MUSIC IS:"+" "+aux.getGenreMusic());
			System.out.println("TYPE OF THE MUSIC IS :"+" "+aux.getTypeMusic());
		}


		System.out.println("I AM SINGING THE FOLLOWING MUSIC:"+ " " +mp3like.getListMusic().ListenNusic(0).getNameMusic());
	}

}
