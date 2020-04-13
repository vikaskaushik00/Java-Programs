package vikdev.com;

public class Utilities {

    public char[] everyNthChar(char[] sourceArray, int n){
        if(sourceArray == null || sourceArray.length < n){
            return  sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n-1; i < sourceArray.length; i += n){
            result[index++] = sourceArray[i];
        }
        return  result;
    }

    public   String removePairs(String source){
        if (source.length() < 2 || source == null){
            return source;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] string = source.toCharArray();
        for (int i = 0; i < source.length() - 1; i++){
            if (string[i] != string[ i + 1]){
                stringBuilder.append(string[i]);
            }
        }
        stringBuilder.append(string[string.length-1]);
        return stringBuilder.toString();
    }

    public int converter(int a,int b){
        return (a/b) + (a * 30) -2;
    }
    public String nullIfOddLength(String source){
        if (source.length() % 2 == 0){
            return source;
        }
        return null;
    }
}
