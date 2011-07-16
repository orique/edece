package net.orique.edece.core.facilities;

import java.util.List;

import net.orique.edece.core.interfaces.IFilter;

public interface IFacilitiesBO {

	public List<FacilityDTO> getListFacilities();

	public List<FacilityDTO> getListFacilities(IFilter filter);

	public List<FacilityDTO> getListFacilities(long latitude, long longitude,
			int radiusM);

}
