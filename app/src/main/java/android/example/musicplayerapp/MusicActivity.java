package android.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MusicActivity extends AppCompatActivity {

    List<MusicInfo> topSongs = new ArrayList<>();
    List<MusicInfo> popularSongs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        // Create top song list
        topSongs.add(new MusicInfo("Never Gonna Give You Up", "Rick Astley"));
        topSongs.add(new MusicInfo("Blinding Lights", "The Weeknd"));
        topSongs.add(new MusicInfo("Left and Right", "Charlie Puth"));
        topSongs.add(new MusicInfo("As It Was", "Harry Styles"));
        topSongs.add(new MusicInfo("Dance Monkey", "Tones and I"));

        // Create popular song list
        popularSongs.add(new MusicInfo("Levitating", "Dua Lipa"));
        popularSongs.add(new MusicInfo("City of Angels", "Em Beihold"));
        popularSongs.add(new MusicInfo("Sign of the Times", "Harry Styles"));
        popularSongs.add(new MusicInfo("Watermelon Sugar", "Harry Styles"));
        popularSongs.add(new MusicInfo("Sunroof", "Nicky Youre"));
        popularSongs.add(new MusicInfo("Light Switch", "Charlie Puth"));
        popularSongs.add(new MusicInfo("Cash In Cash Out", "Pharrel Williams"));

        // Set Top Songs MusicAdapter
        MusicAdapter topSongsAdapter = new MusicAdapter(this, topSongs);
        ListView topSongsView = (ListView) findViewById(R.id.top_songs_list);
        topSongsView.setAdapter(topSongsAdapter);

        // Set Popular Songs MusicAdapter
        MusicAdapter popularSongsAdapter = new MusicAdapter(this, popularSongs);
        ListView popularSongsView = (ListView) findViewById(R.id.popular_songs_list);
        popularSongsView.setAdapter(popularSongsAdapter);

    }
}