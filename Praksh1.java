
public class Praksh1 {
public static void main(String arg[]){
int i=1;
while (i<50){
	
	System.out.print(i+" - ");
	
	 if(i%3==0 && i%5==0){
			System.out.print("bing bang");	
			}
	 
	 else if(i%3==0){
		System.out.print("bing");
	}
	else if(i%5==0)
	System.out.print("bang");
	else{
	System.out.print("no condition");
	}
	 
	 
	 
	i++;
	System.out.println();
}

}
}