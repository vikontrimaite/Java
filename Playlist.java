// https://www.codecademy.com/courses/learn-java/projects/java-desert-island-playlist
// Arrays and ArrayLists 
// Desert Island Playlist

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Stars");
    desertIslandPlaylist.add("Sky");
    desertIslandPlaylist.add("Sun");
    desertIslandPlaylist.add("Moon");
    desertIslandPlaylist.add("Rain");
    desertIslandPlaylist.add("Cloud");

    System.out.println("Playlist's songs are: " + desertIslandPlaylist);

    System.out.println("The size of the playlist is: " + desertIslandPlaylist.size());

    desertIslandPlaylist.remove(4);
    System.out.println("What's the size of that playlist now? " + desertIslandPlaylist.size());
      System.out.println("The new playlist looks like this: " + desertIslandPlaylist);

      int firstSong = desertIslandPlaylist.indexOf("Sky");
      int secondSong = desertIslandPlaylist.indexOf("Cloud");

      System.out.println("The index of the first stog that is going to change is " + firstSong);
      System.out.println("The index of the second stog that is going to change is " + secondSong);

    String tempA = "Sky";
    desertIslandPlaylist.set(firstSong, "Cloud");
    System.out.println("So how does the playlist look like now?  " + desertIslandPlaylist);
    desertIslandPlaylist.set(secondSong, tempA);
    System.out.println("After the swap playlist look like this:  " + desertIslandPlaylist);

  }
  
}