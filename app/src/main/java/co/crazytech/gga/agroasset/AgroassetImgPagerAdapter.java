package co.crazytech.gga.agroasset;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import co.crazytech.gga.R;
import ctcommons.SimpleObject;

/**
 * Created by Eric on 7/24/2017.
 */

public class AgroassetImgPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    public AgroassetImgPagerAdapter(Context context) {
        List<SimpleObject> imgObjs;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.agroasset_image,container);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);

        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (View) o;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
