package tes.src.program;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrToCollect {
public static void main(String args[]) {
	String[] arr = new String[5];
	arr[0] = "A";
	arr[1] ="B";
	arr[2] = "C";
	arr[3] ="D";
	arr[4] = "E";
	
	List<String> arrList = new ArrayList<>();
	arrList = Arrays.asList(arr);
	System.out.println("arrlist "+arrList);
	
}
}
