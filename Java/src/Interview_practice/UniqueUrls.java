package src.Interview_practice;

import java.util.*;
import java.net.URI;
import java.net.URISyntaxException;
    public class UniqueUrls {

        public static int countUniqueUrls(List<String> urls) {
            Set<String> uniqueUrls = new HashSet<>();
            for (String urlString : urls) {
                try {
                    URI uri = new URI(urlString);
                    String normalizedUrl = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                    if(normalizedUrl.endsWith("/") || normalizedUrl.endsWith("?")) {
                        normalizedUrl = normalizedUrl.substring( 0, normalizedUrl.length() - 1 );
                    }
                    uniqueUrls.add(normalizedUrl);
                } catch (URISyntaxException e) {
                    throw new IllegalArgumentException( "not a valid URI" );
                }
            }
            return uniqueUrls.size();
        }
        public static Map<String, Integer> countUniqueUrlsPerTopLevelDomain(List<String> urls) {
            Map<String, Integer> counts = new HashMap<>();
            for (String urlString : urls) {
                try {
                    URI uri = new URI(urlString);
                    String normalizedUrl = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null,null).toString();

                    // Extract the top-level domain
                    String[] domainParts = normalizedUrl.split("\\.");
                    if (domainParts.length >= 2) {
                        String topLevelDomain = domainParts[domainParts.length - 2] + "." + domainParts[domainParts.length - 1];

                        // Update the count for the top-level domain
                        counts.put(topLevelDomain, counts.getOrDefault(topLevelDomain, 0) + 1);
                    }
                } catch (URISyntaxException e) {
                    throw new IllegalArgumentException( "not a valid URI" );
                }
            }
            // Return the map containing counts per top-level domain
            return counts;
        }

    public static void main(String[] args) {
        UniqueUrls urlCounter = new UniqueUrls();
        // Example usage
        List<String> inputUrls = List.of("https://example.com");
        List<String> inputUrls1 = List.of("https://example.com", "https://example.com/");
        List<String> inputUrls2 = List.of("https://example.com", "http://example.com");
        List<String> inputUrls3 = List.of("https://example.com?", "https://example.com");
        List<String> inputUrls4 = List.of("https://example.com?a=1&b=2", "https://example.com?b=2&a=1");
        int result = urlCounter.countUniqueUrls(inputUrls);
        int result1 = urlCounter.countUniqueUrls(inputUrls1);
        int result2 = urlCounter.countUniqueUrls(inputUrls2);
        int result3 = urlCounter.countUniqueUrls(inputUrls3);
        int result4 = urlCounter.countUniqueUrls(inputUrls4);
        List<String> inputUrls5 = List.of("https://example.com");
        List<String> inputUrls6 = List.of("https://example.com", "https://subdomain.example.com");
        int result5 = urlCounter.countUniqueUrls(inputUrls5);
        int result6 = urlCounter.countUniqueUrls(inputUrls6);
        System.out.println("result: " + result);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
        System.out.println("result5: " + result5);
        System.out.println("result6: " + result6);
    }
}

