package github.aq.cryptowatchapiassetfetcher;
import java.net.MalformedURLException;
import github.aq.cryptowatchapiassetfetcher.service.CryptowatchApiCrawler;

public class CryptowatchApiAssetFetcher {

	static CryptowatchApiCrawler api;

	public static void main(String[] args) throws MalformedURLException {
		api = new CryptowatchApiCrawler();
		api.crawl();
	}

}
