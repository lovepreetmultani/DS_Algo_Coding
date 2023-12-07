package src;

public class GsonProgram {

    public static void main(String[] args) {
        // Simulating API response (replace this with your actual API call)
        String apiResponse = "{ \"user\": { \"id\": 1, \"name\": \"John\", \"address\": { \"city\": \"New York\", \"zip\": \"10001\" } } }";

        // Parse the JSON response
        JsonNode rootNode = parseJson(apiResponse);
        // Access nested data or check for a specific field
        if (rootNode != null) {
            String userName = getNodeText(rootNode, "user.name");
            String city = getNodeText(rootNode, "user.address.city");

            System.out.println("User Name: " + userName);
            System.out.println("City: " + city);

            // Check for a specific field
            boolean hasZip = hasNode(rootNode, "user.address.zip");
            System.out.println("Has Zip Code: " + hasZip);
        }
    }

    // Parse JSON string and return the root node
    private static JsonNode parseJson(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Get the text value of a nested node identified by a dot-separated path
    private static String getNodeText(JsonNode rootNode, String path) {
        JsonNode node = rootNode.at(path);
        return node.isMissingNode() ? null : node.textValue();
    }

    // Check if a node exists in the JSON structure
    private static boolean hasNode(JsonNode rootNode, String path) {
        return !rootNode.at(path).isMissingNode();
    }
}
