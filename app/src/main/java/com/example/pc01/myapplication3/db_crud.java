package com.example.pc01.myapplication3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by PC01 on 18/12/2015.
 */
public class db_crud {
    private DBHelper dbHelper;

    public db_crud(Context context) {
        dbHelper = new DBHelper(context);
    }

    public int insert(tb_produk produk) {

        //Open connection to write data
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(tb_produk.KEY_name, produk.name);
        values.put(tb_produk.KEY_price, produk.price);

        // Inserting Row
        long produk_Id = db.insert(tb_produk.TABLE, null, values);
        db.close(); // Closing database connection
        return (int) produk_Id;
    }

    public void delete(int produk_Id) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        // It's a good practice to use parameter ?, instead of concatenate string
        db.delete(tb_produk.TABLE, tb_produk.KEY_ID + "= ?", new String[] { String.valueOf(produk_Id) });
        db.close(); // Closing database connection
    }

    public void update(tb_produk produk) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(tb_produk.KEY_name, produk.name);
        values.put(tb_produk.KEY_price, produk.price);

        // It's a good practice to use parameter ?, instead of concatenate string
        db.update(tb_produk.TABLE, values, tb_produk.KEY_ID + "= ?", new String[] { String.valueOf(produk.produk_ID) });
        db.close(); // Closing database connection
    }

    public ArrayList<HashMap<String, String>> gettb_produkList() {
        //Open connection to read only
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  " +
                tb_produk.KEY_ID + "," +
                tb_produk.KEY_name + "," +
                tb_produk.KEY_price +
                " FROM " + tb_produk.TABLE;

        //tb_produk produk = new tb_produk();
        ArrayList<HashMap<String, String>> produkList = new ArrayList<HashMap<String, String>>();

        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list

        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> produk = new HashMap<String, String>();
                produk.put("id", cursor.getString(cursor.getColumnIndex(tb_produk.KEY_ID)));
                produk.put("name", cursor.getString(cursor.getColumnIndex(tb_produk.KEY_name)));
                produkList.add(produk);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return produkList;

    }

    public tb_produk gettb_produkById(int Id){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  " +
                tb_produk.KEY_ID + "," +
                tb_produk.KEY_name + "," +
                tb_produk.KEY_price +
                " FROM " + tb_produk.TABLE
                + " WHERE " +
                tb_produk.KEY_ID + "=?";// It's a good practice to use parameter ?, instead of concatenate string

        int iCount =0;
        tb_produk produk = new tb_produk();

        Cursor cursor = db.rawQuery(selectQuery, new String[] { String.valueOf(Id) } );

        if (cursor.moveToFirst()) {
            do {
                produk.produk_ID =cursor.getInt(cursor.getColumnIndex(tb_produk.KEY_ID));
                produk.name =cursor.getString(cursor.getColumnIndex(tb_produk.KEY_name));
                produk.price  =cursor.getString(cursor.getColumnIndex(tb_produk.KEY_price));

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return produk;
    }
}
