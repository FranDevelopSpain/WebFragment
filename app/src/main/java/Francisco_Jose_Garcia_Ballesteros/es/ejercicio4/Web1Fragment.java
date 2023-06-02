package Francisco_Jose_Garcia_Ballesteros.es.ejercicio4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Web1Fragment extends Fragment {

    WebView webView1;
    ProgressBar progressBar1;
    String webAddress1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.web1_fragment, container, false);

        webView1 = view.findViewById(R.id.web1WV);
        progressBar1 = view.findViewById(R.id.progB1);
        progressBar1.setVisibility(View.GONE);
        webView1.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar1.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar1.setVisibility(View.GONE);
            }

        });
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;
    }

    public void getWebAction1(String webAddress1){
        this.webAddress1 = webAddress1;
        webView1.loadUrl(webAddress1);
    }
}
