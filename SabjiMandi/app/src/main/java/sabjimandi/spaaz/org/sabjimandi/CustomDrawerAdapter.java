package sabjimandi.spaaz.org.sabjimandi;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pratik kothari on 9/11/2015.
 */
public class CustomDrawerAdapter extends ArrayAdapter {
    Context context;
    List<DrawerItem> drawerItemList;
    int layoutResID;
    public CustomDrawerAdapter(Context context, int resource, List<DrawerItem> listItems)
    {
        super(context, resource,listItems);
        this.context=context;
        this.drawerItemList=listItems;
        this.layoutResID=resource;
    }
    private static class DrawerItemHolder
    {
        TextView ItemName;
        ImageView icon;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        DrawerItemHolder drawerholder;
        View view=convertView;
        if(view==null)
        {
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            drawerholder= new DrawerItemHolder();
            view=inflater.inflate(layoutResID,parent,false);
            drawerholder.ItemName=(TextView)view.findViewById(R.id.drawer_itemName);
            drawerholder.icon=(ImageView)view.findViewById(R.id.drawer_icon);
            view.setTag(drawerholder);
        }
        else{
            drawerholder =(DrawerItemHolder)view.getTag();
        }
        DrawerItem dItem=(DrawerItem)this.drawerItemList.get(position);
        drawerholder.icon.setImageDrawable(view.getResources().getDrawable(dItem.getImgResID()));
        drawerholder.ItemName.setText(dItem.getItemName());
        return view;
    }
}

