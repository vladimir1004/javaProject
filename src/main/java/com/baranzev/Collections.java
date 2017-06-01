package com.baranzev;


import java.util.ArrayList;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};
    List<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
    languages.add("PHP");
   //для Эррея ленгз
    for (int i = 0; i < langs.length; i++) {
      System.out.println("I want to learn " + langs[i]);
    }

    for (String l : langs) {
      System.out.println("I want to learn " + l);
    }

    for (String l : languages) {
      System.out.println("I want to learn " + l);

    }
    // для листа сайз
    for (int i = 0; i < languages.size(); i++) {
      System.out.println("I want to learn " + languages.get(i));
    }
  }
}
