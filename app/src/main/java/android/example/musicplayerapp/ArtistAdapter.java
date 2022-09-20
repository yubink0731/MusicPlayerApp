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

public class ArtistAdapter extends ArrayAdapter<String> {
    public ArtistAdapter(@NonNull Context context, List<String> artistNameList) {
        super(context, 0, artistNameList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list_item, parent, false);
        }

        // Get the {@link String} object located at this position in the list
        String artistName = getItem(position);

        TextView artistView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistView.setText(artistName);

        return listItemView;
    }
}
