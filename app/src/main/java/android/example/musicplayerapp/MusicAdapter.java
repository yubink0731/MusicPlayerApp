package android.example.musicplayerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<MusicInfo> {
    public MusicAdapter(@NonNull Context context, List<MusicInfo> musicList) {
        super(context, 0, musicList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list_item, parent, false);
        }

        // Get the {@link MusicInfo} object located at this position in the list
        MusicInfo currentMusic = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // TODO: Set image...

        TextView titleView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleView.setText(currentMusic.getTitle());

        TextView artistView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistView.setText(currentMusic.getArtist());

        return listItemView;
    }
}
