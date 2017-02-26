import java.util.*;

class Property {

	protected String name;
	protected int rent;
	protected int price;
	protected String colour;
	protected boolean bought = false;
	protected int ownerID;
	protected int buildCost;
	protected int houses = 0;
	protected int hotel = 0;
	
	/**
	* Initilise the property
	*/
	public Property(String name, int price, int rent, String colour, int buildCost) {
		this.name = name;
		this.rent = rent;
		this.price = price;
		this.colour = colour;
		this.buildCost = buildCost;
	}

	/**
	* Player buys the property
	* @param player_id the new owners id
	*/
	public void buy_property(int player_id) {
		bought = true;
		ownerID = player_id;
	}

	/**
	* Return the cost of building on the property
	* @return the build cost
	*/
	public int buildCost() {
		return buildCost;
	}

	/**
	* Return the id of the owner
	* @return the id of owner
	*/
	public int owner() {
		return ownerID;
	}

	/**
	* Return the cost of the property
	* @return the price
	*/
	public int cost() {
		return price;
	}

	/**
	* Return the name of the property
	* @return the name
	*/
	public String name() {
		return name;
	}

	/**
	* Return the colour of the property (for it's grouping)
	* @return the colour
	*/
	public String colour() {
		return colour;
	}

	/**
	* Return the rent of the property
	* @return the rent
	*/
	public int rent() {
		return rent;
	}


	/**
	* Check if the property has been bought
	* @return true if bought, false otherwise
	*/
	public boolean available() {
		return bought;
	}

	/**
	* Build a house to increase the rent
	*/
	public void buildHouse() {
		houses++;
		rent = rent + rent/2;
	}

	/**
	* Build a hotel to increase the rent
	*/
	public void buildHotel() {
		hotel++;
		rent = rent + rent/2;
	}
}