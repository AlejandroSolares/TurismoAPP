package com.dsgn4apps.appmap;

/**
 * Created by César and Alejandro
 */
public class Configurations {



    //GENERAL---------------------------------------------------------------------------------------
    //Server URL - (remember the '/' at the end)
    public static String SERVER_URL = "http://www.dsgn4apps.com/";

    //Image slideshow timer
    public final static int SLIDESHOW_TIME_SECONDS = 8;

    //categories displayed in navigation bar? (true/false)
    public final static boolean DISPLAY_CATEGORIES_IN_NAVIGATION_DRAWER = true;

    //Categories to show in navigation drawer
    public final static int CATEGORIES_TO_SHOW_IN_NAVIGATION_DRAWER = 10;

    //Default place rating for when no one has rated yet
    public final static int DEFAULT_PLACE_RATING = 3;

    //enable user login
    public final static boolean ENABLE_USER_SYSTEM = true;

    //enable news
    public final static boolean ENABLE_NEWS = true;

    //show Splash Screen background image
    public final static boolean SHOW_SPLASH_SCREEN_BACKGROUND_IMAGE = false;

    //show the small icon next to the categories? (true/false)
    public final static boolean SHOW_CATEGORIES_ICONS = true;


    //LIST TYPE------------------------------------------------------------------------------------
    public final static int LIST_2COLUMNS = 1, LIST_1COLUMNS = 2;
    public final static int LIST_MENU_TYPE = LIST_2COLUMNS;




    //OPTIONAL - Leave 'PUBLIC_KEY' empty to disable in-app purchase.
    public final static String PUBLIC_KEY = "";

    // For testing use:  "android.test.purchased";  to make the purchase always accepted without an actual payment
    //Needs to be the same as the product id used in the Google Play Dashboard
    public final static String SKU_PREMIUM ="your_premium_upgrade_sku_here";
    //public final static String SKU_PREMIUM = "android.test.purchased";//uncomment this for testing


    //FIREBASE PUSH NOTIFICATION--------------------------------------------------------------------
    public final static String FIREBASE_PUSH_NOTIFICATION_TOPIC = "news";


    //TEST DEVICES----------------------------------------------------------------------------------
    //This is use so that ads aren't shown on test devices. Just put a list of device uuids.
    public final static String[] TEST_DEVICES = new String[]{};

}
