package app.shahjee.com.usermanagement;

import android.database.sqlite.SQLiteDatabase;
import android.view.Display;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

public class Database {


    Database()
    {
        SQLiteDatabase db = openOrCreateDatabase("UserManagement", null, null);
        String query = tableQuery();
        db.execSQL(query);
    }

    public String tableQuery()
    {
        String tblQuery = "CREATE TABLE Users( " +
                " id INTEGER PRIMARY KEY AUTOINCREMENT " +
                " username text NOT NULL,"+
                " email text NOT NULL UNIQUE,"+
                " number text NOT NULL UNIQUE,"+
                " password text NOT NULL"+
                " )";
        return tblQuery;
    }


}
