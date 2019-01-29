package com.cameronbeeler;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
//        String s = "Abracadabra      Alakazam!!";
        String s = "This is an amazing      opportunity     to discuss JAVA ";
        String [] playful = s.split(" ");
        String [] finishString = new String [playful.length];
        String characterLength = s.replaceAll("\\s", "");

        int wordCount = 0;
        for ( int i=0 ; i < playful.length; i++)
        {
            int outputIndex = 0;
            if (!playful[i].isBlank())
            {
                finishString[outputIndex] = playful[i];
//                System.out.println(finishString[outputIndex]);
                outputIndex++;
                wordCount++;
            }

        }
        Set<String> letter = new LinkedHashSet<String>();
        int count = 0;
        String aLetter;
        for(int i=0; i<s.length(); i++)
        {
            aLetter = s.substring(i, i+1);
            letter.add(aLetter);
        }

        Map<String, Integer> letterNumberMap = new HashMap<>();

        //wordcount
        System.out.println("Word count = " + wordCount);
        //nonwhitespace character count
        System.out.println("Non-whitespace character count = " + characterLength.length());
        //Unique breakdown of all characters in the order they appear
        System.out.println("Unique breakdown of all characters in order they appeared...");
        Iterator<String> letterIterator = letter.iterator();
        while (letterIterator.hasNext())
        {
            aLetter = letterIterator.next();
            int aLetterCount = 0;
            for(int i=0;i<s.length();i++)
            {
                if(aLetter.equals(s.substring(i, i+1)))
                {
                    aLetterCount++;
                }
            }
            System.out.println(aLetter + ": " + aLetterCount);
        }
        // to make the map work, I'd need a set based loop with a count on each value going into the map.

        System.out.println("\n\nTRYING WITH MAP\n\n");
        Iterator<String> letterIterator3 = letter.iterator();
        for(int i=0;i<letter.size(); i++)
        {
            String z = letterIterator3.next();
            int aLetterCount=0;

            for (int j=0;j<s.length();j++)
            {

                if(z.equals(s.substring(j, j+1)))
                {
                    aLetterCount++;
                }
            }
            letterNumberMap.put(z, aLetterCount);
        }

        Iterator<String> letterIterator2 = letter.iterator();
        while(letterIterator2.hasNext())
        {
            String a = letterIterator2.next().toString();
            System.out.println(a + ": " + letterNumberMap.get(a));
        }
    }
}
