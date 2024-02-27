package week1.day2;

public class LearnArray {
public static void main(String[] args) {
	String[] mentors= {"Rose", "Lotus","Lily","Jasmine"};
	//find length of the array
	//Variable.length->ctrl+2-1
	int length=mentors.length;
	System.out.println("Length of the Array Given:"+length);
	System.out.println("frst name of the array:"+mentors[0]);
	System.out.println("third name of the array:"+mentors[3]);
	System.out.println("last name of the array:"+mentors[length-1]);
}
}
