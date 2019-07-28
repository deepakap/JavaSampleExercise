/**
 * 
 */
package com.algos;

/**
 * @author deepa
 *
 */
import java.util.*;

class FrequencyOfCharacters {
  public static void main(String[] args) {
    System.out.println("Find frequency of given character array sequence !");

    char[] data = {'s','p','r','i','n','g','i','c','o','o','l'};

    System.out.println( " for input "+Arrays.toString(data)+" frquency of q is "+fnFindCharFrequency(data, 'q'));

    firstNonRepetCharacter(data);
    
  }


	public static int fnFindCharFrequency(char[] data, char chFreq) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < data.length; i++) {

			if (!hm.containsKey(data[i])) {
				hm.put(data[i], 1);
			} else {
				hm.put(data[i], hm.get(data[i]) + 1);
			}

		}
		if(null!=hm.get(chFreq))
			  return hm.get(chFreq);

			  return -1;
	}
	
	public static void firstNonRepetCharacter(char[] data) {

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < data.length; i++) {
			if (!hm.containsKey(data[i])) {
				hm.put(data[i], 1);
			} else {
				hm.put(data[i], hm.get(data[i]) + 1);
			}
		}

		Iterator itr = hm.keySet().iterator();

		System.out.println("int value :  >  " + Character.getNumericValue('2'));

		while (itr.hasNext()) {

			Character ch = (Character) itr.next();
			if (hm.get(ch) == 1) {
				System.out.println(" first non repeted character is " + ch);
				break;
			} else {
				System.out.println("no mapping found !");
			}
		}
	}
}