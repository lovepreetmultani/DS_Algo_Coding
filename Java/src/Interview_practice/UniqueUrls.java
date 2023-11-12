package src.Interview_practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.net.URI;
import java.net.URISyntaxException;


    public class UniqueUrls {

        /**
         * This function counts how many unique normalized valid URLs were passed to the function.
         *
         * @param urls List of URLs
         * @return Count of unique normalized URLs
         */
        public static int countUniqueUrls(List<String> urls) {
            Set<String> uniqueUrls = new HashSet<>();

            for (String urlString : urls) {
                try {
                    // Normalize the URL by removing the trailing slash and considering query parameters
                    URI uri = new URI(urlString);
                    String normalizedUrl = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                    if(normalizedUrl.endsWith("/") || normalizedUrl.endsWith("?")) {
                        normalizedUrl=normalizedUrl.replaceAll("[/?]$", "");
                    }
                    uniqueUrls.add(normalizedUrl);
                } catch (URISyntaxException e) {
                    // Handle invalid URLs
                    e.printStackTrace();
                }
            }
            // Return the count of unique normalized URLs
            return uniqueUrls.size();
        }

    public static void main(String[] args) {
        UniqueUrls urlCounter = new UniqueUrls();

        // Example usage
        List<String> inputUrls = List.of("https://example.com", "https://example.com/");
        List<String> inputUrls1 = List.of("https://example.com", "http://example.com");
        List<String> inputUrls2 = List.of("https://example.com?", "https://example.com");
        List<String> inputUrls3 = List.of("https://example.com?a=1&b=2", "https://example.com?b=2&a=1");
        int result = urlCounter.countUniqueUrls(inputUrls);
        int result1 = urlCounter.countUniqueUrls(inputUrls1);
        int result2 = urlCounter.countUniqueUrls(inputUrls2);
        int result3 = urlCounter.countUniqueUrls(inputUrls3);

        System.out.println("Output: " + result);
        System.out.println("Output: " + result1);
        System.out.println("Output: " + result2);
        System.out.println("Output: " + result3);
    }
}

