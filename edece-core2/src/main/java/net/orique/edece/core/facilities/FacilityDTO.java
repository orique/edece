package net.orique.edece.core.facilities;

import java.util.List;

public class FacilityDTO {

	private String formattedName;
	private String nickName;
	private Address address;
	private long latitude;
	private long longitude;
	private List<String> telephones;
	private String email;

	public String getFormattedName() {
		return formattedName;
	}

	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public List<String> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<String> telephones) {
		this.telephones = telephones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private class Address {

		private String streetAddress;
		private String locality;
		private String postalCode;
		private String region;
		private String countryName;
		private int type;

		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getLocality() {
			return locality;
		}

		public void setLocality(String locality) {
			this.locality = locality;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

	}

}