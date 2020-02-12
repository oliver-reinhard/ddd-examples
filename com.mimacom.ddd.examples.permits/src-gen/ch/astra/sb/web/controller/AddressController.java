package ch.astra.sb.web.controller;

import ch.astra.sb.web.dto.Address;
import ch.astra.sb.web.dto.AddressId;
import ch.astra.sb.web.exception.AggregateNotFoundException;
import java.time.LocalDate;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("all")
public class AddressController {
  @GetMapping("/addresses/{addressId}")
  public Address get(@PathVariable final AddressId addressId) throws AggregateNotFoundException {
    throw new UnsupportedOperationException("Not yet implemented");
  }
  
  @PostMapping("/addresses")
  public ResponseEntity create(@RequestBody final Address address) {
    throw new UnsupportedOperationException("Not yet implemented");
  }
  
  @PutMapping("/addresses/{addressId}")
  public Address update(@RequestBody final Address address, @PathVariable final AddressId addressId) {
    throw new UnsupportedOperationException("Not yet implemented");
  }
  
  @DeleteMapping("/addresses/{addressId}")
  public ResponseEntity delete(@PathVariable final AddressId addressId) {
    throw new UnsupportedOperationException("Not yet implemented");
  }
  
  @GetMapping("addresses/hasMainAddress")
  public Boolean hasMain() {
    throw new UnsupportedOperationException("Not yet implemented");
  }
  
  @GetMapping("addresses/autocomplete")
  public List<Address> search(@RequestParam final String searchTerm, @RequestParam final String country) {
    throw new UnsupportedOperationException("Not yet implemented");
  }
  
  /**
   * Uses the user type mapping.
   * 
   * @see TimepointToLocalDate
   */
  @GetMapping("/foo")
  public LocalDate foo() {
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
