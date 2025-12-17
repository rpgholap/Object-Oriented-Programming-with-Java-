/*
25. Media Player
Scenario: A media player can play both Audio and Video files.
Problem Statement:
● Interface AudioPlayer → method playAudio(String song)
● Interface VideoPlayer → method playVideo(String movie)
● Class MediaPlayer implements both → provides implementation for both methods
Sample Input:
Audio → song="Shape of You"
Video → movie="Inception"
Sample Output:
Playing Audio: Shape of You
Playing Video: Inception
*/

import java.util.Scanner;

// AudioPlayer interface
interface AudioPlayer {
    void playAudio(String song);
}

// VideoPlayer interface
interface VideoPlayer {
    void playVideo(String movie);
}

// MediaPlayer implementing both interfaces
class MediaPlayer implements AudioPlayer, VideoPlayer {
    @Override
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    @Override
    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}

// Main class
public class MPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for song
        System.out.print("Enter the name of the song: ");
        String song = scanner.nextLine();

        // Taking input for movie
        System.out.print("Enter the name of the movie: ");
        String movie = scanner.nextLine();

        // Creating MediaPlayer object
        MediaPlayer player = new MediaPlayer();

        // Playing audio and video
        player.playAudio(song);
        player.playVideo(movie);

        scanner.close();
    }
}

