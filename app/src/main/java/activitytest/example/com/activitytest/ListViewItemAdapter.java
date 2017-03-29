package activitytest.example.com.activitytest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static activitytest.example.com.activitytest.R.id.item_image;

/**
 * Created by WangYong on 2017-3-29.
 */

public class ListViewItemAdapter extends ArrayAdapter<ListView_item>{
    private int resourceId;

    public ListViewItemAdapter(Context context, int textViewResourceId,
                               List<ListView_item> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListView_item listView_item = getItem(position);
        View view ;
        ViewHolder viewHolder;
        if( convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.item_image = (ImageView) view.findViewById(item_image);
            viewHolder.item_text = (TextView) view.findViewById(R.id.item_textview);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.item_image.setImageResource(listView_item.getImageId());
        viewHolder.item_text.setText(listView_item.getName());
        return view;
    }

    class ViewHolder{
        ImageView item_image;
        TextView item_text;
    }
}
