import sm.ReservationsBase.*
import sm.ReservationsUI.*
import sm.ReservationsCore.*

service interface sm.UIService

interface model sm.ReservationsUI
core model 		sm.ReservationsCore

operation CreateParty(
	in name : Name, in size : Size, out p : SParty
) { 
	effect p = new SParty(newPartyID, name, size)
} 

operation PartyArrived(
	in p : SParty, /* Workaround */ in t : STable
) {
	guard	NOT allTables.exists(t.party.id = p.id) 
	guard	NOT allWaitingParties.exists(p)
	effect 	allTables.exists(t.party = p AND t.state = TableState.USED)
	effect 	allWaitingParties.exists(p)
} 

operation TableCleaned(
	in t : STable
) {
	effect 	UNDEFINED 
}