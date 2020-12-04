package szabo.fpv.umb.ukladaniezaznamov;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "Contry_DB";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "countrys";
    private static final String COL1 = "id";
    private static final String COL2 = "country";

    public DatabaseHelper(Context context) {

        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME
                + "(" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL2+ " TEXT );");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
