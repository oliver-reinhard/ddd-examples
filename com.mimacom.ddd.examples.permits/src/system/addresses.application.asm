namespace permits

import permits.AddressesCore.AddressId

service interface AddressesService

interface model AddressesInterface
core model AddressesCore

exception AggregateNotFoundException «Exception raised when requested entity cannot be found»

/* @GetMapping(value = "/addresses/{addressId}") */
operation getAddress(
	in addressId : AddressId,
	out result : Address
) raises AggregateNotFoundException {}