public class StringMan{
    public String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }

    public Integer getIndexOrNull(String str, char ch){
        if(str.indexOf(ch) == -1){
            return null;
        }
        return str.indexOf(ch);
    }

    public Integer getIndexOrNull(String str1, String str2){
        if(str1.indexOf(str2) == -1){
            return null;
        }
        return str1.indexOf(str2);
    }

    public String concatSubstring(String str1, int num1, int num2, String str2){
        return str1.substring(num1,num2) + str2;
    }
}
