package net.orique.edece.core.facilities;

public class FacilityFactory {

	private static IFacilitiesBO instance = null;

	public static IFacilitiesBO getInstance() {

		if (instance == null)
			instance = new FacilitiesBO();

		return instance;

	}

}
