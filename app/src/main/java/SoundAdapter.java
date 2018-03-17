import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ft.briantaylorsoundboard.R;
import com.ft.briantaylorsoundboard.Sound;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Fabian Tauriello on 17-Mar-18.
 */

// The SoundAdapter will actually populate the data into the RecyclerView. The adapter's
// role is to convert an object at a position into a cell item to be inserted.
// HOWEVER, with a RecyclerView the adapter requires the existence of a "ViewHolder" object
// which describes and provides access to all the views within each cell. I have created
// the basic empty adapter and holder together below

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class SoundAdapter extends RecyclerView.Adapter<SoundAdapter.ViewHolder> {

    // Store a member variable for the buttons
    private List<Sound> sounds;
    // Store the context for easy access
    private Context context;

    public SoundAdapter(List<Sound> sounds, Context context) {
        this.sounds = sounds;
        this.context = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return context;
    }

    // Every adapter has three primary methods:
    // - onCreateViewHolder to inflate the item layout and create the holder
    // - onBindViewHolder to set the view attributes based on the data
    // - getItemCount to determine the number of items.
    // We need to implement all three to because we are extending an abstract class

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the custom layout
        View newView = inflater.inflate(R.layout.layout_button, parent, false);

        // return a new holder instance
        ViewHolder viewHolder = new ViewHolder(newView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get the data model based on position
        Sound sound = sounds.get(position);

        // *****************************************
        // Set cell based on the views and data model
        Button button = holder.soundButton;
        button.setText(sound.getName());
        // *****************************************

    }

    // Returns the total count of items in the grid
    @Override
    public int getItemCount() {
        return sounds.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // The holder should contain a member variable
        // for any view that will be set as it's rendered in a cell
        public Button soundButton;

        // We also create a constructor that accepts the entire item cell
        // and does the view lookups to find each subview (subview = view inside another view)
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            soundButton = (Button) itemView.findViewById(R.id.btnSound);
        }

    }
}
