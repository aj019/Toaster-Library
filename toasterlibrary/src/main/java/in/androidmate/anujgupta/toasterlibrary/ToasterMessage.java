package in.androidmate.anujgupta.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by anujgupta on 29/12/17.
 */

public class ToasterMessage {

    public static void s(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
