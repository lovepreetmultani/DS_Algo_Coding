package src.Interview_practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueUrls {

    /**
     * This function counts how many unique normalized valid URLs were passed to the function
     *
     * @param urls List of URLs
     * @return Number of unique normalized valid URLs
     */
    public int countUniqueUrls(List<String> urls) {
        Set<String> uniqueUrls = new HashSet<>();

        for (String url : urls) {
            String normalizedUrl = normalizeUrl(url);
            uniqueUrls.add(normalizedUrl);
        }

        return uniqueUrls.size();
    }

    /**
     * Normalize a URL based on the URL normalization rules.
     *
     * @param url Input URL
     * @return Normalized URL
     */
    private String normalizeUrl(String url) {
        // Implement URL normalization logic here
        // For simplicity, let's consider two URLs equal if they are the same after removing trailing slashes
        return url.replaceAll("[/?]$", "");
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
