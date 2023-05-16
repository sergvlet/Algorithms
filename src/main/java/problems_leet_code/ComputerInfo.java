package problems_leet_code;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class ComputerInfo {
    public static void main(String[] args) throws UnknownHostException {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String userName = System.getProperty("user.name");
        String hostName = InetAddress.getLocalHost().getHostName();
        String ipAddress = InetAddress.getLocalHost().getHostAddress();

        System.out.println("Operating System: " + osName + " " + osVersion);
        System.out.println("Java Version: " + javaVersion);
        System.out.println("User Name: " + userName);
        System.out.println("Host Name: " + hostName);
        System.out.println("IP Address: " + ipAddress);
    }
}

