//This class examines a user defined array that list in order all the primitive types of 
//the SQL column data of a given table.
public class CalculateDataTypes {
	public int howIntegers(String array[]){
		int howManyIntegers = 0;
		for(int i = 0; i < array.length; i ++){
			if(array[i] == "int"){
				howManyIntegers += 1;
			}
		}
		return howManyIntegers;
	}
	
	public int howStrings(String array[]){
		int howManyStrings = 0;
		for(int i = 0; i < array.length; i ++){
			if(array[i] == "String"){
				howManyStrings += 1;
			}
		}
		return howManyStrings;
	}
}
