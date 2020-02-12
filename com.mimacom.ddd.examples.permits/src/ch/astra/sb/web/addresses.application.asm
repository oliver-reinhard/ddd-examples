system ch.astra.sb.web

import ch.astra.sb.web.AddressesCore.AddressId

service interface AddressesService

interface model AddressesInterface
core model AddressesCore

exception AggregateNotFoundException «Exception raised when requested entity cannot be found»

operation get(
	in addressId : AddressId,
	out result : Address
) raises AggregateNotFoundException {}

operation create(in address : Address) {}

operation update(
	in address : Address,
	in addressId : AddressId,
	out result : Address
) {}

operation delete(in addressId : AddressId) {}

operation hasMain(out result : Boolean) {}

operation search(
	in searchTerm : Text,
	in country : Text,
	out result : Address*
) {}

operation foo(
	out result : Timepoint
) {}