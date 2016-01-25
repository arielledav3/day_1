import java.io.*;
public class floors {
	public static void main(String [] args){
		//start reading input from text file
		String fileName = "stepsfloors.txt";
		String line = null;
		
		//try catch for reading each character
		try{
			FileReader reader = new FileReader(fileName);
			
			BufferedReader buffer = new BufferedReader(reader);
			StringBuilder sb = new StringBuilder();
			
			while((line = buffer.readLine()) != null){
				sb.append(line);
				sb.append(System.lineSeparator());
			} //end while
			
		//close file
			buffer.close();
			String floors = sb.toString();
			
			//print number of floors
			System.out.println("There is " + num_floors(floors) + " floors in this building!");
			
		}catch( FileNotFoundException ex){
			System.out.println("Unable to open " + fileName);
		}catch(IOException ex) {
            ex.printStackTrace();
        }
		
		
	}//end main
	
	public static int num_floors(String textFloors){
		//start putting string into an array
		String [] arrayFloors = textFloors.split("");
		int floor = 0;
		
		for(int i = 0; i < arrayFloors.length; i++){
			if(arrayFloors[i].equals("(")){
				floor = floor+ 1;
			}else if(arrayFloors[i].equals(")")){
				floor = floor - 1;
			}//end if for finding floors
		}
		
		return floor;	
	}

}
