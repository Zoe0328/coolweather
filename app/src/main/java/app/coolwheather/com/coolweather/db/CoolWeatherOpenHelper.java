package app.coolwheather.com.coolweather.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zoe on 2017/10/29.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {


    // Province 建表语句
    public static final String CREATE_PROVINCE = "crate table Province(" + "id integer primary key autoincrement," +
            "province_name text" +
            "province_code text)";

    //City建表语句

    public static final String CREATE_CITY = "create table City(" + "id integer primary key autoincrement," + "" +
            "city_name text" + "" +
            "city_code text" + "" +
            "province_id integer)";
    //County 建表语句
    public static final String CREATE_COUNTY = "create table County(" + "id integer primary key autoincrement," + "" +
            "county_name text" + "" +
            "county_code text" + "" +
            "county_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
