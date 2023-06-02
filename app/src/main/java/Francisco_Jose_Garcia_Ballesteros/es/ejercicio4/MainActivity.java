package Francisco_Jose_Garcia_Ballesteros.es.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    CustomViewPagerAdapter customViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager.setOffscreenPageLimit(2);
        customViewPagerAdapter = new CustomViewPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(customViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}