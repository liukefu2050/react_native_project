package com.react_native_project.wxapi;

import android.app.Activity;
import android.os.Bundle;
import com.theweflexwx.react.WeChatModule;

public class WXEntryActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WeChatModule.handleIntent(getIntent());
    finish();
  }
}