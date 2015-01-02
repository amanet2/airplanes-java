import java.util.*;

public class planesCollection
{
	public propPlane getPlane(String s)
	{
		for(propPlane pp : getPlaneCollection())
		{
			if(s.equalsIgnoreCase(pp.name()))
				return pp;
		}
		return null;
	}
	
	ArrayList<propPlane> listOfPlanes;
	
	public ArrayList<propPlane> getPlaneCollection()
	{
		if(listOfPlanes == null)
		{
			listOfPlanes = new ArrayList<propPlane>();
			populatePlanes();
		}
		
		return listOfPlanes;
	}
	
	public void populatePlanes()
	{
		getPlaneCollection().add(new bf109());
		getPlaneCollection().add(new p51());
		getPlaneCollection().add(new fw190());
		getPlaneCollection().add(new sopwithcamel());
		getPlaneCollection().add(new supermarinespitfire());
		getPlaneCollection().add(new dehavillandmosquito());
		getPlaneCollection().add(new p47());
		getPlaneCollection().add(new p39());
	}
	
	public planesCollection()
	{
		listOfPlanes = getPlaneCollection();
	}
}
