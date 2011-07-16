package net.orique.test.edece.core.facilities;

import java.util.List;

import junit.framework.TestCase;
import net.orique.edece.core.facilities.FacilityDTO;
import net.orique.edece.core.facilities.FacilityFactory;
import net.orique.edece.core.facilities.IFacilitiesBO;
import net.orique.edece.core.interfaces.IFilter;

public class FacilitiesBOTest extends TestCase {

	private IFacilitiesBO bo = null;
	private IFilter filter = null;
	long latitude = 0;
	long longitude = 0;
	int radiusM = 0;

	public void setUp() {
		bo = FacilityFactory.getInstance();
	}

	public void testListFacilities() {
		List<FacilityDTO> ret = bo.getListFacilities();
		assertNotNull("bo.getListFacilities() returns null", ret);
		assertTrue("bo.getListFacilities() returns no data", ret.size() > 0);
	}

	public void testListFacilitiesFilter() {
		List<FacilityDTO> ret = bo.getListFacilities(filter);
		assertNotNull("bo.getListFacilities(filter) returns null", ret);
		assertTrue("bo.getListFacilities(filter) returns no data",
				ret.size() > 0);
	}

	public void testListFacilitiesPosition() {
		List<FacilityDTO> ret = bo.getListFacilities(latitude, longitude,
				radiusM);
		assertNotNull("bo.getListFacilities(lat,lon,rad) returns null", ret);
		assertTrue("bo.getListFacilities(lat,lon,rad) returns no data",
				ret.size() > 0);
	}

}
