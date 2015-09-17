import java.util.*;

public class VENTURESITY_1 {
	
	public static void main(String args[]){
		int n, i;
		String str;
		ArrayList<String> myList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=0;i<n;i++){
			str = in.nextLine();
			if(!myList.contains(str)){
				myList.add(str);
			}
		}
		
		Collections.sort(myList);
		for(String el : myList){
			System.out.println(el);
		}
	}

}
