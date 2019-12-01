public class HashMapFunctions {

    public static String hashFunctionOne(String key) {
        if (key.length() > 0) {
            return String.valueOf(key.charAt(0)).toLowerCase();
        }
        return null;
    }

    public static String hashFunctionTwo(String key) {
        if (key.length() > 0) {
            return String.valueOf(key.charAt(1)).toLowerCase();
        }
        return null;
    }

    public static String hashFunctionThree(String key) {
        if (key.length() > 1) {
            return String.valueOf(key.charAt(0)).toLowerCase()+String.valueOf(key.charAt(1)).toLowerCase();
        }
        return null;
    }
}
