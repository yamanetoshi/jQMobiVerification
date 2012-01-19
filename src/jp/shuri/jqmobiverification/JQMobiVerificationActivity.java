package jp.shuri.jqmobiverification;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class JQMobiVerificationActivity extends Activity {
	private WebView webView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        
        setContentView(webView);

    }
}