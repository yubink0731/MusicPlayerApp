package android.example.musicplayerapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMusicList(View view) {
        Intent intentMusic = new Intent(this, MusicActivity.class);
        startActivity(intentMusic);
    }

    public void openLibraryList(View view) {
        Intent intentLibrary = new Intent(this, LibraryActivity.class);
        startActivity(intentLibrary);
    }

    public void openRecommendList(View view) {
        Intent intentRecommend = new Intent(this, RecommendActivity.class);
        startActivity(intentRecommend);
    }
}