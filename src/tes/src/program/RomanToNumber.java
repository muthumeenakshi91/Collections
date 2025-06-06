package tes.src.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToNumber {
	public static void main(String args[]) {
		
Map<Character, Integer> valueMap = new HashMap<>();
		
		valueMap.put('I', 1);
		valueMap.put('V', 5);
		valueMap.put('X', 10);
		valueMap.put('L', 50);
		valueMap.put('C', 100);
		valueMap.put('D', 500);
		valueMap.put('M', 1000);
		
		String input = "MCMXCIV"; //"LVIII";
		char[] charArr = input.toCharArray();
		int sum = 0;
		for(int i=0; i<charArr.length; i++) {
			if(i+1 < charArr.length) {
				if( valueMap.get(charArr[i]) >= valueMap.get(charArr[i+1])) {
					sum += valueMap.get(charArr[i]);
				} else if( valueMap.get(charArr[i]) < valueMap.get(charArr[i+1])) {
					sum += valueMap.get(charArr[i+1]) - valueMap.get(charArr[i]);
					i = i+1;
				} 
			} else {
				sum += valueMap.get(charArr[i]);
			}
		}
		System.out.println("Sum "+sum);
	}
}
