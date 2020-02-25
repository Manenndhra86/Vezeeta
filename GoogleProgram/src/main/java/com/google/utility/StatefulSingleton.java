package com.google.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.HashMap;

@SuppressWarnings({"rawtypes", "unused"})
public class StatefulSingleton {
    private static StatefulSingleton instance;
    private final HashMap<String, Object> testData;
    private WebDriver driver = null;
    @SuppressWarnings("CanBeFinal")
    private HashMap<String, LoadableComponent> pages;

    private StatefulSingleton() {
        testData = new HashMap<>();
        pages = new HashMap<>();
    }

    public static synchronized StatefulSingleton instance() {
        if (instance == null) {
            instance = new StatefulSingleton();
        }

        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @SuppressWarnings("unused")
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public HashMap<String, Object> testData() {
        return this.testData;
    }

    public HashMap<String, LoadableComponent> pages() {
        return this.pages;
    }


}
