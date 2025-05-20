/*
 * John Robert R.
 */
public class WordHelper {
    public static String[] sortByVowels(String[] words)
    {
        String[] vowelSort = new String[words.length];
        for (int i = 0; i < vowelSort.length; i++)
        {
            vowelSort[i] = words[i];
        }
        boolean swapped = true;
        while (swapped)
        {
            swapped = false;
            for (int i = 0; i < vowelSort.length - 1; i++)
            {
                String one = vowelSort[i], two = vowelSort[i+1];
                int v1 = 0, v2 = 0;
                //Confirm vowel count for first String
                for (int j = 0; j < one.length(); j++)
                {
                    if (one.substring(j, j+1).equalsIgnoreCase("a"))
                    {
                        v1++;
                    }
                    else if(one.substring(j, j+1).equalsIgnoreCase("e"))
                    {
                        v1++;
                    } 
                    else if(one.substring(j, j+1).equalsIgnoreCase("i"))
                    {
                        v1++;
                    }
                    else if (one.substring(j, j+1).equalsIgnoreCase("o"))
                    {
                        v1++;
                    } 
                    else if (one.substring(j, j+1).equalsIgnoreCase("u"))
                    {
                        v1++;
                    }
                    else if(one.substring(j, j+1).equalsIgnoreCase("y"))
                    {
                        v1++;
                    }
                    else 
                    {

                    }
                }
                //Confirm for second string
                for (int j = 0; j < two.length(); j++)
                {
                    if (two.substring(j, j+1).equalsIgnoreCase("a"))
                    {
                        v2++;
                    }
                    else if(two.substring(j, j+1).equalsIgnoreCase("e"))
                    {
                        v2++;
                    } 
                    else if(two.substring(j, j+1).equalsIgnoreCase("i"))
                    {
                        v2++;
                    }
                    else if (two.substring(j, j+1).equalsIgnoreCase("o"))
                    {
                        v2++;
                    } 
                    else if (two.substring(j, j+1).equalsIgnoreCase("u"))
                    {
                        v2++;
                    }
                    else if(two.substring(j, j+1).equalsIgnoreCase("y"))
                    {
                        v2++;
                    }
                    else 
                    {

                    }
                }
                if (v1 > v2)
                {
                    String temp = vowelSort[i];
                    vowelSort[i] = vowelSort[i+1];
                    vowelSort[i+1] = temp;
                    swapped = true;
                }
            }
        }
        return vowelSort;
    }
    public static String[] sortByConsonants(String[] words)
    {
        String[] consonantSort = new String[words.length];
        for (int i = 0; i < consonantSort.length; i++)
        {
            consonantSort[i] = words[i];
        }
        boolean swapped = true;
        //Set statements up to read "not-vowels"
        while (swapped)
        {
            swapped = false;
            for (int i = 0; i < consonantSort.length - 1; i++)
            {
                String one = consonantSort[i], two = consonantSort[i+1];
                int v1 = 0, v2 = 0;
                //Confirm the consonant count for first string
                for (int j = 0; j < one.length(); j++)
                {
                    if (one.substring(j, j+1).equalsIgnoreCase("a"))
                    {
                        
                    }
                    else if(one.substring(j, j+1).equalsIgnoreCase("e"))
                    {
                        
                    } 
                    else if(one.substring(j, j+1).equalsIgnoreCase("i"))
                    {
                        
                    }
                    else if (one.substring(j, j+1).equalsIgnoreCase("o"))
                    {
                        
                    } 
                    else if (one.substring(j, j+1).equalsIgnoreCase("u"))
                    {

                    }
                    else if (one.substring(j, j+1).equalsIgnoreCase("y"))
                    {

                    }
                    else 
                    {
                        v1++;
                    }
                }
                //Confirm for second string
                for (int j = 0; j < two.length(); j++)
                {
                    if (two.substring(j, j+1).equalsIgnoreCase("a"))
                    {
                        
                    }
                    else if(two.substring(j, j+1).equalsIgnoreCase("e"))
                    {
                        
                    } 
                    else if(two.substring(j, j+1).equalsIgnoreCase("i"))
                    {
                        
                    }
                    else if (two.substring(j, j+1).equalsIgnoreCase("o"))
                    {
                        
                    } 
                    else if (two.substring(j, j+1).equalsIgnoreCase("u"))
                    {
                        
                    }
                    else if (two.substring(j, j+1).equalsIgnoreCase("y"))
                    {

                    }
                    else 
                    {
                        v2++;
                    }
                }
                if (v1 > v2)
                {
                    String temp = consonantSort[i];
                    consonantSort[i] = consonantSort[i+1];
                    consonantSort[i+1] = temp;
                    swapped = true;
                }
            }
        }
        return consonantSort;
    }
    public static String[] sortByLength(String[] words)
    {
        String[] lengthSort = new String[words.length];
        for (int i = 0; i < lengthSort.length; i++)
        {
            lengthSort[i] = words[i];
        }
        boolean swapped = true;
        while (swapped)
        {
            swapped = false;
            for (int i = 0; i < lengthSort.length - 1; i++)
            {
                String one = lengthSort[i], two = lengthSort[i+1];
                if (one.length() > two.length())
                {
                    String temp = lengthSort[i];
                    lengthSort[i] = lengthSort[i+1];
                    lengthSort[i+1] = temp;
                    swapped = true;
                }
            }
        }
        return lengthSort;
    }

}
