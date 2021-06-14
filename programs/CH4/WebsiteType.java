package programs.CH4;

import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.next();
        String urlEnd = url.substring(url.lastIndexOf('.'));
        String urlType = new String();

        switch(urlEnd) {
            case ".com": urlType = "Commercial Site";break;
            case ".in": urlType = "Indian Site";break;
            case ".org": urlType = "Organizational Site";break;
            default: urlType = "Other Site";break;
        }

        System.out.println("Site Type:" + urlType);
        sc.close();
    }
}
