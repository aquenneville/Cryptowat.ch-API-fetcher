package github.aq.cryptowatchapiassetfetcher.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author 
 * 
 *         This is the Java representation of an Coin/Asset. A coin has a name, a
 *         list of markets, and an average price, that is the average of all
 *         prices in every exchange
 * 
 */
public class Coin {

	public String name;
	public String symbol;
	public boolean fiat; // fiat=true,crypto=false
	public List<Market> market;

	public Coin() {

	}

	public Coin(String name, String symbol, boolean fiat) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.fiat = fiat;
		this.market = new ArrayList<Market>();
	}

	public boolean addMarket(Market market) {
		if (market == null) {
			return false;
		}
		if (this.market == null)
			this.market = new ArrayList<Market>();

		this.market.add(market);
		return true;
	}

	public List<Market> getMarket() {
		return market;
	}

	public void setMarket(List<Market> market) {
		this.market = market;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public boolean isFiat() {
		return fiat;
	}

	public void setFiat(boolean fiat) {
		this.fiat = fiat;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

}
