package com.example.prueba_progress;

import android.app.Activity;
import android.os.Bundle;
import android.text.style.URLSpan;
import android.webkit.WebView;
import android.widget.TextView;

public class Progress_barActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		WebView wv = (WebView) findViewById(R.id.webView);
		wv.loadUrl("file:///android_asset/hola_mundo.html");
		//wv.loadUrl("http://www.yahoo.com");
//		TextView tv = (TextView) findViewById(R.id.link);
//		WebView wv = (WebView) findViewById(R.id.webView);
//		URLSpan[] urlSpans = tv.getUrls();
//		for (URLSpan urlSpan : urlSpans) {
//			wv.loadUrl(urlSpan.getURL());
//		}
	}

}