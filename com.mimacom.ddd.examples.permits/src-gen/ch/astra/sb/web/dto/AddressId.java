package ch.astra.sb.web.dto;

import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class AddressId {
  private String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(final String value) {
    this.value = value;
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
    AddressId that = (AddressId) o;
    return
    	java.util.Objects.equals(getValue(), that.getValue())
    	;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(
    	getValue()
    );
  }
}
