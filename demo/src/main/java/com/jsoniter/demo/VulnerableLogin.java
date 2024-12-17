public class VulnerableLogin {
    // Hardcoded credentials (security risk)
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "password123"; // Plaintext password (security risk)

    // No encryption or hashing for sensitive data
    public String storedUsername;
    public String storedPassword;

    public VulnerableLogin() {
        // Credentials stored directly in fields (exposed to memory inspection)
        this.storedUsername = USERNAME;
        this.storedPassword = PASSWORD;
    }

    // Public method to get credentials (exposes sensitive information)
    public String getCredentials() {
        return "Username: " + storedUsername + ", Password: " + storedPassword;
    }

    public static void main(String[] args) {
        // Create an instance of the vulnerable class
        VulnerableLogin login = new VulnerableLogin();

        // Expose credentials
        System.out.println("Exposed credentials: " + login.getCredentials());
    }
}
