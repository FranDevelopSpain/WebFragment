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

public class Web2Fragment extends Fragment {

    WebView webView2;
    ProgressBar progressBar2;
    String webAddress2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.web2_fragment, container, false);

        webView2 = view.findViewById(R.id.web2WV);
        progressBar2 = view.findViewById(R.id.progB2);
        progressBar2.setVisibility(View.GONE);

        webView2.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar2.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar2.setVisibility(View.GONE);
            }
        });
        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;
    }

    public void getWebAction2(String webAddress2){
        this.webAddress2 = webAddress2;
        webView2.loadUrl(webAddress2);
    }
}
