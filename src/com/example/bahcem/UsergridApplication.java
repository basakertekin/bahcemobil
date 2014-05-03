package com.example.bahcem;

import android.app.Application;
import com.apigee.sdk.ApigeeClient;

public class UsergridApplication extends Application {
	
	private ApigeeClient mDataClient;
	 
    public UsergridApplication() {
    }
 
    public ApigeeClient getmDataClient() {
        return mDataClient;
    }
 
    public void setmDataClient(ApigeeClient mDataClient) {
        this.mDataClient = mDataClient;
    }

}
