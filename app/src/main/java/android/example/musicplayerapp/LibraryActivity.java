package android.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        List<String> artistNames = Arrays.asList("A", "B", "C");

        // Set ArtistAdapter
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistNames);
        ListView artistSubscriptionView = (ListView) findViewById(R.id.artist_subscription_list);
        artistSubscriptionView.setAdapter(artistAdapter);

    }
}