package gatling;
import static io.gatling.javaapi.core.CoreDsl.AllowList;
import static io.gatling.javaapi.core.CoreDsl.DenyList;
import static io.gatling.javaapi.core.CoreDsl.RawFileBody;
import static io.gatling.javaapi.core.CoreDsl.atOnceUsers;
import static io.gatling.javaapi.core.CoreDsl.rampUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

import java.util.HashMap;
import java.util.Map;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class RecordedSimulationAmazon extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://unagi.amazon.in")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
    ;
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("accept", "text/css,*/*;q=0.1");
    headers_2.put("accept-encoding", "gzip, deflate, br");
    headers_2.put("accept-language", "en-US,en;q=0.9");
    headers_2.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Windows");
    headers_2.put("sec-fetch-dest", "style");
    headers_2.put("sec-fetch-mode", "no-cors");
    headers_2.put("sec-fetch-site", "cross-site");
    headers_2.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("accept", "*/*");
    headers_3.put("accept-encoding", "gzip, deflate, br");
    headers_3.put("accept-language", "en-US,en;q=0.9");
    headers_3.put("origin", "https://www.amazon.in");
    headers_3.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Windows");
    headers_3.put("sec-fetch-dest", "script");
    headers_3.put("sec-fetch-mode", "cors");
    headers_3.put("sec-fetch-site", "cross-site");
    headers_3.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_6.put("accept-encoding", "gzip, deflate, br");
    headers_6.put("accept-language", "en-US,en;q=0.9");
    headers_6.put("device-memory", "8");
    headers_6.put("downlink", "10");
    headers_6.put("dpr", "1.5");
    headers_6.put("ect", "4g");
    headers_6.put("rtt", "50");
    headers_6.put("sec-ch-device-memory", "8");
    headers_6.put("sec-ch-dpr", "1.5");
    headers_6.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_6.put("sec-ch-ua-mobile", "?0");
    headers_6.put("sec-ch-ua-platform", "Windows");
    headers_6.put("sec-ch-viewport-width", "853");
    headers_6.put("sec-fetch-dest", "document");
    headers_6.put("sec-fetch-mode", "navigate");
    headers_6.put("sec-fetch-site", "none");
    headers_6.put("sec-fetch-user", "?1");
    headers_6.put("service-worker-navigation-preload", "true");
    headers_6.put("upgrade-insecure-requests", "1");
    headers_6.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_6.put("viewport-width", "853");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("accept", "*/*");
    headers_9.put("accept-encoding", "gzip, deflate, br");
    headers_9.put("accept-language", "en-US,en;q=0.9");
    headers_9.put("device-memory", "8");
    headers_9.put("downlink", "10");
    headers_9.put("dpr", "1.5");
    headers_9.put("ect", "4g");
    headers_9.put("origin", "https://www.amazon.in");
    headers_9.put("rtt", "50");
    headers_9.put("sec-ch-device-memory", "8");
    headers_9.put("sec-ch-dpr", "1.5");
    headers_9.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Windows");
    headers_9.put("sec-ch-viewport-width", "1280");
    headers_9.put("sec-fetch-dest", "empty");
    headers_9.put("sec-fetch-mode", "cors");
    headers_9.put("sec-fetch-site", "same-origin");
    headers_9.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_9.put("viewport-width", "1280");
    headers_9.put("x-requested-with", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_17 = new HashMap<>();
    headers_17.put("Accept", "*/*");
    headers_17.put("Accept-Encoding", "gzip, deflate, br");
    headers_17.put("Accept-Language", "en-US,en;q=0.9");
    headers_17.put("Sec-Fetch-Dest", "script");
    headers_17.put("Sec-Fetch-Mode", "no-cors");
    headers_17.put("Sec-Fetch-Site", "cross-site");
    headers_17.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_17.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_17.put("sec-ch-ua-mobile", "?0");
    headers_17.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("Accept", "*/*");
    headers_18.put("Accept-Encoding", "gzip, deflate, br");
    headers_18.put("Accept-Language", "en-US,en;q=0.9");
    headers_18.put("Content-Type", "text/plain;charset=UTF-8");
    headers_18.put("Origin", "https://www.amazon.in");
    headers_18.put("Sec-Fetch-Dest", "empty");
    headers_18.put("Sec-Fetch-Mode", "no-cors");
    headers_18.put("Sec-Fetch-Site", "cross-site");
    headers_18.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_18.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_18.put("sec-ch-ua-mobile", "?0");
    headers_18.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_20 = new HashMap<>();
    headers_20.put("accept", "*/*");
    headers_20.put("accept-encoding", "gzip, deflate, br");
    headers_20.put("accept-language", "en-US,en;q=0.9");
    headers_20.put("device-memory", "8");
    headers_20.put("downlink", "10");
    headers_20.put("dpr", "1.5");
    headers_20.put("ect", "4g");
    headers_20.put("rtt", "50");
    headers_20.put("sec-ch-device-memory", "8");
    headers_20.put("sec-ch-dpr", "1.5");
    headers_20.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_20.put("sec-ch-ua-mobile", "?0");
    headers_20.put("sec-ch-ua-platform", "Windows");
    headers_20.put("sec-ch-viewport-width", "1280");
    headers_20.put("sec-fetch-dest", "empty");
    headers_20.put("sec-fetch-mode", "cors");
    headers_20.put("sec-fetch-site", "same-origin");
    headers_20.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_20.put("viewport-width", "1280");
    
    Map<CharSequence, String> headers_21 = new HashMap<>();
    headers_21.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_21.put("Accept-Encoding", "gzip, deflate, br");
    headers_21.put("Accept-Language", "en-US,en;q=0.9");
    headers_21.put("Sec-Fetch-Dest", "image");
    headers_21.put("Sec-Fetch-Mode", "no-cors");
    headers_21.put("Sec-Fetch-Site", "cross-site");
    headers_21.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_21.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_21.put("sec-ch-ua-mobile", "?0");
    headers_21.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_25 = new HashMap<>();
    headers_25.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_25.put("accept-encoding", "gzip, deflate, br");
    headers_25.put("accept-language", "en-US,en;q=0.9");
    headers_25.put("device-memory", "8");
    headers_25.put("downlink", "10");
    headers_25.put("dpr", "1.5");
    headers_25.put("ect", "4g");
    headers_25.put("rtt", "50");
    headers_25.put("sec-ch-device-memory", "8");
    headers_25.put("sec-ch-dpr", "1.5");
    headers_25.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_25.put("sec-ch-ua-mobile", "?0");
    headers_25.put("sec-ch-ua-platform", "Windows");
    headers_25.put("sec-ch-viewport-width", "1280");
    headers_25.put("sec-fetch-dest", "image");
    headers_25.put("sec-fetch-mode", "no-cors");
    headers_25.put("sec-fetch-site", "same-origin");
    headers_25.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_25.put("viewport-width", "1280");
    
    Map<CharSequence, String> headers_28 = new HashMap<>();
    headers_28.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_28.put("accept-encoding", "gzip, deflate, br");
    headers_28.put("accept-language", "en-US,en;q=0.9");
    headers_28.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_28.put("sec-ch-ua-mobile", "?0");
    headers_28.put("sec-ch-ua-platform", "Windows");
    headers_28.put("sec-fetch-dest", "image");
    headers_28.put("sec-fetch-mode", "no-cors");
    headers_28.put("sec-fetch-site", "same-site");
    headers_28.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_32 = new HashMap<>();
    headers_32.put("accept", "*/*");
    headers_32.put("accept-encoding", "gzip, deflate, br");
    headers_32.put("accept-language", "en-US,en;q=0.9");
    headers_32.put("content-type", "text/plain;charset=UTF-8");
    headers_32.put("origin", "https://www.amazon.in");
    headers_32.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_32.put("sec-ch-ua-mobile", "?0");
    headers_32.put("sec-ch-ua-platform", "Windows");
    headers_32.put("sec-fetch-dest", "empty");
    headers_32.put("sec-fetch-mode", "no-cors");
    headers_32.put("sec-fetch-site", "same-site");
    headers_32.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_41 = new HashMap<>();
    headers_41.put("Accept", "*/*");
    headers_41.put("Accept-Encoding", "gzip, deflate, br");
    headers_41.put("Accept-Language", "en-US,en;q=0.9");
    headers_41.put("Origin", "https://www.amazon.in");
    headers_41.put("Sec-Fetch-Dest", "empty");
    headers_41.put("Sec-Fetch-Mode", "cors");
    headers_41.put("Sec-Fetch-Site", "same-site");
    headers_41.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_41.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_41.put("sec-ch-ua-mobile", "?0");
    headers_41.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_42 = new HashMap<>();
    headers_42.put("Accept", "*/*");
    headers_42.put("Accept-Encoding", "gzip, deflate, br");
    headers_42.put("Accept-Language", "en-US,en;q=0.9");
    headers_42.put("Content-Type", "text/plain;charset=UTF-8");
    headers_42.put("Origin", "https://www.amazon.in");
    headers_42.put("Sec-Fetch-Dest", "empty");
    headers_42.put("Sec-Fetch-Mode", "no-cors");
    headers_42.put("Sec-Fetch-Site", "same-site");
    headers_42.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_42.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_42.put("sec-ch-ua-mobile", "?0");
    headers_42.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_43 = new HashMap<>();
    headers_43.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_43.put("Accept-Encoding", "gzip, deflate, br");
    headers_43.put("Accept-Language", "en-US,en;q=0.9");
    headers_43.put("Sec-Fetch-Dest", "iframe");
    headers_43.put("Sec-Fetch-Mode", "navigate");
    headers_43.put("Sec-Fetch-Site", "cross-site");
    headers_43.put("Upgrade-Insecure-Requests", "1");
    headers_43.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_43.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_43.put("sec-ch-ua-mobile", "?0");
    headers_43.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_44 = new HashMap<>();
    headers_44.put("accept", "*/*");
    headers_44.put("accept-encoding", "gzip, deflate, br");
    headers_44.put("accept-language", "en-US,en;q=0.9");
    headers_44.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_44.put("sec-ch-ua-mobile", "?0");
    headers_44.put("sec-ch-ua-platform", "Windows");
    headers_44.put("sec-fetch-dest", "empty");
    headers_44.put("sec-fetch-mode", "no-cors");
    headers_44.put("sec-fetch-site", "cross-site");
    headers_44.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_51 = new HashMap<>();
    headers_51.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_51.put("accept-encoding", "gzip, deflate, br");
    headers_51.put("accept-language", "en-US,en;q=0.9");
    headers_51.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_51.put("sec-ch-ua-mobile", "?0");
    headers_51.put("sec-ch-ua-platform", "Windows");
    headers_51.put("sec-fetch-dest", "image");
    headers_51.put("sec-fetch-mode", "no-cors");
    headers_51.put("sec-fetch-site", "cross-site");
    headers_51.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_52 = new HashMap<>();
    headers_52.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_52.put("accept-encoding", "gzip, deflate, br");
    headers_52.put("accept-language", "en-US,en;q=0.9");
    headers_52.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_52.put("sec-ch-ua-mobile", "?0");
    headers_52.put("sec-ch-ua-platform", "Windows");
    headers_52.put("sec-fetch-dest", "image");
    headers_52.put("sec-fetch-mode", "no-cors");
    headers_52.put("sec-fetch-site", "cross-site");
    headers_52.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_52.put("x-client-data", "CIe2yQEIo7bJAQjEtskBCKmdygEIlaHLAQjsu8wBCI29zAEI8NbMAQi+18wB");
    
    Map<CharSequence, String> headers_104 = new HashMap<>();
    headers_104.put("Accept", "*/*");
    headers_104.put("Accept-Encoding", "gzip, deflate, br");
    headers_104.put("Accept-Language", "en-US,en;q=0.9");
    headers_104.put("Content-Type", "text/plain;charset=UTF-8");
    headers_104.put("Origin", "https://www.amazon.in");
    headers_104.put("Sec-Fetch-Dest", "empty");
    headers_104.put("Sec-Fetch-Mode", "cors");
    headers_104.put("Sec-Fetch-Site", "same-site");
    headers_104.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
    headers_104.put("sec-ch-ua", "Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105");
    headers_104.put("sec-ch-ua-mobile", "?0");
    headers_104.put("sec-ch-ua-platform", "Windows");
    
    String uri01 = "https://sync.sxp.smartclip.net/sync";
    
    String uri02 = "https://uipglob.semasio.net/amazon/1/get";
    
    String uri03 = "https://loadus.exelator.com/load";
    
    String uri04 = "https://aax-eu.amazon-adsystem.com/s";
    
    String uri06 = "https://dsum-sec.casalemedia.com/rrum";
    
    String uri07 = "https://ads.stickyadstv.com/user-registering";
    
    String uri08 = "https://amazon.in";
    
    String uri09 = "https://www.amazon.in";
    
    String uri10 = "https://token.rubiconproject.com/token";
    
    String uri11 = "https://fls-eu.amazon.in/1/batch/1";
    
    String uri12 = "https://completion.amazon.in/api/2017/suggestions";
    
    String uri13 = "https://images-eu.ssl-images-amazon.com/images";
    
    String uri14 = "https://rd.frontend.weborama.fr/rd";
    
    String uri15 = "https://beacon.krxd.net/usermatch.gif";
    
    String uri16 = "https://unagi-eu.amazon.com/1/events/com.amazon.csm.nexusclient.prod";
    
    String uri17 = "https://www.facebook.com/fr/r.php";
    
    String uri18 = "https://amazon.partners.tremorhub.com/sync";
    
    String uri19 = "https://mwzeom.zeotap.com/mw";
    
    String uri20 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/956747825";
    
    String uri21 = "https://d2ef20sk9hi1u3.cloudfront.net";
    
    String uri22 = "https://www.google.co.in/pagead/1p-user-list/956747825";
    
    String uri23 = "https://dr3fr5q4g2ul9.cloudfront.net";
    
    String uri24 = "https://aax-eu.amazon.in";
    
    String uri25 = "https://x.bidswitch.net/sync_a9/https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dbidswitch.com%26id%3D%24%7BUUID%7D";
    
    String uri26 = "https://s.amazon-adsystem.com/ecm3";

    ScenarioBuilder scn = scenario("RecordedSimulationAmazon")
      .exec(
        http("request_0")
          .get(uri08 + "/")
          .resources(
            http("request_1")
              .get(uri13 + "/I/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41C-I1lXVwL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11Qjwq-j69L.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41CYNGpGlrL.css,01XPHJk60-L.css,01smHc51S9L.css,21aPhFy+riL.css,11gneA3MtJL.css,21fecG8pUzL.css,01ulGzBW88L.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01uPgw4sNAL.css,11JQtnL-6eL.css,116v6uYvN6L.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21zuRztKjtL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI"),
            http("request_2")
              .get(uri13 + "/I/41H4XraWzVL._RC%7C71DMgrz2JzL.css,419PL1YPc0L.css,11iz0yqU3tL.css,31F9VldP5OL.css,313Ydl5aIRL.css,21MKjoYL8wL.css,41yQj5y2obL.css,01yCq3WXEcL.css,11EwMr28-QL.css,31OvHRW+XiL.css,01XHMOHpK1L.css,11iUHDm4--L.css,31jJwAF+yLL.css,01YWmXMYw8L.css_.css?AUIClients/NavDesktopUberAsset&wd6RBeYR")
              .headers(headers_2),
            http("request_3")
              .get(uri13 + "/I/61NeHXhGwSL.js?AUIClients/AmazonUIjQuery&KK9dlo3A")
              .headers(headers_3),
            http("request_4")
              .get(uri13 + "/I/01rGP6HIADL.js?AUIClients/GenericObservableJS"),
            http("request_5")
              .get(uri13 + "/I/11t0zqtkxpL._RC%7C41jWkdimWrL.js_.js?AUIClients/AmazonGatewayAuiAssets"),
            http("request_6")
              .get(uri09 + "/")
              .headers(headers_6),
            http("request_7")
              .get(uri13 + "/I/31YI0nnbQAL.js?AUIClients/AmazonGatewayHerotatorJS&PDu43UNw"),
            http("request_8")
              .get(uri13 + "/S/apesafeframe/ape/sf/desktop/DAsf-1.50.5dd1ddb.js?csm_attribution=APE-SafeFrame"),
            http("request_9")
              .post(uri09 + "/ah/ajax/counter?ctr=desktop_ajax_atf&exp=1665498556895&rId=61G16V0TE3H3N32C8CKV&mkId=A21TJRUUN4KGV&h=c200e31e53613b1bd06cef20d052b35a72ed3fe172211e342b1ac2f8d4a83a7a")
              .headers(headers_9),
            http("request_10")
              .get(uri13 + "/S/apesafeframe/ape/sf/desktop/sf-1.50.5dd1ddb.html"),
            http("request_11")
              .get(uri13 + "/I/51SrwqaWgEL.js?AUIClients/CardJsRuntimeBuzzCopyBuild"),
            http("request_12")
              .get(uri13 + "/I/01suh3pFoYL.js?xcp")
              .headers(headers_3),
            http("request_13")
              .get(uri13 + "/I/31NWh6Dkc9L.js?xcp")
              .headers(headers_3),
            http("request_14")
              .get(uri13 + "/S/apesafeframe/ape/sf/desktop/sf-1.50.5dd1ddb.html"),
            http("request_15")
              .get(uri13 + "/I/41IjdjP7xZL._RC%7C71vRIBJqBAL.js,01F+A05ogQL.js,01phmzCOwJL.js,01eOvPdxG7L.js,61proBBYkaL.js,41gNKoK0s7L.js,115pV8Rl02L.js,21QA-szxgvL.js,11k47yUMOjL.js,41nlcZghVaL.js,51t-JTxfnwL.js,3139RQ5qhCL.js,11lEMI5MhIL.js,31A9XuR4RbL.js,01LEzWzrPZL.js,01AqeWA7PKL.js_.js?AUIClients/NavDesktopUberAsset&6PoZAz96")
              .headers(headers_3),
            http("request_16")
              .get(uri13 + "/I/11Y+5x+kkTL._RC%7C51fH61+ExwL.js,11yKORv-GTL.js,11giXtZCwVL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11aKqyRXooL.js,11OREnu1epL.js,11qVTZscrRL.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01wGRCg6A5L.js_.js?AUIClients/AmazonUI")
              .headers(headers_3),
            http("request_17")
              .get(uri24 + "/e/xsp/getAdj?placementId=589e332a-17d0-4382-b320-05e6f4ddc521&src=511&slot=right-2&rid=01015d0b87bbc021facf1ed928994fed2973d75fb47b72a1673fed7eade07ec151c8&rj=%7B%7D&callback=aax_xsp_render_ad")
              .headers(headers_17),
            http("request_18")
              .post(uri16)
              .headers(headers_18)
              .body(RawFileBody("recordedsimulationamazon/0018_request.json")),
            http("request_19")
              .get(uri24 + "/e/xsp/getAdj?placementId=e44985f6-46f4-4231-90aa-f5c16f7c50aa&src=511&slot=desktop-ad-center-1&rid=01015d0b87bbc021facf1ed928994fed2973d75fb47b72a1673fed7eade07ec151c8&rj=%7B%7D&callback=aax_xsp_render_ad")
              .headers(headers_17),
            http("request_20")
              .get(uri09 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluL3Nob3BwaW5nUG9ydGFsL2Rlc2t0b3A%3D%22%2C%22adElementId%22%3A%22ape_Gateway_right-2_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22right-2%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adNetwork%22%3A%22cs%22%2C%22adProgramId%22%3A1004%2C%22adImpressionId%22%3A%22https%3A%2F%2Faax-eu.amazon.in%2Fe%2Fxsp%2Fimp%3Fb%3DRJ3CTtI51c-Ae3UwsUPM8MIAAAGDx3FVdAMAAAH_AQBOL0EgICAgICAgICAgICBOL0EgICAgICAgICAgICB_z_7t%22%2C%22adCreativeId%22%3A584461092446031600%2C%22adCreativeTemplateName%22%3A%22Image%22%2C%22adId%22%3A587678541597130600%7D%7D")
              .headers(headers_20),
            http("request_21")
              .get(uri24 + "/x/px/RJ3CTtI51c-Ae3UwsUPM8MIAAAGDx3FVdAMAAAH_AQBOL0EgICAgICAgICAgICBOL0EgICAgICAgICAgICB_z_7t/atf/%7B%22atf%22:false%7D")
              .headers(headers_21),
            http("request_22")
              .get(uri24 + "/e/xsp/imp?b=RJ3CTtI51c-Ae3UwsUPM8MIAAAGDx3FVdAMAAAH_AQBOL0EgICAgICAgICAgICBOL0EgICAgICAgICAgICB_z_7t&pj=%7B%22measurementMethod%22%3A%22btr_client%22%7D")
              .headers(headers_21),
            http("request_23")
              .post(uri09 + "/gp/product/sessionCacheUpdateHandler.html")
              .headers(headers_9)
              .formParam("sessionCacheUpdateFlag", "1")
              .formParam("pageType", "Gateway")
              .formParam("browserWidth", "1263")
              .formParam("browserHeight", "150")
              .formParam("token", "fVoboEDsYMjWCjzTN8sCObLZif2/oaBmQ3S2N5KuRr8=")
              .check(status().is(404)),
            http("request_24")
              .get(uri13 + "/I/01JqOTGW4hL.css?xcp"),
            http("request_25")
              .get(uri09 + "/rd/uedata?ld&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&sw=1280&sh=720&vw=1263&vh=150&m=1&sc=61G16V0TE3H3N32C8CKV&ue=3&bb=225&ns=285&ne=356&cf=357&af=771&fn=771&be=932&fp=310&fcp=310&pc=2813&tc=-279&na_=-279&ul_=-1665498436630&_ul=-1665498436630&rd_=-1665498436630&_rd=-1665498436630&fe_=-232&lk_=-232&_lk=-232&co_=-232&_co=-232&sc_=-1665498436630&rq_=-232&rs_=-11&_rs=435&dl_=-5&di_=974&de_=975&_de=977&_dc=2812&ld_=2812&_ld=-1665498436630&ntd=-1&ty=0&rc=0&hob=2&hoe=4&ld=2813&t=1665498439443&ctb=1&rt=cf:11-3-3-2-2-7-1_af:48-5-3-33-3-7-0_ld:251-10-3-226-4-7-0&csmtags=aui|aui:aui_build_date:3.22.2-2022-10-06|mutObsYes|mutObsActive|navbar|gwCFImgNoCache|ABPStatusNotEnabled:Gateway:right-2:desktop|ABPStatusNotEnabled:Gateway:desktop-ad-center-1:desktop|fls-eu-amazon-in|adblk_no|perfYes|aui:sw:ppft:page_proxy:active|aui:sw:ppft:page_proxy:sw-start|aui:sw:ppft:np:enabled:true|csm-feature-touch-enabled:false|fourColumn|threeColumnRevised|flexLayout|cssGridLayout|adrender:Gateway:right-2:desktop|adrender:589e332a-17d0-4382-b320-05e6f4ddc521|adrender:safeframe:Gateway:right-2:desktop|adrender:safeframe:589e332a-17d0-4382-b320-05e6f4ddc521|adrender:Gateway:right-2:desktop:creativetemplatename:image|adrender:589e332a-17d0-4382-b320-05e6f4ddc521:creativetemplatename:image|adrender:Gateway:right-2:desktop:creativeid:584461092446031600|adrender:589e332a-17d0-4382-b320-05e6f4ddc521:creativeid:584461092446031600|adrender:Gateway:right-2:desktop:programid:1004|adrender:589e332a-17d0-4382-b320-05e6f4ddc521:programid:1004|adrender:Gateway:desktop-ad-center-1:desktop|adrender:e44985f6-46f4-4231-90aa-f5c16f7c50aa|adrender:safeframe:Gateway:desktop-ad-center-1:desktop|adrender:safeframe:e44985f6-46f4-4231-90aa-f5c16f7c50aa|adrender:Gateway:desktop-ad-center-1:desktop:creativetemplatename:unknown|adrender:e44985f6-46f4-4231-90aa-f5c16f7c50aa:creativetemplatename:unknown&viz=visible:3&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1&ui=2")
              .headers(headers_25),
            http("request_26")
              .get(uri24 + "/x/px/RHaEiBIzdjQvwrTCbkeB6EwAAAGDx3FVdAMAAAH_AQBOL0EgICAgICAgICAgICBOL0EgICAgICAgICAgICCIoXQL/nii/%7B%22ni%22:true%7D")
              .headers(headers_21),
            http("request_27")
              .get(uri09 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluL3Nob3BwaW5nUG9ydGFsL2Rlc2t0b3A%3D%22%2C%22adElementId%22%3A%22ape_Gateway_desktop-ad-center-1_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22desktop-ad-center-1%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adNetwork%22%3A%22cs%22%7D%7D")
              .headers(headers_20),
            http("request_28")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3DjQueryWindowLoad%26cf0%3D2825%26pc0%3D2825%26ld0%3D2825%26t0%3D1665498439455%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:2824")
              .headers(headers_28),
            http("request_29")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-hero-btf-populate%26cf0%3D3053%26pc0%3D3053%26ld0%3D3053%26t0%3D1665498439683%26csmtags%3Daui%3Asw%3Abrowser%3Aregister%3Asupported%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3052")
              .headers(headers_28),
            http("request_30")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26sw%3D1280%26sh%3D720%26vw%3D1263%26vh%3D150%26m%3D1%26sc%3D61G16V0TE3H3N32C8CKV%26ue%3D3%26bb%3D225%26ns%3D285%26ne%3D356%26cf%3D357%26af%3D771%26fn%3D771%26be%3D932%26fp%3D310%26fcp%3D310%26pc%3D2813%26tc%3D-279%26na_%3D-279%26ul_%3D-1665498436630%26_ul%3D-1665498436630%26rd_%3D-1665498436630%26_rd%3D-1665498436630%26fe_%3D-232%26lk_%3D-232%26_lk%3D-232%26co_%3D-232%26_co%3D-232%26sc_%3D-1665498436630%26rq_%3D-232%26rs_%3D-11%26_rs%3D435%26dl_%3D-5%26di_%3D974%26de_%3D975%26_de%3D977%26_dc%3D2812%26ld_%3D2812%26_ld%3D-1665498436630%26ntd%3D-1%26ty%3D0%26rc%3D0%26hob%3D2%26hoe%3D4%26ld%3D2813%26t%3D1665498439443%26ctb%3D1%26rt%3Dcf%3A11-3-3-2-2-7-1_af%3A48-5-3-33-3-7-0_ld%3A251-10-3-226-4-7-0%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.22.2-2022-10-06%7CmutObsYes%7CmutObsActive%7Cnavbar%7CgwCFImgNoCache%7CABPStatusNotEnabled%3AGateway%3Aright-2%3Adesktop%7CABPStatusNotEnabled%3AGateway%3Adesktop-ad-center-1%3Adesktop%7Cfls-eu-amazon-in%7Cadblk_no%7CperfYes%7Caui%3Asw%3Appft%3Apage_proxy%3Aactive%7Caui%3Asw%3Appft%3Apage_proxy%3Asw-start%7Caui%3Asw%3Appft%3Anp%3Aenabled%3Atrue%7Ccsm-feature-touch-enabled%3Afalse%7CfourColumn%7CthreeColumnRevised%7CflexLayout%7CcssGridLayout%7Cadrender%3AGateway%3Aright-2%3Adesktop%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%7Cadrender%3Asafeframe%3AGateway%3Aright-2%3Adesktop%7Cadrender%3Asafeframe%3A589e332a-17d0-4382-b320-05e6f4ddc521%7Cadrender%3AGateway%3Aright-2%3Adesktop%3Acreativetemplatename%3Aimage%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%3Acreativetemplatename%3Aimage%7Cadrender%3AGateway%3Aright-2%3Adesktop%3Acreativeid%3A584461092446031600%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%3Acreativeid%3A584461092446031600%7Cadrender%3AGateway%3Aright-2%3Adesktop%3Aprogramid%3A1004%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%3Aprogramid%3A1004%7Cadrender%3AGateway%3Adesktop-ad-center-1%3Adesktop%7Cadrender%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%7Cadrender%3Asafeframe%3AGateway%3Adesktop-ad-center-1%3Adesktop%7Cadrender%3Asafeframe%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%7Cadrender%3AGateway%3Adesktop-ad-center-1%3Adesktop%3Acreativetemplatename%3Aunknown%7Cadrender%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%3Acreativetemplatename%3Aunknown%26viz%3Dvisible%3A3%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1%26ui%3D2:2815")
              .headers(headers_28),
            http("request_31")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3DgwHerotatorActive%26cf0%3D3120%26pc0%3D3120%26ld0%3D3120%26t0%3D1665498439750%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3119")
              .headers(headers_28),
            http("request_32")
              .post(uri11 + "/OE/")
              .headers(headers_32)
              .body(RawFileBody("recordedsimulationamazon/0032_request.bin")),
            http("request_33")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26sc0%3Daui%3Asw%3Appft%3Acallback_ricb%26bb0%3D183%26pc0%3D1052%26ld0%3D1052%26t0%3D1665498437682%26sc1%3Dportal-bb%26pc1%3D1%26ld1%3D1%26t1%3D1665498436856%26sc2%3DjQueryReady%26cf2%3D287%26pc2%3D287%26ld2%3D287%26t2%3D1665498436917%26sc3%3Dgateway-asset-load%26cf3%3D347%26pc3%3D347%26ld3%3D347%26t3%3D1665498436977%26sc4%3Dgw-ftGr-desktop-hero-1-visible%26cf4%3D357%26pc4%3D357%26ld4%3D357%26t4%3D1665498436987%26sc5%3Dh1Af%26cf5%3D357%26pc5%3D357%26ld5%3D357%26t5%3D1665498436987%26sc6%3Ddesktop-grid-1-D1-visible%26cf6%3D418%26pc6%3D418%26ld6%3D418%26t6%3D1665498437048%26sc7%3Dadplacements%3AGateway%3Aright-2%3Adesktop%26bb7%3D419%26af7%3D694%26cf7%3D702%26be7%3D1213%26pc7%3D2749%26ld7%3D2624%26t7%3D1665498439254%26sc8%3Dadplacements%3A589e332a-17d0-4382-b320-05e6f4ddc521%26bb8%3D419%26af8%3D694%26cf8%3D702%26be8%3D1213%26pc8%3D2749%26ld8%3D2624%26t8%3D1665498439254%26sc9%3DgwGridInit%26cf9%3D455%26pc9%3D455%26ld9%3D456%26t9%3D1665498437086%26sc10%3Ddesktop-grid-1-visible%26cf10%3D504%26pc10%3D504%26ld10%3D504%26t10%3D1665498437134%26sc11%3DnavCF%26cf11%3D561%26pc11%3D561%26ld11%3D561%26t11%3D1665498437191%26sc12%3Ddesktop-grid-2-visible%26cf12%3D574%26pc12%3D574%26ld12%3D574%26t12%3D1665498437204%26sc13%3Ddesktop-grid-3-visible%26cf13%3D754%26pc13%3D754%26ld13%3D754%26t13%3D1665498437384%26sc14%3Ddesktop-top-visible%26cf14%3D754%26pc14%3D754%26ld14%3D754%26t14%3D1665498437384%26sc15%3Ddesktop-1-visible%26cf15%3D754%26pc15%3D754%26ld15%3D754%26t15%3D1665498437384%26sc16%3Ddesktop-2-visible%26cf16%3D772%26pc16%3D772%26ld16%3D772%26t16%3D1665498437402%26sc17%3DspLoadJs%26cf17%3D773%26pc17%3D773%26ld17%3D773%26t17%3D1665498437403%26sc18%3Dhero-first-image%26cf18%3D774%26pc18%3D774%26ld18%3D774%26t18%3D1665498437404%26sc19%3DgwBTFGridInit%26cf19%3D918%26pc19%3D918%26ld19%3D918%26t19%3D1665498437548%26sc20%3DcsmCELLSframework%26bb20%3D935%26pc20%3D935%26ld20%3D935%26t20%3D1665498437565%26sc21%3DcsmCELLSpdm%26bb21%3D935%26pc21%3D955%26ld21%3D955%26t21%3D1665498437585%26sc22%3DcsmCELLSvpm%26bb22%3D955%26pc22%3D955%26ld22%3D955%26t22%3D1665498437585%26sc23%3DcsmCELLSfem%26bb23%3D955%26pc23%3D955%26ld23%3D955%26t23%3D1665498437585%26sc24%3Due_sushi_v1%26bb24%3D955%26pc24%3D956%26ld24%3D956%26t24%3D1665498437586%26sc25%3DjQueryDomReady%26cf25%3D975%26pc25%3D975%26ld25%3D975%26t25%3D1665498437605%26sc26%3Daui%3Asw%3Apage_proxy%3Arequest_feature_tags%26bb26%3D1053%26cf26%3D1069%26af26%3D1070%26pc26%3D1070%26ld26%3D1070%26t26%3D1665498437700%26sc27%3Ddesktop-btf-grid-1-visible%26cf27%3D1125%26pc27%3D1125%26ld27%3D1125%26t27%3D1665498437755%26sc28%3Ddesktop-btf-grid-2-visible%26cf28%3D1126%26pc28%3D1126%26ld28%3D1126%26t28%3D1665498437756%26sc29%3Ddesktop-btf-grid-3-visible%26cf29%3D1128%26pc29%3D1128%26ld29%3D1128%26t29%3D1665498437758%26sc30%3Ddesktop-btf-grid-4-visible%26cf30%3D1128%26pc30%3D1128%26ld30%3D1129%26t30%3D1665498437759%26sc31%3Ddesktop-3-visible%26cf31%3D1129%26pc31%3D1129%26ld31%3D1129%26t31%3D1665498437759%26sc32%3Ddesktop-btf-grid-5-visible%26cf32%3D1153%26pc32%3D1153%26ld32%3D1153%26t32%3D1665498437783%26sc33%3Ddesktop-btf-grid-6-visible%26cf33%3D1154%26pc33%3D1154%26ld33%3D1154%26t33%3D1665498437784%26sc34%3Ddesktop-btf-grid-7-visible%26cf34%3D1154%26pc34%3D1154%26ld34%3D1154%26t34%3D1665498437784%26sc35%3Ddesktop-btf-grid-8-visible%26cf35%3D1154%26pc35%3D1154%26ld35%3D1154%26t35%3D1665498437784%26sc36%3Ddesktop-4-visible%26cf36%3D1155%26pc36%3D1155%26ld36%3D1155%26t36%3D1665498437785%26sc37%3Ddesktop-btf-grid-9-visible%26cf37%3D1170%26pc37%3D1170%26ld37%3D1170%26t37%3D1665498437800%26sc38%3Ddesktop-btf-grid-10-visible%26cf38%3D1245%26pc38%3D1245%26ld38%3D1245%26t38%3D1665498437875%26sc39%3Ddesktop-5-visible%26cf39%3D1248%26pc39%3D1248%26ld39%3D1248%26t39%3D1665498437878%26sc40%3Ddesktop-grid-1-D1-active%26cf40%3D1257%26pc40%3D1257%26ld40%3D1257%26t40%3D1665498437887%26sc41%3Ddesktop-6-visible%26cf41%3D1265%26pc41%3D1265%26ld41%3D1265%26t41%3D1665498437895%26sc42%3Ddesktop-editorial-visible%26cf42%3D1555%26pc42%3D1555%26ld42%3D1555%26t42%3D1665498438185%26sc43%3Ddesktop-editorial-active%26cf43%3D1555%26pc43%3D1555%26ld43%3D1555%26t43%3D1665498438185%26sc44%3DgwLayoutReady%26cf44%3D2239%26pc44%3D2239%26ld44%3D2239%26t44%3D1665498438869%26sc45%3DgwAUIReady%26cf45%3D2242%26pc45%3D2242%26ld45%3D2242%26t45%3D1665498438872%26sc46%3Ddesktop-top-active%26cf46%3D2269%26pc46%3D2269%26ld46%3D2269%26t46%3D1665498438899%26sc47%3Ddesktop-1-active%26cf47%3D2340%26pc47%3D2340%26ld47%3D2340%26t47%3D1665498438970%26sc48%3Ddesktop-2-active%26cf48%3D2353%26pc48%3D2353%26ld48%3D2353%26t48%3D1665498438983%26sc49%3Ddesktop-3-active%26cf49%3D2365%26pc49%3D2365%26ld49%3D2365%26t49%3D1665498438995%26sc50%3Ddesktop-4-active%26cf50%3D2374%26pc50%3D2374%26ld50%3D2374%26t50%3D1665498439004%26sc51%3Ddesktop-5-active%26cf51%3D2383%26pc51%3D2383%26ld51%3D2383%26t51%3D1665498439013%26sc52%3Ddesktop-6-active%26cf52%3D2503%26pc52%3D2503%26ld52%3D2503%26t52%3D1665498439133%26sc53%3Ddesktop-7-active%26cf53%3D2517%26pc53%3D2517%26ld53%3D2517%26t53%3D1665498439147%26sc54%3Ddesktop-btf-grid-11-visible%26cf54%3D2723%26pc54%3D2723%26ld54%3D2723%26t54%3D1665498439353%26sc55%3Ddesktop-btf-grid-12-visible%26cf55%3D2723%26pc55%3D2723%26ld55%3D2723%26t55%3D1665498439353%26sc56%3Ddesktop-7-visible%26cf56%3D2723%26pc56%3D2723%26ld56%3D2723%26t56%3D1665498439353%26ctb%3D1:2815")
              .headers(headers_28),
            http("request_34")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-4-visible%26cf0%3D3229%26pc0%3D3229%26ld0%3D3229%26t0%3D1665498439859%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3229")
              .headers(headers_28),
            http("request_35")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-6-visible%26cf0%3D3231%26pc0%3D3231%26ld0%3D3231%26t0%3D1665498439861%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3230")
              .headers(headers_28),
            http("request_36")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-7-visible%26cf0%3D3233%26pc0%3D3233%26ld0%3D3233%26t0%3D1665498439863%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3232")
              .headers(headers_28),
            http("request_37")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-5-visible%26cf0%3D3234%26pc0%3D3234%26ld0%3D3234%26t0%3D1665498439864%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3233")
              .headers(headers_28),
            http("request_38")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-8-visible%26cf0%3D3247%26pc0%3D3247%26ld0%3D3247%26t0%3D1665498439877%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3246")
              .headers(headers_28),
            http("request_39")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-2-visible%26cf0%3D3463%26pc0%3D3463%26ld0%3D3463%26t0%3D1665498440093%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3463")
              .headers(headers_28),
            http("request_40")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Dgw-ftGr-desktop-hero-3-visible%26cf0%3D3465%26pc0%3D3465%26ld0%3D3465%26t0%3D1665498440095%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:3464")
              .headers(headers_28),
            http("request_41")
              .head(uri12)
              .headers(headers_41),
            http("request_42")
              .post("/1/events/com.amazon.csm.csa.prod")
              .headers(headers_42)
              .body(RawFileBody("recordedsimulationamazon/0042_request.json")),
            http("request_43")
              .get(uri04 + "/iu3?d=amazon.in&slot=navFooter&a2=0101907bc7e850f0e1c8714284c10eb2f7aa3297da1d85a0225bd275bd8e21905f3a&old_oo=0&ts=1665498436906&s=ARFlI4KbWqveMb4QYCETkDyC_vzZX1yLzRHpODp23oQ4&gdpr_consent=&gdpr_consent_avl=&cb=1665498436906")
              .headers(headers_43),
            http("request_44")
              .get(uri21 + "/?388c5ed0-17de-6493-e20a-16a25158331b")
              .headers(headers_44),
            http("request_45")
              .post(uri11 + "/OE/")
              .headers(headers_32)
              .body(RawFileBody("recordedsimulationamazon/0045_request.bin")),
            http("request_46")
              .get(uri23 + "/?388c5ed0-17de-6493-e20a-16a25158331b")
              .headers(headers_44),
            http("request_47")
              .get(uri04 + "/v3/pr?exlist=n-xr-HMT_n-audex_n-weborama-pca_n-ix-HMT_bsw_bk_n-y-HMT_n-telaria_n-zeotap-4_fw_imdb_n-kr-new_n-improvedigital2_twca_n-dm-HMT_n-fw-HMT1_adb_mp_af_sx_n-sk_g_kr_index_n-tl-HMT_n-semasio-ecm_an_n-pm-HMT_rb_n-g-hmt_nsln_fbca_n-sc_rlsa_pm&fv=1.0&ex-pl-fbca=R02dSzM7QNuVoZBxbhgxRw&ex-pl-twca=CAe5FZNSQPK58e3MiK8SWQ&a=cm&ex-pl-n-kr-new=j9xPgeJ7TA-OrPeMziFnoQ&dmt=1&ex-pl-n-g-hmt=wy7LDKreRp2LB8W0XnucYA&ep=ttam_T219Ay-cPciHbT10lZDoY6NVizHb7nXpwNpsm0uBKC8jSGKcqUM60HSKPBPOvBhP0_P2UMYcvAjObSHFFyb4rgNFY0JCaFO7G2ZfaZ-89ANQA2XskIfrR9nOEHI_ts1DiC9534tkGXC5Oczql7RJYbMGzQbvI5HJrXh-qmYYlL0FIWc6lShSU0wDDm-azw5kEgl59q432-i8GY2p4ckNLINGVa4VsvKYwAeGE_dzcVxdPnXFxbALvGqkYRbGketsPiOwAFVlasufIkGbCQ5i-F-_iGXqUN56dK3s0HcMwW1hGEyHVnSxkSXr2dzoHqbSIMf4fIAciRPN5fE5n9AadkH29lhUPXJzm1_R0ysmuur74JmGF9FY82s5x7KPcW8DFGj6xJT6N9hqSuABt3NnUDtSUDF8AkkLVvkTgoq95YEM6HyOIGs7fnc5ulAbr0E-9yc83KwxLYEpM5FoBVPQ1-d4dtLt-ZfNyFtPXUI6VehofykegRABgbcEgwhF0-HQpsWukLw3LxvCdORWnFoVaJsMfohQjA0TCijWezpJHwIRFrJ9f3jryQEOWcDLjnMsNQ-gdwKASX0pfuiinYargv8ROJvK6zDiv0GBOk")
              .headers(headers_43),
            http("request_48")
              .post(uri11 + "/OE/")
              .headers(headers_32)
              .body(RawFileBody("recordedsimulationamazon/0048_request.bin")),
            http("request_49")
              .post(uri11 + "/OE/")
              .headers(headers_32)
              .body(RawFileBody("recordedsimulationamazon/0049_request.bin")),
            http("request_50")
              .get(uri07 + "?dataProviderId=961&userId=UJjYfsFEScieBDmOojeOeA")
              .headers(headers_21),
            http("request_51")
              .get(uri19 + "?zpartnerid=1353&zurl=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dzeotap%26id%3D%7BZCOOKIE%7D")
              .headers(headers_51)
              .check(status().is(404)),
            http("request_52")
              .get(uri20 + "/?userId=Nh7i0g5BQkaiOCwdb4JhDA&guid=ON&script=0")
              .headers(headers_52),
            http("request_53")
              .get(uri17 + "?p=558293300959460&e=R02dSzM7QNuVoZBxbhgxRw&r=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dfbca%26id%3DR02dSzM7QNuVoZBxbhgxRw&s=1665498441&h=K0hNbXdOWXRWb085SGV3SwlRFThuMYQr38r3D2erJpydWETg")
              .headers(headers_51),
            http("request_54")
              .get(uri14 + "?url=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dweborama%26id%3D%7BWEBO_ENC_CID%7D")
              .headers(headers_51),
            http("request_55")
              .get(uri22 + "/?userId=Nh7i0g5BQkaiOCwdb4JhDA&guid=ON&script=0&is_vtc=1&random=2358835846&ipr=y")
              .headers(headers_52),
            http("request_56")
              .post(uri16)
              .headers(headers_18)
              .body(RawFileBody("recordedsimulationamazon/0056_request.json")),
            http("request_57")
              .get(uri04 + "/ecm3?ex=adobe.com&id=13308462103272665443873037567649429202")
              .headers(headers_21),
            http("request_58")
              .get(uri15 + "?partner=amzn&partner_uid=j9xPgeJ7TA-OrPeMziFnoQ&redir=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dkrux.com%26id%3D")
              .headers(headers_51),
            http("request_59")
              .get(uri18 + "?UIAM&redir=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dtelaria.com%26id%3D%5BPARTNER_ID%5D")
              .headers(headers_51),
            http("request_60")
              .get(uri04 + "/ecm3?ex=googleHMT")
              .headers(headers_21),
            http("request_61")
              .get(uri25)
              .headers(headers_21),
            http("request_62")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:lcp&lcp=443&pc=5245&at=5245&t=1665498441875&ec=1&ecf=0&csmtags=browserQuiteFn&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_63")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:browserQuiteFn&pc=5245&at=5245&t=1665498441875&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_64")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3Alcp%26lcp%3D443%26pc%3D5245%26at%3D5245%26t%3D1665498441875%26ec%3D1%26ecf%3D0%26csmtags%3DbrowserQuiteFn%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5260")
              .headers(headers_28),
            http("request_65")
              .get(uri04 + "/ecm3?ex=dailymotionHMT1")
              .headers(headers_21),
            http("request_66")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3AbrowserQuiteFn%26pc%3D5245%26at%3D5245%26t%3D1665498441875%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5261")
              .headers(headers_28),
            http("request_67")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:startVL&pc=5276&at=5276&t=1665498441906&csmtags=startVL&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_68")
              .get(uri04 + "/ecm3?rcode=1&ex=imdb.com")
              .headers(headers_21),
            http("request_69")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D5276%26at%3D5276%26t%3D1665498441906%26csmtags%3DstartVL%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5275")
              .headers(headers_28),
            http("request_70")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:vl50&vl50=251&pc=5277&at=5277&t=1665498441907&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_71")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:vl90&vl90=286&pc=5277&at=5277&t=1665498441907&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_72")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3Avl50%26vl50%3D251%26pc%3D5277%26at%3D5277%26t%3D1665498441907%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5276")
              .headers(headers_28),
            http("request_73")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3Avl90%26vl90%3D286%26pc%3D5277%26at%3D5277%26t%3D1665498441907%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5277")
              .headers(headers_28),
            http("request_74")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:vl100&vl100=375&pc=5278&at=5278&t=1665498441908&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_75")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:endVL&pc=5278&at=5278&t=1665498441908&csmtags=endVL&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_76")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:si&si=269&pc=5279&at=5279&t=1665498441909&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_77")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D5278%26at%3D5278%26t%3D1665498441908%26csmtags%3DendVL%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5278")
              .headers(headers_28),
            http("request_78")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3Avl100%26vl100%3D375%26pc%3D5278%26at%3D5278%26t%3D1665498441908%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5277")
              .headers(headers_28),
            http("request_79")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3Asi%26si%3D269%26pc%3D5279%26at%3D5279%26t%3D1665498441909%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5278")
              .headers(headers_28),
            http("request_80")
              .get(uri09 + "/rd/uedata?at&v=0.230536.0&id=61G16V0TE3H3N32C8CKV&m=1&sc=csa:atfsi&atfsi=269&pc=5279&at=5279&t=1665498441909&pty=Gateway&spty=desktop&pti=desktop&tid=61G16V0TE3H3N32C8CKV&aftb=1")
              .headers(headers_25),
            http("request_81")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26m%3D1%26sc%3Dcsa%3Aatfsi%26atfsi%3D269%26pc%3D5279%26at%3D5279%26t%3D1665498441909%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5278")
              .headers(headers_28),
            http("request_82")
              .get(uri06 + "?cm_dsp_id=198&external_user_id=AaKCqjyoSzua6y0pOZUPVA&cb=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3DindexHMT%26id%3D")
              .headers(headers_21),
            http("request_83")
              .get(uri04 + "/ecm3?ex=pubmatic.com&id=424A14D6-83C2-46C4-9D6F-562CF75319C9")
              .headers(headers_21),
            http("request_84")
              .get(uri04 + "/ecm3?ex=mplatform.com&id=10527445605063344199&gdpr=&gdpr_consent=")
              .headers(headers_21),
            http("request_85")
              .get(uri11 + "/OP/A21TJRUUN4KGV:259-9811612-0497234:61G16V0TE3H3N32C8CKV$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.230536.0%26id%3D61G16V0TE3H3N32C8CKV%26ctb%3D1%26sc0%3Daui%3Asw%3Actrl_changed%26bb0%3D183%26pc0%3D5429%26ld0%3D5429%26t0%3D1665498442059%26csmtags%3Daui%3Asw%3Actrl_changed%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3D61G16V0TE3H3N32C8CKV%26aftb%3D1:5428")
              .headers(headers_28),
            http("request_86")
              .get(uri04 + "/ecm3?ex=bluekai.com&id=jYb5mKw399eWBakC")
              .headers(headers_21),
            http("request_87")
              .get(uri04 + "/ecm3?ex=fbca&id=R02dSzM7QNuVoZBxbhgxRw")
              .headers(headers_21),
            http("request_88")
              .get(uri26 + "?id=8913778fcd676e1b2817214b3b9e3160&ex=freewheel.tv&gdpr=0&gdpr_consent=")
              .headers(headers_21),
            http("request_89")
              .get(uri04 + "/ecm3?ex=adform.net&id=4290695694274362299")
              .headers(headers_21),
            http("request_90")
              .get(uri02 + "?_url=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3Dsemasio%26id%3D%24%7BUIPID%28%29%7D")
              .headers(headers_21)
              .check(status().is(400)),
            http("request_91")
              .get(uri04 + "/ecm3?ex=spotx.com&id=91804e9b-24cc-11ec-bde4-1547970c0107")
              .headers(headers_21),
            http("request_92")
              .get(uri13 + "/I/01JqOTGW4hL.css?xcp"),
            http("request_93")
              .get(uri10 + "?pid=2179&pt=n")
              .headers(headers_21),
            http("request_94")
              .get(uri04 + "/ecm3?ex=index&id=KAvwFg9Gmwr2U2SeIYke1zc4cTU4ZgIC")
              .headers(headers_21),
            http("request_95")
              .get(uri04 + "/ecm3?ex=telaria.com&id=26fd8843aed0417e9fc4df8a6d4d0b30")
              .headers(headers_21),
            http("request_96")
              .get(uri04 + "/ecm3?ex=bidswitch.com&id=382448df6670e4c7fbfec35297f5f252")
              .headers(headers_21),
            http("request_97")
              .get(uri04 + "/ecm3?ex=indexHMT&id=YVnHJl9y0XKGASeqWOxw4gAA")
              .headers(headers_21),
            http("request_98")
              .get(uri04 + "/ecm3?id=8386920813393002564&ex=appnexus.com&")
              .headers(headers_21),
            http("request_99")
              .get(uri04 + "/ecm3?ex=semasio&id=F67D868CEA18142")
              .headers(headers_21),
            http("request_100")
              .get(uri03 + "/?p=204&g=8889&j=0")
              .headers(headers_51),
            http("request_101")
              .get(uri26 + "?id=N2yzqairHEzKDPSjdxoxCMWWwYjZzChgQG1x_JmYjWc&ex=rubiconproject.com&status=ok")
              .headers(headers_21),
            http("request_102")
              .get(uri01 + "?type=red&dsp=90")
              .headers(headers_51)
          )
      )
      .pause(4)
      .exec(
        http("request_103")
          .get(uri13 + "/I/01JqOTGW4hL.css?xcp")
          .resources(
            http("request_104")
              .post("/1/events/com.amazon.csm.csa.prod")
              .headers(headers_104)
              .body(RawFileBody("recordedsimulationamazon/0104_request.json")),
            http("request_105")
              .post(uri11 + "/OE/")
              .headers(headers_32)
              .body(RawFileBody("recordedsimulationamazon/0105_request.bin"))
          )
      )
      .pause(3)
      .exec(
        http("request_106")
          .post("/1/events/com.amazon.csm.csa.prod")
          .headers(headers_42)
          .body(RawFileBody("recordedsimulationamazon/0106_request.json"))
      )
      .pause(5)
      .exec(
        http("request_107")
          .post("/1/events/com.amazon.csm.csa.prod")
          .headers(headers_42)
          .body(RawFileBody("recordedsimulationamazon/0107_request.json"))
      );

//	  setUp(scn.injectOpen(atOnceUsers(2))).protocols(httpProtocol);
	  setUp(scn.injectOpen(rampUsers(2).during(10))).protocols(httpProtocol);	
  }
}
