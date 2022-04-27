package com.weather;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        version = 1,
        description = "",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class Weather extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public Weather(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "TINYDB Course to function")
    public void TinyDB(string ProductID){

    }

    @SimpleEvent(description = "Course Event")
    public void TinyDB(){
        EventDispatcher.dispatchEvent(this, "TestEvent");
    }

public int ProductName
int ProductName
viewProduct.getProductName
return ProductName;


public int ProductID
int ProductID
viewProduct.getProductID
return ProductID;

}