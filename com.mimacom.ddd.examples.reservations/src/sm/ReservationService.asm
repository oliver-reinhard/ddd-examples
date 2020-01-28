namespace sm.res

//import sm.ReservationsBase.* 
//import sm.ReservationsUI.*
//import sm.ReservationsCore.*

service interface UIService

interface model ReservationsUI
core model 		ReservationsCore

/* 
operation CreateParty(
	in n : Name, in size : Size, out p : SParty
) { 
	effect Party.all.exists(name = n AND size = size) AND p = SParty(newPartyID, name, size)
} 



operation PartyArrived(
	in p : SParty
) {
	guard	NOT Table.all.exists(t.party.id = p.id) 
	guard	NOT Parties.all_Waiting_Parties.exists(p)
	
	effect 	Table.all.exists(party = p AND state = Table.USED)
	effect 	Parties.all_Waiting_Parties.exists(p)
} 


operation TableCleaned(
	in t : STable
) {
	effect 	UNDEFINED 
}
*/