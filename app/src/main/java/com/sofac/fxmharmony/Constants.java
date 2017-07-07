package com.sofac.fxmharmony;

public class Constants {

    public static final String CLOUD_API_KEY = "AIzaSyDZJmgv9fvQnQkc5vvCx8bPFcUqSYDVhnM";

    /*Имя хранения preference*/
    public final static String IS_AUTHORIZATION = "IS_AUTHORIZATION";
    public final static String PUSH_MASSEGES = "PUSH_MASSEGES";

    public final static String GOOGLE_CLOUD_PREFERENCE = "GOOGLE_CLOUD_PREFERENCE";
    public static final String APP_PREFERENCES = "APP_PREFERENCES";

    public final static String SERVER_REQUEST_ERROR = "SERVER_REQUEST_ERROR";
    public final static String AUTHORIZATION_REQUEST = "AUTHORIZATION_REQUEST";

    public final static String REQUEST_SUCCESS = "REQUEST_SUCCESS";
    public final static String USER_ID_PREF = "USER_ID_PREF";
    public final static String ONE_PUSH_MESSAGE_DATA = "ONE_PUSH_MESSAGE_DATA";
    public final static String ONE_POST_DATA = "ONE_POST_DATA";

    // urls

    //public final static String BASE_URL = "http://52.211.242.225:8080/";
    //public final static String BASE_URL = "http://192.168.3.110:8080/";
    //public final static String BASE_URL = "http://192.168.0.32:8080/";
    public final static String BASE_URL = "http://52.211.242.225:8080/";

    //Group requests
    public final static String LOAD_ALL_POSTS_REQUEST = "LOAD_ALL_POSTS_REQUEST";
    public final static String LOAD_COMMENTS_REQUEST = "LOAD_COMMENTS_REQUEST";
    public final static String WRITE_POST_REQUEST = "WRITE_POST_REQUEST";
    public final static String WRITE_COMMENT_REQUEST = "WRITE_COMMENT_REQUEST";
    public final static String DELETE_POST_REQUEST = "DELETE_POST_REQUEST";
    public final static String DELETE_COMMENT_REQUEST = "DELETE_COMMENT_REQUEST";
    public final static String UPDATE_POST_REQUEST = "UPDATE_POST_REQUEST";
    public final static String UPDATE_COMMENT_REQUEST = "UPDATE_COMMENT_REQUEST";

    //Settings requests
    public final static String CHANGE_NAME_REQUEST = "CHANGE_NAME_REQUEST";
    public final static String CHANGE_AVATAR_REQUEST = "CHANGE_AVATAR_REQUEST";
    public final static String DELETE_AVATAR_REQUEST = "DELETE_AVATAR_REQUEST";

    // Controller's name
    public final static String APP_EXCHANGE = "APP_EXCHANGE";
    public final static String GROUP_EXCHANGE = "GROUP_EXCHANGE";
    public final static String SETTINGS_EXCHANGE = "SETTINGS_EXCHANGE";

    // Push message types
    public final static String ESTIMATE_CASE_PUSH_TYPE = "ESTIMATE_CASE_PUSH_TYPE";
    public final static String GROUP_PUSH_TYPE = "GROUP_PUSH_TYPE";

    // Push message state
    public final static int PUSH_ON = 10001;
    public final static int PUSH_OFF = 10002;

}
