package com.stringsandarrayas.algorithms.abhilash;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringProblemsCh1 {

	public static void main(String[] args) {
		// System.out.println(firstNonRepeated("abbhillasshrrajjakkootti"));
		// System.out.println("bhlsh rjkt".equals(removeCharacters("abhilash rajakoti",
		// "aeiou")));
		//String string = new String("try to do or not to do,but no to try");
		//System.out.println(string);
		//char[] str = string.toCharArray();
		//reverseWordsV2(str);
		//System.out.println(str);
		char[] strArray="-2396805".toCharArray();
        System.out.println(stringToint(strArray));
	}

	// find the first non repeated character in a string

	public static String firstNonRepeated(String s) {
		Map<Integer, Object> countMap = new HashMap<>();
		Object seenOnce = new Object();
		Object seenMultiple = new Object();
		Object seen;

		for (int i = 0; i < s.length();) {
			final int cp = s.codePointAt(i);
			i += Character.charCount(cp);
			seen = countMap.get(cp);
			if (seen == null) {
				countMap.put(cp, seenOnce);
			} else if (seen == seenOnce) {
				countMap.put(cp, seenMultiple);
			}
		}

		for (int i = 0; i < s.length();) {
			final int cp = s.codePointAt(i);
			i += Character.charCount(cp);
			if (countMap.get(cp) == seenOnce) {
				return new String(Character.toChars(cp));
			}
		}
		return "";

	}

	public static String removeCharacters(String str, String remove) {
		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();
		int src, dest = 0;
		boolean[] lookUp = new boolean[128];

		for (int i = 0; i < r.length; i++) {
			lookUp[r[i]] = true;
		}

		for (src = 0; src < s.length; src++) {
			if (!lookUp[s[src]]) {
				s[dest++] = s[src];
			}
		}
		return new String(s, 0, dest);
	}

	public static boolean reverseWordsV1(char[] str) {
		int strLength = str.length;
		char[] buffer = new char[strLength];
		int tokenStart, tokenEnd;
		int currPos, buffPos = 0;
		currPos = strLength - 1;
		while (currPos >= 0) {
			if (str[currPos] == ' ')
				buffer[buffPos++] = str[currPos--];
			else {
				tokenEnd = currPos;
				while (currPos >= 0 && str[currPos] != ' ')
					currPos--;
				tokenStart = currPos + 1;
				while (tokenStart <= tokenEnd)
					buffer[buffPos++] = str[tokenStart++];

			}

		}
		currPos++;
		while (currPos < strLength) {
			str[currPos] = buffer[currPos];
			currPos++;
		}

		return true;
	}

	public static boolean reverseWordsV2(char[] str) {
		int strLength=str.length,start=0,end=0;
		reverseString(str,0,strLength-1);
		while(end<strLength) {
			if(str[end]==' ')
				end++;
			else {
				start=end;
				while(end<strLength && str[end]!=' ')
					end++;
				reverseString(str, start, end-1);
			}
		}
		return true;
	}

	public static void reverseString(char[] str, int start, int end) {
		char temp;
		while(end>start) {
			temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static int stringToint(char[] str) {
		int strLength=str.length;
		int sum=0;int start=0;
		boolean neg=false;
		if(str[start]=='-') {
			neg=true;
			start=1;
		}
		while(start<strLength) {
			sum=sum*10;
			sum=sum+(str[start]-'0');
			start++;
		}
		if(neg) {
			sum=-sum;
		}
		return sum;
	}

}
