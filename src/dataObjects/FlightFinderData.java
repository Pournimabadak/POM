package dataObjects;

import java.util.ArrayList;

public class FlightFinderData {

	public int departingFrom()
	{
		return 10;
	}

	public ArrayList<String> wsFromPortValues()
	{
		ArrayList<String> wsFromPortList = new ArrayList<>();
		wsFromPortList.add("Acapulco");
		wsFromPortList.add("Frankfurt");
		wsFromPortList.add("London");
		wsFromPortList.add("New York");
		wsFromPortList.add("Paris");
		wsFromPortList.add("Portland");
		wsFromPortList.add("San Francisco");
		wsFromPortList.add("Seattle");
		wsFromPortList.add("Sydney");
		wsFromPortList.add("Zurich");

			
		return wsFromPortList;
	

	}
	

}
