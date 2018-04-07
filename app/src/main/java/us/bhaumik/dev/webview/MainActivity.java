package us.bhaumik.dev.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //his.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        WebView webView;

        webView = findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(false);
        webView.setWebViewClient(new InBrowser());
        /* comment */
        webView.loadUrl("http://safarnama.bhaumik.us");
    }

    private class InBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
