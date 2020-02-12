package ch.astra.sb.web.dto;

import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class Address {
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(
    );
  }
}
