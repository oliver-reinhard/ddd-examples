package ch.astra.sb.web.exception;

/**
 * «Exception raised when requested entity cannot be found»
 */
@SuppressWarnings("all")
public class AggregateNotFoundException extends IllegalArgumentException {
  public AggregateNotFoundException() {
    super("Wrong number format");
  }
}
