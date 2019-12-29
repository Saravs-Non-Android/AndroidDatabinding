package codingwithmitch.com.databindinggettingstarted.util;


/**
 * Helper class for dynamic substitution of int values in layout file
 */
public class StringUtil {

    public static String getQuantityString(int quantity){
        return ("Qty: " + String.valueOf(quantity));
    }

    // used to conver the int value to string and append strings to format the value
    //this concatination cannot be directly done in the xml file.
    public static String convertIntToString(int value){
        return ("("+String.valueOf(value)+")");
    }



}









