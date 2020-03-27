package ch.astra.sb.web.dto;

import ch.astra.sb.web.PhoneNumberType;
import java.math.BigInteger;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class Address {
  private String name;
  
  private String addition;
  
  private String addition2;
  
  private String street;
  
  private BigInteger number;
  
  private Boolean postOfficeBox;
  
  private BigInteger postOfficeBoxNumber;
  
  private String postOfficeBoxPostCode;
  
  private String postOfficeBoxCity;
  
  private String postCode;
  
  private String city;
  
  private String country;
  
  private String email;
  
  private String phoneNumber;
  
  private PhoneNumberType phoneNumberCountry;
  
  private String fax;
  
  private String language;
  
  private Boolean mainAddress;
  
  private String customerNumber;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getAddition() {
    return this.addition;
  }
  
  public void setAddition(final String addition) {
    this.addition = addition;
  }
  
  public String getAddition2() {
    return this.addition2;
  }
  
  public void setAddition2(final String addition2) {
    this.addition2 = addition2;
  }
  
  public String getStreet() {
    return this.street;
  }
  
  public void setStreet(final String street) {
    this.street = street;
  }
  
  public BigInteger getNumber() {
    return this.number;
  }
  
  public void setNumber(final BigInteger number) {
    this.number = number;
  }
  
  public Boolean getPostOfficeBox() {
    return this.postOfficeBox;
  }
  
  public void setPostOfficeBox(final Boolean postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }
  
  public BigInteger getPostOfficeBoxNumber() {
    return this.postOfficeBoxNumber;
  }
  
  public void setPostOfficeBoxNumber(final BigInteger postOfficeBoxNumber) {
    this.postOfficeBoxNumber = postOfficeBoxNumber;
  }
  
  public String getPostOfficeBoxPostCode() {
    return this.postOfficeBoxPostCode;
  }
  
  public void setPostOfficeBoxPostCode(final String postOfficeBoxPostCode) {
    this.postOfficeBoxPostCode = postOfficeBoxPostCode;
  }
  
  public String getPostOfficeBoxCity() {
    return this.postOfficeBoxCity;
  }
  
  public void setPostOfficeBoxCity(final String postOfficeBoxCity) {
    this.postOfficeBoxCity = postOfficeBoxCity;
  }
  
  public String getPostCode() {
    return this.postCode;
  }
  
  public void setPostCode(final String postCode) {
    this.postCode = postCode;
  }
  
  public String getCity() {
    return this.city;
  }
  
  public void setCity(final String city) {
    this.city = city;
  }
  
  public String getCountry() {
    return this.country;
  }
  
  public void setCountry(final String country) {
    this.country = country;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(final String email) {
    this.email = email;
  }
  
  public String getPhoneNumber() {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(final String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public PhoneNumberType getPhoneNumberCountry() {
    return this.phoneNumberCountry;
  }
  
  public void setPhoneNumberCountry(final PhoneNumberType phoneNumberCountry) {
    this.phoneNumberCountry = phoneNumberCountry;
  }
  
  public String getFax() {
    return this.fax;
  }
  
  public void setFax(final String fax) {
    this.fax = fax;
  }
  
  public String getLanguage() {
    return this.language;
  }
  
  public void setLanguage(final String language) {
    this.language = language;
  }
  
  public Boolean getMainAddress() {
    return this.mainAddress;
  }
  
  public void setMainAddress(final Boolean mainAddress) {
    this.mainAddress = mainAddress;
  }
  
  public String getCustomerNumber() {
    return this.customerNumber;
  }
  
  public void setCustomerNumber(final String customerNumber) {
    this.customerNumber = customerNumber;
  }
  
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
  
  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Address that = (Address) o;
    return
    	Objects.equals(getName(), that.getName()) &&
    	Objects.equals(getAddition(), that.getAddition()) &&
    	Objects.equals(getAddition2(), that.getAddition2()) &&
    	Objects.equals(getStreet(), that.getStreet()) &&
    	Objects.equals(getNumber(), that.getNumber()) &&
    	Objects.equals(getPostOfficeBox(), that.getPostOfficeBox()) &&
    	Objects.equals(getPostOfficeBoxNumber(), that.getPostOfficeBoxNumber()) &&
    	Objects.equals(getPostOfficeBoxPostCode(), that.getPostOfficeBoxPostCode()) &&
    	Objects.equals(getPostOfficeBoxCity(), that.getPostOfficeBoxCity()) &&
    	Objects.equals(getPostCode(), that.getPostCode()) &&
    	Objects.equals(getCity(), that.getCity()) &&
    	Objects.equals(getCountry(), that.getCountry()) &&
    	Objects.equals(getEmail(), that.getEmail()) &&
    	Objects.equals(getPhoneNumber(), that.getPhoneNumber()) &&
    	Objects.equals(getPhoneNumberCountry(), that.getPhoneNumberCountry()) &&
    	Objects.equals(getFax(), that.getFax()) &&
    	Objects.equals(getLanguage(), that.getLanguage()) &&
    	Objects.equals(getMainAddress(), that.getMainAddress()) &&
    	Objects.equals(getCustomerNumber(), that.getCustomerNumber());
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(
    	getName(),
    	getAddition(),
    	getAddition2(),
    	getStreet(),
    	getNumber(),
    	getPostOfficeBox(),
    	getPostOfficeBoxNumber(),
    	getPostOfficeBoxPostCode(),
    	getPostOfficeBoxCity(),
    	getPostCode(),
    	getCity(),
    	getCountry(),
    	getEmail(),
    	getPhoneNumber(),
    	getPhoneNumberCountry(),
    	getFax(),
    	getLanguage(),
    	getMainAddress(),
    	getCustomerNumber()
    );
  }
}
