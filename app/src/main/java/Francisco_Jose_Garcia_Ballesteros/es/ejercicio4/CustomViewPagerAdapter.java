package Francisco_Jose_Garcia_Ballesteros.es.ejercicio4;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.Locale;

public class CustomViewPagerAdapter extends FragmentPagerAdapter {
    StartFragment startFragment;
    Web1Fragment web1Fragment;
    Web2Fragment web2Fragment;
    private Context mContext;

    public CustomViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        mContext = context;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment;

        if (position == 0) {
            if (startFragment == null) {
                startFragment = new StartFragment();
            }
            fragment = startFragment;
        } else if (position == 1) {
            if (web1Fragment == null) {
                web1Fragment = new Web1Fragment();
            }
            fragment = web1Fragment;
        } else if (position == 2) {
            if (web2Fragment == null) {
                web2Fragment = new Web2Fragment();
            }
            fragment = web2Fragment;
        } else {
            fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        Locale locale = Locale.getDefault();

        switch (position) {
            case 0:
                return mContext.getString(R.string.title_0);
            case 1:
                return mContext.getString(R.string.web1);
            case 2:
                return mContext.getString(R.string.web2);
        }
        return null;
    }

    public void getURL1(String webAddress1) {
        web1Fragment.getWebAction1(webAddress1);
    }

    public void getURL2(String webAddress2) {
        web2Fragment.getWebAction2(webAddress2);
    }
}
