package github.aq.cryptowatchapiassetfetcher;
import java.net.MalformedURLException;
import github.aq.cryptowatchapiassetfetcher.service.API;

public class CryptowatchApiAssetFetcher {

	static API api;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		api = new API();
		api.getCoin();

	}

}
