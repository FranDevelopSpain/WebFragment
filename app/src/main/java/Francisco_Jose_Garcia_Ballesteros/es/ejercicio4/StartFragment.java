package Francisco_Jose_Garcia_Ballesteros.es.ejercicio4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

public class StartFragment extends Fragment {

    EditText eT1, eT2;
    Button button1, button2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.start_fragment, container, false);

        eT1 = view.findViewById(R.id.eT1);
        eT2 = view.findViewById(R.id.eT2);
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);

        button1.setOnClickListener( view12 -> {
            String check = eT1.getText().toString();
            String webAddress1 = ("https://" + check);
            if (!check.equals("")) {
                ((MainActivity) getActivity()).viewPager.setCurrentItem(1);
                ((MainActivity) getActivity()).customViewPagerAdapter.getURL1(webAddress1);
                eT1.setText(null);
            } else {
                String errorET = getString(R.string.error);
                Snackbar.make( view12, errorET, Snackbar.LENGTH_SHORT).show();
            }
        } );

        button2.setOnClickListener( view1 -> {
            String check = eT2.getText().toString();
            String webAddress2 = ("https://" + check);
            if (!check.equals("")) {
                ((MainActivity) getActivity()).viewPager.setCurrentItem(2);
                ((MainActivity) getActivity()).customViewPagerAdapter.getURL2(webAddress2);
                eT2.setText(null);
            } else {
                String error = getString(R.string.error);
                Snackbar.make( view1, error, Snackbar.LENGTH_SHORT).show();
            }
        } );

        return view;
    }
}
